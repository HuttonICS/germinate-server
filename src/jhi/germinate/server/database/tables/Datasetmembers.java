/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import org.jooq.*;
import org.jooq.impl.*;

import java.sql.Timestamp;
import java.util.*;

import javax.annotation.Generated;

import jhi.germinate.server.database.*;
import jhi.germinate.server.database.tables.records.DatasetmembersRecord;


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
public class Datasetmembers extends TableImpl<DatasetmembersRecord> {

    private static final long serialVersionUID = -1755873014;

    /**
     * The reference instance of <code>germinate_template_3_7_0.datasetmembers</code>
     */
    public static final Datasetmembers DATASETMEMBERS = new Datasetmembers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DatasetmembersRecord> getRecordType() {
        return DatasetmembersRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.datasetmembers.id</code>.
     */
    public final TableField<DatasetmembersRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_template_3_7_0.datasetmembers.dataset_id</code>.
     */
    public final TableField<DatasetmembersRecord, Integer> DATASET_ID = createField("dataset_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_template_3_7_0.datasetmembers.foreign_id</code>.
     */
    public final TableField<DatasetmembersRecord, Integer> FOREIGN_ID = createField("foreign_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_template_3_7_0.datasetmembers.datasetmembertype_id</code>.
     */
    public final TableField<DatasetmembersRecord, Integer> DATASETMEMBERTYPE_ID = createField("datasetmembertype_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_template_3_7_0.datasetmembers.created_on</code>. When the record was created.
     */
    public final TableField<DatasetmembersRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.datasetmembers.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<DatasetmembersRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.datasetmembers</code> table reference
     */
    public Datasetmembers() {
        this(DSL.name("datasetmembers"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.datasetmembers</code> table reference
     */
    public Datasetmembers(String alias) {
        this(DSL.name(alias), DATASETMEMBERS);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.datasetmembers</code> table reference
     */
    public Datasetmembers(Name alias) {
        this(alias, DATASETMEMBERS);
    }

    private Datasetmembers(Name alias, Table<DatasetmembersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Datasetmembers(Name alias, Table<DatasetmembersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Datasetmembers(Table<O> child, ForeignKey<O, DatasetmembersRecord> key) {
        super(child, key, DATASETMEMBERS);
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
        return Arrays.<Index>asList(Indexes.DATASETMEMBERS_DATASETMEMBERTYPE_ID, Indexes.DATASETMEMBERS_DATASET_ID, Indexes.DATASETMEMBERS_DATASET_ID_2, Indexes.DATASETMEMBERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DatasetmembersRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DATASETMEMBERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DatasetmembersRecord> getPrimaryKey() {
        return Keys.KEY_DATASETMEMBERS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DatasetmembersRecord>> getKeys() {
        return Arrays.<UniqueKey<DatasetmembersRecord>>asList(Keys.KEY_DATASETMEMBERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DatasetmembersRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DatasetmembersRecord, ?>>asList(Keys.DATASETMEMBERS_IBFK_1, Keys.DATASETMEMBERS_IBFK_2);
    }

    public Datasets datasets() {
        return new Datasets(this, Keys.DATASETMEMBERS_IBFK_1);
    }

    public Datasetmembertypes datasetmembertypes() {
        return new Datasetmembertypes(this, Keys.DATASETMEMBERS_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Datasetmembers as(String alias) {
        return new Datasetmembers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Datasetmembers as(Name alias) {
        return new Datasetmembers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasetmembers rename(String name) {
        return new Datasetmembers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasetmembers rename(Name name) {
        return new Datasetmembers(name, null);
    }
}
