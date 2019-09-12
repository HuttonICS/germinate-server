/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.routines;


import javax.annotation.Generated;

import jhi.germinate.server.database.GerminateTemplate_3_7_0;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExportCompoundData extends AbstractRoutine<java.lang.Void> {

    /**
     * The parameter <code>germinate_template_3_7_0.export_compound_data.groupIds</code>.
     */
    public static final Parameter<String> GROUPIDS = Internal.createParameter("groupIds", org.jooq.impl.SQLDataType.CLOB, false, false);
    /**
     * The parameter <code>germinate_template_3_7_0.export_compound_data.markedIds</code>.
     */
    public static final Parameter<String> MARKEDIDS = Internal.createParameter("markedIds", org.jooq.impl.SQLDataType.CLOB, false, false);
    /**
     * The parameter <code>germinate_template_3_7_0.export_compound_data.datasetIds</code>.
     */
    public static final Parameter<String> DATASETIDS = Internal.createParameter("datasetIds", org.jooq.impl.SQLDataType.CLOB, false, false);
    /**
     * The parameter <code>germinate_template_3_7_0.export_compound_data.compoundIds</code>.
     */
    public static final Parameter<String> COMPOUNDIDS = Internal.createParameter("compoundIds", org.jooq.impl.SQLDataType.CLOB, false, false);
    private static final long serialVersionUID = -1374835788;

    /**
     * Create a new routine call instance
     */
    public ExportCompoundData() {
        super("export_compound_data", GerminateTemplate_3_7_0.GERMINATE_TEMPLATE_3_7_0);

        addInParameter(GROUPIDS);
        addInParameter(MARKEDIDS);
        addInParameter(DATASETIDS);
        addInParameter(COMPOUNDIDS);
    }

    /**
     * Set the <code>groupIds</code> parameter IN value to the routine
     */
    public void setGroupids(String value) {
        setValue(GROUPIDS, value);
    }

    /**
     * Set the <code>markedIds</code> parameter IN value to the routine
     */
    public void setMarkedids(String value) {
        setValue(MARKEDIDS, value);
    }

    /**
     * Set the <code>datasetIds</code> parameter IN value to the routine
     */
    public void setDatasetids(String value) {
        setValue(DATASETIDS, value);
    }

    /**
     * Set the <code>compoundIds</code> parameter IN value to the routine
     */
    public void setCompoundids(String value) {
        setValue(COMPOUNDIDS, value);
    }
}
