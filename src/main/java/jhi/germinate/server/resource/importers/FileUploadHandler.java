package jhi.germinate.server.resource.importers;

import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.io.FileUtils;
import org.restlet.data.*;
import org.restlet.ext.fileupload.RestletFileUpload;
import org.restlet.representation.Representation;
import org.restlet.resource.ResourceException;

import java.io.*;
import java.util.*;

/**
 * @author Sebastian Raubach
 */
public class FileUploadHandler
{
	public static String handle(Representation entity, String formIdentifier, File target)
	{
		if (entity != null)
		{
			if (MediaType.MULTIPART_FORM_DATA.equals(entity.getMediaType(), true))
			{
				// 1. Create a factory for disk-based file items
				DiskFileItemFactory factory = new DiskFileItemFactory();
				factory.setSizeThreshold(1000240);

				// 2. Create a new file upload handler based on the Restlet FileUpload extension that will parse Restlet requests and generates FileItems.
				RestletFileUpload upload = new RestletFileUpload(factory);

				try
				{
					// 3. Request is parsed by the handler which generates a list of FileItems
					FileItemIterator fileIterator = upload.getItemIterator(entity);

					// Process only the uploaded item with the given name and return back
					while (fileIterator.hasNext())
					{
						FileItemStream fi = fileIterator.next();
						if (fi.getFieldName().equals(formIdentifier))
						{
							// consume the stream immediately, otherwise the stream
							// will be closed.
							FileUtils.copyInputStreamToFile(fi.openStream(), target);
							return fi.getName();
						}
					}

					// If we get here, the file wasn't found
					throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
				}
				catch (IOException | FileUploadException e)
				{
					e.printStackTrace();
					throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
				}
			}
			else
			{
				// POST request with no entity.
				throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
			}
		}
		else
		{
			throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
		}
	}

	public static ReaderResult readAllLines(Representation entity, String formIdentifier, String column)
	{
		if (entity != null)
		{
			if (MediaType.MULTIPART_FORM_DATA.equals(entity.getMediaType(), true))
			{
				// 1. Create a factory for disk-based file items
				DiskFileItemFactory factory = new DiskFileItemFactory();
				factory.setSizeThreshold(1000240);

				// 2. Create a new file upload handler based on the Restlet FileUpload extension that will parse Restlet requests and generates FileItems.
				RestletFileUpload upload = new RestletFileUpload(factory);

				try
				{
					// 3. Request is parsed by the handler which generates a list of FileItems
					FileItemIterator fileIterator = upload.getItemIterator(entity);

					ReaderResult result = new ReaderResult();
					boolean found = false;
					// Process only the uploaded item with the given name and return back
					while (fileIterator.hasNext())
					{
						FileItemStream fi = fileIterator.next();
						if (fi.getFieldName().equals(formIdentifier))
						{
							// consume the stream immediately, otherwise the stream
							// will be closed.
							try (BufferedReader br = new BufferedReader(new InputStreamReader(fi.openStream())))
							{
								String line;

								while ((line = br.readLine()) != null)
									result.lines.add(line);

								found = true;
							}
						}
						else if (fi.getFieldName().equals(column))
						{
							// consume the stream immediately, otherwise the stream
							// will be closed.
							try (BufferedReader br = new BufferedReader(new InputStreamReader(fi.openStream())))
							{
								String line;

								if ((line = br.readLine()) != null)
									result.column = line;
							}
						}
					}

					if (!found)
					{
						// If we get here, the file wasn't found
						throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
					}
					else
					{
						return result;
					}
				}
				catch (IOException | FileUploadException e)
				{
					e.printStackTrace();
					throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
				}
			}
			else
			{
				// POST request with no entity.
				throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
			}
		}
		else
		{
			throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
		}
	}

	public static class ReaderResult
	{
		private List<String> lines  = new ArrayList<>();
		private String       column = null;

		public List<String> getLines()
		{
			return lines;
		}

		public String getColumn()
		{
			return column;
		}
	}
}
