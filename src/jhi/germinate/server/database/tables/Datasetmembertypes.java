/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import org.jooq.*;
import org.jooq.impl.*;

import java.sql.*;
import java.util.*;

import javax.annotation.*;

import jhi.germinate.server.database.*;
import jhi.germinate.server.database.tables.records.*;


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
public class Datasetmembertypes extends TableImpl<DatasetmembertypesRecord> {

    private static final long serialVersionUID = -1573247326;

    /**
     * The reference instance of <code>germinate_template_3_6_0.datasetmembertypes</code>
     */
    public static final Datasetmembertypes DATASETMEMBERTYPES = new Datasetmembertypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DatasetmembertypesRecord> getRecordType() {
        return DatasetmembertypesRecord.class;
    }

    /**
     * The column <code>germinate_template_3_6_0.datasetmembertypes.id</code>.
     */
    public final TableField<DatasetmembertypesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_template_3_6_0.datasetmembertypes.target_table</code>.
     */
    public final TableField<DatasetmembertypesRecord, String> TARGET_TABLE = createField("target_table", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>germinate_template_3_6_0.datasetmembertypes.created_on</code>. When the record was created.
     */
    public final TableField<DatasetmembertypesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_6_0.datasetmembertypes.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<DatasetmembertypesRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_6_0.datasetmembertypes</code> table reference
     */
    public Datasetmembertypes() {
        this(DSL.name("datasetmembertypes"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_6_0.datasetmembertypes</code> table reference
     */
    public Datasetmembertypes(String alias) {
        this(DSL.name(alias), DATASETMEMBERTYPES);
    }

    /**
     * Create an aliased <code>germinate_template_3_6_0.datasetmembertypes</code> table reference
     */
    public Datasetmembertypes(Name alias) {
        this(alias, DATASETMEMBERTYPES);
    }

    private Datasetmembertypes(Name alias, Table<DatasetmembertypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Datasetmembertypes(Name alias, Table<DatasetmembertypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Datasetmembertypes(Table<O> child, ForeignKey<O, DatasetmembertypesRecord> key) {
        super(child, key, DATASETMEMBERTYPES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return GerminateTemplate_3_6_0.GERMINATE_TEMPLATE_3_6_0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DATASETMEMBERTYPES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DatasetmembertypesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DATASETMEMBERTYPES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DatasetmembertypesRecord> getPrimaryKey() {
        return Keys.KEY_DATASETMEMBERTYPES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DatasetmembertypesRecord>> getKeys() {
        return Arrays.<UniqueKey<DatasetmembertypesRecord>>asList(Keys.KEY_DATASETMEMBERTYPES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Datasetmembertypes as(String alias) {
        return new Datasetmembertypes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Datasetmembertypes as(Name alias) {
        return new Datasetmembertypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasetmembertypes rename(String name) {
        return new Datasetmembertypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasetmembertypes rename(Name name) {
        return new Datasetmembertypes(name, null);
    }
}
