/*
 *  Copyright 2018 Information and Computational Sciences,
 *  The James Hutton Institute.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package jhi.germinate.server.util.hdf5;

import ch.systemsx.cisd.hdf5.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author The Flapjack authors (https://ics.hutton.ac.uk/flapjack)
 */
public class FJTabbedToHdf5Converter
{
	private static final String LINES       = "Lines";
	private static final String MARKERS     = "Markers";
	private static final String DATA        = "DataMatrix";
	private static final String STATE_TABLE = "StateTable";

	private File genotypeFile;
	private File hdf5File;
	private int  skipLines = 0;

	public FJTabbedToHdf5Converter(File genotypeFile, File hdf5File)
	{
		this.genotypeFile = genotypeFile;
		this.hdf5File = hdf5File;
	}

	public void setSkipLines(int skipLines)
	{
		this.skipLines = skipLines;
	}

	private void checkFileExists(File file)
	{
		if (!file.exists())
			System.err.println("Genotype file doesn't exist. Please specify a valid genotype file.");
	}

	public void convertToHdf5()
	{
		checkFileExists(genotypeFile);

		long s = System.currentTimeMillis();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(genotypeFile), StandardCharsets.UTF_8));
			 // The second reader is just to get the number of rows
			 LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(new FileInputStream(genotypeFile), StandardCharsets.UTF_8));
			 IHDF5Writer writer = HDF5Factory.open(hdf5File))
		{
			// Delete old files with this name, because otherwise the new data will get appended to the old data
			if (hdf5File.exists() && hdf5File.isFile())
				hdf5File.delete();

			LinkedHashMap<String, Byte> stateTable = new LinkedHashMap<>();
			stateTable.put("", (byte) 0);

			int counter = 0;

			// Count the number of header rows and skip them
			int offset = 0;
			String line = reader.readLine();
			while (line.length() == 0 || line.startsWith("#"))
			{
				offset++;
				line = reader.readLine();
			}

			for (int i = 0; i < skipLines; i++)
			{
				offset++;
				line = reader.readLine();
			}

			// Skip to the end
			lineNumberReader.skip(Long.MAX_VALUE);

			// Get the number of actual data rows
			int nrOfRows = lineNumberReader.getLineNumber() - 1 - offset;

			// We need to generate a mapping between the marker indices in the
			// genotype file and those in the map file
			String[] tokens = line.split("\t", -1);
			String[] markers = Arrays.copyOfRange(tokens, 1, tokens.length);

			// Here we determine the size of the chunks within the matrix.
			// HDF5 has a hard limit of 4GB per chunk, so we need to set the chunk sizes appropriately.
			// IMPORTANT: If we ever move away from using bytes for the states, then this needs to be adjusted.
			long fourGig = 4L * 1024L * 1024L * 1024L;
			// The number of rows is at least one and then depends on the number of times we can fit all the markers into 4GB
			int accessionChunk = (int) Math.min(nrOfRows, Math.max(1, Math.floor(fourGig / (markers.length * 1d))));
			// The number of columns is at most the number of markers and if the row is more than 4GB, then it's  the maximal number of columns that fit in 4GB
			int markerChunk = (int) Math.min(markers.length, fourGig);

			// Create the matrix based on the number of rows and the number of markers
			writer.int8().createMatrix(DATA, nrOfRows, markers.length, accessionChunk, markerChunk);

			// Remember the line names
			List<String> lines = new ArrayList<>();

			while ((line = reader.readLine()) != null)
			{
				if (counter % 1000 == 0)
					System.out.println("Processed: " + counter);

				String[] columns = line.split("\t", -1);

				// Remember the line name
				lines.add(columns[0]);

				// The actual SNP calls are all but the first element of the split line
				String[] snpCalls = Arrays.copyOfRange(columns, 1, columns.length);
				Stream.of(snpCalls).forEach(token -> stateTable.putIfAbsent(token, (byte) stateTable.size()));

				Byte[] bytes = Stream.of(snpCalls).map(stateTable::get).toArray(Byte[]::new);
				byte[] outBytes = convertBytesToPrimitive(bytes);

				if (outBytes.length != markers.length)
					continue;

				// Place the array in a dummy 2d array
				byte[][] outMatrixBytes = new byte[1][outBytes.length];
				outMatrixBytes[0] = outBytes;

				// Write the row as a block to the matrix
				writer.int8().writeMatrixBlock(DATA, outMatrixBytes, counter, 0);
				counter++;
			}

			// Write the marker and line names as arrays
			writer.string().writeArray(MARKERS, markers, HDF5GenericStorageFeatures.GENERIC_DEFLATE);
			writer.string().writeArray(LINES, lines.toArray(new String[0]), HDF5GenericStorageFeatures.GENERIC_DEFLATE);

			// Write the state table
			writer.string().writeArray(STATE_TABLE, stateTable.keySet().toArray(new String[0]), HDF5GenericStorageFeatures.GENERIC_DEFLATE);
		}
		catch (IOException e)
		{
			e.printStackTrace();
			System.exit(1);
		}
		System.out.println("Took: " + ((System.currentTimeMillis() - s) / 1000f));
	}

	private byte[] convertBytesToPrimitive(Byte[] bytes)
	{
		byte[] outBytes = new byte[bytes.length];
		int i = 0;
		for (Byte b : bytes)
			outBytes[i++] = b;

		return outBytes;
	}
}