package jhi.germinate.server.resource.germplasm;

import org.jooq.*;
import org.jooq.impl.DSL;
import org.restlet.data.Status;
import org.restlet.resource.*;

import java.sql.*;
import java.util.List;

import jhi.gatekeeper.resource.PaginatedResult;
import jhi.germinate.resource.*;
import jhi.germinate.server.Database;
import jhi.germinate.server.resource.*;
import jhi.germinate.server.resource.locations.LocationPolygonTableResource;

import static jhi.germinate.server.database.tables.ViewTableGermplasm.*;

/**
 * @author Sebastian Raubach
 */
public class GermplasmPolygonTableIdResource extends PaginatedServerResource
{
	@Post("json")
	public PaginatedResult<List<Integer>> getJson(PaginatedPolygonRequest request)
	{
		if (request.getPolygons() == null || request.getPolygons().length < 1)
			throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);

		processRequest(request);
		currentPage = 0;
		pageSize = Integer.MAX_VALUE;
		try (Connection conn = Database.getConnection();
			 DSLContext context = Database.getContext(conn))
		{
			SelectJoinStep<Record1<Integer>> from = context.selectDistinct(VIEW_TABLE_GERMPLASM.GERMPLASM_ID)
														   .from(VIEW_TABLE_GERMPLASM);

			from.where(VIEW_TABLE_GERMPLASM.LATITUDE.isNotNull()
													.and(VIEW_TABLE_GERMPLASM.LONGITUDE.isNotNull())
													.and(DSL.condition("ST_CONTAINS(ST_GeomFromText({0}), ST_GeomFromText (CONCAT( 'POINT(', `view_table_germplasm`.`longitude`, ' ', `view_table_germplasm`.`latitude`, ')')))", LocationPolygonTableResource.buildSqlPolygon(request.getPolygons()))));

			// Filter here!
			filter(from, filters);

			List<Integer> result = setPaginationAndOrderBy(from)
				.fetch()
				.into(Integer.class);

			return new PaginatedResult<>(result, result.size());
		}
		catch (SQLException e)
		{
			e.printStackTrace();
			throw new ResourceException(Status.SERVER_ERROR_INTERNAL);
		}
	}
}