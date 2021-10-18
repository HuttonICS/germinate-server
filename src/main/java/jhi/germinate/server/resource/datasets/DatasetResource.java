package jhi.germinate.server.resource.datasets;

import jhi.germinate.resource.enums.UserType;
import jhi.germinate.server.*;
import jhi.germinate.server.database.codegen.tables.pojos.*;
import jhi.germinate.server.database.codegen.tables.records.DatasetsRecord;
import jhi.germinate.server.resource.ContextResource;
import jhi.germinate.server.util.*;
import org.jooq.DSLContext;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Logger;

import static jhi.germinate.server.database.codegen.tables.Datasets.*;

@Path("dataset/{datasetId}")
@Secured(UserType.ADMIN)
public class DatasetResource extends ContextResource
{
	@PathParam("datasetId")
	private Integer datasetId;

	@PATCH
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean patchDataset(Datasets updatedDataset)
		throws SQLException, IOException
	{
		if (updatedDataset == null || StringUtils.isEmpty(updatedDataset.getName()))
		{
			resp.sendError(Response.Status.BAD_REQUEST.getStatusCode());
			return false;
		}

		AuthenticationFilter.UserDetails userDetails = (AuthenticationFilter.UserDetails) securityContext.getUserPrincipal();

		ViewTableDatasets ds = DatasetTableResource.getDatasetForId(datasetId, req, resp, userDetails, false);

		if (ds == null)
		{
			resp.sendError(Response.Status.NOT_FOUND.getStatusCode());
			return false;
		}
		else
		{
			try (Connection conn = Database.getConnection())
			{
				DSLContext context = Database.getContext(conn);

				DatasetsRecord dataset = context.selectFrom(DATASETS).where(DATASETS.ID.eq(ds.getDatasetId())).fetchAny();

				if (dataset == null)
				{
					resp.sendError(Response.Status.NOT_FOUND.getStatusCode());
					return false;
				}

				dataset.setName(updatedDataset.getName());
				dataset.setDescription(updatedDataset.getDescription());
				dataset.setDateStart(updatedDataset.getDateStart());
				dataset.setDateEnd(updatedDataset.getDateEnd());
				dataset.setDatasetStateId(updatedDataset.getDatasetStateId());
				return dataset.store() > 0;
			}
		}
	}
}