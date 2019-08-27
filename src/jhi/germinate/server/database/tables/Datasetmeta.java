/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import org.jooq.*;
import org.jooq.impl.*;
import org.jooq.types.ULong;

import java.sql.Timestamp;
import java.util.*;

import javax.annotation.Generated;

import jhi.germinate.server.database.GerminateTemplate_3_7_0;
import jhi.germinate.server.database.tables.records.DatasetmetaRecord;


// @formatter:off
/**
 * Defines dataset sizes for the items in the datasets table. This table is 
 * automatically updated every hour.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Datasetmeta extends TableImpl<DatasetmetaRecord> {

    private static final long serialVersionUID = 1427450907;

    /**
     * The reference instance of <code>germinate_template_3_7_0.datasetmeta</code>
     */
    public static final Datasetmeta DATASETMETA = new Datasetmeta();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DatasetmetaRecord> getRecordType() {
        return DatasetmetaRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.datasetmeta.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<DatasetmetaRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.datasetmeta.dataset_id</code>. Foreign key to [datasets] ([datasets].id).
     */
    public final TableField<DatasetmetaRecord, Integer> DATASET_ID = createField("dataset_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key to [datasets] ([datasets].id).");

    /**
     * The column <code>germinate_template_3_7_0.datasetmeta.nr_of_data_objects</code>. The number of data objects contained in this dataset.
     */
    public final TableField<DatasetmetaRecord, ULong> NR_OF_DATA_OBJECTS = createField("nr_of_data_objects", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "The number of data objects contained in this dataset.");

    /**
     * The column <code>germinate_template_3_7_0.datasetmeta.nr_of_data_points</code>. The number of individual data points contained in this dataset.
     */
    public final TableField<DatasetmetaRecord, ULong> NR_OF_DATA_POINTS = createField("nr_of_data_points", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "The number of individual data points contained in this dataset.");

    /**
     * The column <code>germinate_template_3_7_0.datasetmeta.created_on</code>. When the record was created.
     */
    public final TableField<DatasetmetaRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.datasetmeta.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<DatasetmetaRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.datasetmeta</code> table reference
     */
    public Datasetmeta() {
        this(DSL.name("datasetmeta"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.datasetmeta</code> table reference
     */
    public Datasetmeta(String alias) {
        this(DSL.name(alias), DATASETMETA);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.datasetmeta</code> table reference
     */
    public Datasetmeta(Name alias) {
        this(alias, DATASETMETA);
    }

    private Datasetmeta(Name alias, Table<DatasetmetaRecord> aliased) {
        this(alias, aliased, null);
    }

    private Datasetmeta(Name alias, Table<DatasetmetaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Defines dataset sizes for the items in the datasets table. This table is automatically updated every hour."));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return GerminateTemplate_3_7_0.GERMINATE_TEMPLATE_3_7_0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DatasetmetaRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.tables.Datasetmeta.DATASETMETA, jhi.germinate.server.database.tables.Datasetmeta.DATASETMETA.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DatasetmetaRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.tables.Datasetmeta.DATASETMETA, "KEY_datasetmeta_PRIMARY", jhi.germinate.server.database.tables.Datasetmeta.DATASETMETA.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DatasetmetaRecord>> getKeys() {
        return Arrays.<UniqueKey<DatasetmetaRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.tables.Datasetmeta.DATASETMETA, "KEY_datasetmeta_PRIMARY", jhi.germinate.server.database.tables.Datasetmeta.DATASETMETA.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Datasetmeta as(String alias) {
        return new Datasetmeta(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Datasetmeta as(Name alias) {
        return new Datasetmeta(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasetmeta rename(String name) {
        return new Datasetmeta(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasetmeta rename(Name name) {
        return new Datasetmeta(name, null);
    }
// @formatter:on
}
