package jhi.germinate.server.resource.germplasm;

import org.jooq.*;
import org.restlet.data.Status;
import org.restlet.resource.*;

import java.io.IOException;
import java.nio.file.Files;
import java.sql.*;
import java.util.List;

import jhi.gatekeeper.resource.PaginatedResult;
import jhi.germinate.resource.PaginatedRequest;
import jhi.germinate.server.Database;
import jhi.germinate.server.database.tables.pojos.ViewTableGermplasm;
import jhi.germinate.server.resource.PaginatedServerResource;
import jhi.germinate.server.util.*;

import static jhi.germinate.server.database.tables.ViewTableGermplasm.*;

/**
 * @author Sebastian Raubach
 */
public class GermplasmTableResource extends PaginatedServerResource
{
	public static final String PARAM_NAMES_FROM_FILE = "namesFromFile";

	private String namesFromFile;

	@Override
	protected void doInit()
		throws ResourceException
	{
		super.doInit();

		this.namesFromFile = getQueryValue(PARAM_NAMES_FROM_FILE);
	}

	@Post("json")
	public PaginatedResult<List<ViewTableGermplasm>> getJson(PaginatedRequest request)
	{
		processRequest(request);
		try (Connection conn = Database.getConnection();
			 DSLContext context = Database.getContext(conn))
		{
			SelectSelectStep<Record> select = context.select();

			if (previousCount == -1)
				select.hint("SQL_CALC_FOUND_ROWS");

			SelectJoinStep<Record> from = select.from(VIEW_TABLE_GERMPLASM);

			// Add an additional filter based on the names in the file uploaded from CurlyWhirly
			if (!StringUtils.isEmpty(namesFromFile))
			{
				try
				{
					List<String> names = Files.readAllLines(getTempDir(namesFromFile).toPath());

					if (!CollectionUtils.isEmpty(names))
						from.where(VIEW_TABLE_GERMPLASM.GERMPLASM_NAME.in(names));
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}

			// Filter here!
			filter(from, filters);

			List<ViewTableGermplasm> result = setPaginationAndOrderBy(from)
				.fetch()
				.into(ViewTableGermplasm.class);

			long count = previousCount == -1 ? context.fetchOne("SELECT FOUND_ROWS()").into(Long.class) : previousCount;

			return new PaginatedResult<>(result, count);
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
		}
	}
}