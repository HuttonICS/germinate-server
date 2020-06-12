package jhi.germinate.server.resource.datasets.export;

import org.jooq.DSLContext;
import org.restlet.data.Status;
import org.restlet.resource.*;

import java.sql.*;
import java.util.*;

import jhi.germinate.resource.UuidRequest;
import jhi.germinate.server.Database;
import jhi.germinate.server.auth.*;
import jhi.germinate.server.database.enums.DatasetExportJobsStatus;
import jhi.germinate.server.database.tables.pojos.DatasetExportJobs;
import jhi.germinate.server.database.tables.records.DatasetExportJobsRecord;
import jhi.germinate.server.resource.*;
import jhi.germinate.server.util.*;

import static jhi.germinate.server.database.tables.DatasetExportJobs.*;

/**
 * @author Sebastian Raubach
 */
public class AsyncDatasetExportResource extends BaseServerResource implements AsyncResource
{
	private String jobUuid;

	@Override
	protected void doInit()
		throws ResourceException
	{
		super.doInit();

		try
		{
			this.jobUuid = getRequestAttributes().get("jobUuid").toString();

			try
			{
				// Check if it's a valid UUID
				UUID.fromString(this.jobUuid);
			}
			catch (IllegalArgumentException e)
			{
				this.jobUuid = null;
			}
		}
		catch (NullPointerException | NumberFormatException e)
		{
		}
	}

	@Delete("json")
	@FreeForAll
	public boolean deleteJson()
	{
		CustomVerifier.UserDetails userDetails = CustomVerifier.getFromSession(getRequest(), getResponse());

		if (StringUtils.isEmpty(jobUuid))
			throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);

		try (Connection conn = Database.getConnection();
			 DSLContext context = Database.getContext(conn))
		{
			DatasetExportJobsRecord record = context.selectFrom(DATASET_EXPORT_JOBS)
													.where(DATASET_EXPORT_JOBS.UUID.in(jobUuid))
													.fetchOneInto(DatasetExportJobsRecord.class);

			boolean isCancelRequest = record.getStatus() == DatasetExportJobsStatus.running;

			// If the user is logged in
			if (userDetails.getId() != -1000)
			{
				if (Objects.equals(record.getUserId(), userDetails.getId()))
				{
					if (isCancelRequest)
					{
						record.setStatus(DatasetExportJobsStatus.cancelled);
						cancelJob(record.getUuid(), record.getJobId());
					}
					record.setVisibility(false);
					record.store();
					return true;
				}
				else
					throw new ResourceException(Status.CLIENT_ERROR_FORBIDDEN); // Otherwise, throw an exception
			}
			else
			{
				if (isCancelRequest)
				{
					record.setStatus(DatasetExportJobsStatus.cancelled);
					cancelJob(record.getUuid(), record.getJobId());
				}
				record.setVisibility(false);
				record.store();
				return true;
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
		}
	}

	@Post("json")
	@FreeForAll
	public List<DatasetExportJobs> postJson(UuidRequest request)
	{
		CustomVerifier.UserDetails userDetails = CustomVerifier.getFromSession(getRequest(), getResponse());

		if (CollectionUtils.isEmpty(request.getUuids()) && (userDetails.getId() == -1000))
			return new ArrayList<>();

		try (Connection conn = Database.getConnection();
			 DSLContext context = Database.getContext(conn))
		{
			return context.selectFrom(DATASET_EXPORT_JOBS)
						  .where(DATASET_EXPORT_JOBS.UUID.in(request.getUuids())
														 .or(DATASET_EXPORT_JOBS.USER_ID.eq(userDetails.getId())))
						  .and(DATASET_EXPORT_JOBS.VISIBILITY.eq(true))
						  .orderBy(DATASET_EXPORT_JOBS.UPDATED_ON.desc())
						  .fetchInto(DatasetExportJobs.class);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
		}
	}
}
