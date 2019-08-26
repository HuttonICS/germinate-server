/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import org.jooq.*;
import org.jooq.impl.*;

import java.sql.Date;
import java.sql.*;
import java.util.*;

import javax.annotation.Generated;

import jhi.germinate.server.database.*;
import jhi.germinate.server.database.tables.records.DatasetsRecord;


/**
 * Datasets which are defined within Germinate although there can be external 
 * datasets which are links out to external data sources most will be held 
 * within Germinate.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Datasets extends TableImpl<DatasetsRecord> {

    private static final long serialVersionUID = -226520918;

    /**
     * The reference instance of <code>germinate_template_3_7_0.datasets</code>
     */
    public static final Datasets DATASETS = new Datasets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DatasetsRecord> getRecordType() {
        return DatasetsRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.datasets.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<DatasetsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.datasets.experiment_id</code>. Foreign key to experiments (experiments.id).
     */
    public final TableField<DatasetsRecord, Integer> EXPERIMENT_ID = createField("experiment_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "Foreign key to experiments (experiments.id).");

    /**
     * The column <code>germinate_template_3_7_0.datasets.location_id</code>. Foreign key to locations (locations.id).
     */
    public final TableField<DatasetsRecord, Integer> LOCATION_ID = createField("location_id", org.jooq.impl.SQLDataType.INTEGER, this, "Foreign key to locations (locations.id).");

    /**
     * The column <code>germinate_template_3_7_0.datasets.name</code>. Describes the dataset.
     */
    public final TableField<DatasetsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "Describes the dataset.");

    /**
     * The column <code>germinate_template_3_7_0.datasets.description</code>. The name of this dataset.
     */
    public final TableField<DatasetsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "The name of this dataset.");

    /**
     * The column <code>germinate_template_3_7_0.datasets.date_start</code>. Date that the dataset was generated.
     */
    public final TableField<DatasetsRecord, Date> DATE_START = createField("date_start", org.jooq.impl.SQLDataType.DATE, this, "Date that the dataset was generated.");

    /**
     * The column <code>germinate_template_3_7_0.datasets.date_end</code>. Date at which the dataset recording ended.
     */
    public final TableField<DatasetsRecord, Date> DATE_END = createField("date_end", org.jooq.impl.SQLDataType.DATE, this, "Date at which the dataset recording ended.");

    /**
     * The column <code>germinate_template_3_7_0.datasets.source_file</code>.
     */
    public final TableField<DatasetsRecord, String> SOURCE_FILE = createField("source_file", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>germinate_template_3_7_0.datasets.datatype</code>. A description of the data type of the contained data. Examples might be: "raw data", "BLUPs", etc.
     */
    public final TableField<DatasetsRecord, String> DATATYPE = createField("datatype", org.jooq.impl.SQLDataType.VARCHAR(255), this, "A description of the data type of the contained data. Examples might be: \"raw data\", \"BLUPs\", etc.");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<DatasetsRecord, Object> DUBLIN_CORE = createField("dublin_core", org.jooq.impl.DefaultDataType.getDefaultDataType("\"germinate_template_3_7_0\".\"datasets_dublin_core\""), this, "");

    /**
     * The column <code>germinate_template_3_7_0.datasets.version</code>. Dataset version if this exists.
     */
    public final TableField<DatasetsRecord, String> VERSION = createField("version", org.jooq.impl.SQLDataType.CHAR(10), this, "Dataset version if this exists.");

    /**
     * The column <code>germinate_template_3_7_0.datasets.created_by</code>. Defines who created the dataset. This is a FK in Gatekeeper users table. Foreign key to Gatekeeper users (users.id).
     */
    public final TableField<DatasetsRecord, Integer> CREATED_BY = createField("created_by", org.jooq.impl.SQLDataType.INTEGER, this, "Defines who created the dataset. This is a FK in Gatekeeper users table. Foreign key to Gatekeeper users (users.id).");

    /**
     * The column <code>germinate_template_3_7_0.datasets.dataset_state_id</code>. Foreign key to datasetstates (datasetstates.id).
     */
    public final TableField<DatasetsRecord, Integer> DATASET_STATE_ID = createField("dataset_state_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "Foreign key to datasetstates (datasetstates.id).");

    /**
     * The column <code>germinate_template_3_7_0.datasets.license_id</code>.
     */
    public final TableField<DatasetsRecord, Integer> LICENSE_ID = createField("license_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>germinate_template_3_7_0.datasets.is_external</code>. Defines if the dataset is contained within Germinate or from an external source and not stored in the database.
     */
    public final TableField<DatasetsRecord, Byte> IS_EXTERNAL = createField("is_external", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "Defines if the dataset is contained within Germinate or from an external source and not stored in the database.");

    /**
     * The column <code>germinate_template_3_7_0.datasets.hyperlink</code>. Link to access the external dasets.
     */
    public final TableField<DatasetsRecord, String> HYPERLINK = createField("hyperlink", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Link to access the external dasets.");

    /**
     * The column <code>germinate_template_3_7_0.datasets.created_on</code>. When the record was created.

     */
    public final TableField<DatasetsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.\n");

    /**
     * The column <code>germinate_template_3_7_0.datasets.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<DatasetsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * The column <code>germinate_template_3_7_0.datasets.contact</code>. The contact to get more information about this dataset.
     */
    public final TableField<DatasetsRecord, String> CONTACT = createField("contact", org.jooq.impl.SQLDataType.VARCHAR(255), this, "The contact to get more information about this dataset.");

    /**
     * Create a <code>germinate_template_3_7_0.datasets</code> table reference
     */
    public Datasets() {
        this(DSL.name("datasets"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.datasets</code> table reference
     */
    public Datasets(String alias) {
        this(DSL.name(alias), DATASETS);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.datasets</code> table reference
     */
    public Datasets(Name alias) {
        this(alias, DATASETS);
    }

    private Datasets(Name alias, Table<DatasetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Datasets(Name alias, Table<DatasetsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Datasets which are defined within Germinate although there can be external datasets which are links out to external data sources most will be held within Germinate."));
    }

    public <O extends Record> Datasets(Table<O> child, ForeignKey<O, DatasetsRecord> key) {
        super(child, key, DATASETS);
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DATASETS_DATASETS_IBFK_2, Indexes.DATASETS_DATASETS_IBFK_3, Indexes.DATASETS_EXPERIMENT, Indexes.DATASETS_ID, Indexes.DATASETS_LICENSE_ID, Indexes.DATASETS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DatasetsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DATASETS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DatasetsRecord> getPrimaryKey() {
        return Keys.KEY_DATASETS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DatasetsRecord>> getKeys() {
        return Arrays.<UniqueKey<DatasetsRecord>>asList(Keys.KEY_DATASETS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DatasetsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DatasetsRecord, ?>>asList(Keys.DATASETS_IBFK_1, Keys.DATASETS_IBFK_3, Keys.DATASETS_IBFK_2, Keys.DATASETS_IBFK_4);
    }

    public Experiments experiments() {
        return new Experiments(this, Keys.DATASETS_IBFK_1);
    }

    public Locations locations() {
        return new Locations(this, Keys.DATASETS_IBFK_3);
    }

    public Datasetstates datasetstates() {
        return new Datasetstates(this, Keys.DATASETS_IBFK_2);
    }

    public Licenses licenses() {
        return new Licenses(this, Keys.DATASETS_IBFK_4);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Datasets as(String alias) {
        return new Datasets(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Datasets as(Name alias) {
        return new Datasets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasets rename(String name) {
        return new Datasets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasets rename(Name name) {
        return new Datasets(name, null);
    }
}
