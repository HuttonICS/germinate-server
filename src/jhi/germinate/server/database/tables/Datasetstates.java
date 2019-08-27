/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import org.jooq.*;
import org.jooq.impl.*;

import java.sql.Timestamp;
import java.util.*;

import javax.annotation.Generated;

import jhi.germinate.server.database.GerminateTemplate_3_7_0;
import jhi.germinate.server.database.tables.records.DatasetstatesRecord;


// @formatter:off
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
public class Datasetstates extends TableImpl<DatasetstatesRecord> {

    private static final long serialVersionUID = -1556472231;

    /**
     * The reference instance of <code>germinate_template_3_7_0.datasetstates</code>
     */
    public static final Datasetstates DATASETSTATES = new Datasetstates();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DatasetstatesRecord> getRecordType() {
        return DatasetstatesRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.datasetstates.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<DatasetstatesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.datasetstates.name</code>. Defines the datasetstate.
     */
    public final TableField<DatasetstatesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "Defines the datasetstate.");

    /**
     * The column <code>germinate_template_3_7_0.datasetstates.description</code>. Describes the datasetstate.
     */
    public final TableField<DatasetstatesRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Describes the datasetstate.");

    /**
     * The column <code>germinate_template_3_7_0.datasetstates.created_on</code>. When the record was created.
     */
    public final TableField<DatasetstatesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.datasetstates.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<DatasetstatesRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.datasetstates</code> table reference
     */
    public Datasetstates() {
        this(DSL.name("datasetstates"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.datasetstates</code> table reference
     */
    public Datasetstates(String alias) {
        this(DSL.name(alias), DATASETSTATES);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.datasetstates</code> table reference
     */
    public Datasetstates(Name alias) {
        this(alias, DATASETSTATES);
    }

    private Datasetstates(Name alias, Table<DatasetstatesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Datasetstates(Name alias, Table<DatasetstatesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
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
    public Identity<DatasetstatesRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.tables.Datasetstates.DATASETSTATES, jhi.germinate.server.database.tables.Datasetstates.DATASETSTATES.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DatasetstatesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.tables.Datasetstates.DATASETSTATES, "KEY_datasetstates_PRIMARY", jhi.germinate.server.database.tables.Datasetstates.DATASETSTATES.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DatasetstatesRecord>> getKeys() {
        return Arrays.<UniqueKey<DatasetstatesRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.tables.Datasetstates.DATASETSTATES, "KEY_datasetstates_PRIMARY", jhi.germinate.server.database.tables.Datasetstates.DATASETSTATES.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Datasetstates as(String alias) {
        return new Datasetstates(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Datasetstates as(Name alias) {
        return new Datasetstates(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasetstates rename(String name) {
        return new Datasetstates(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Datasetstates rename(Name name) {
        return new Datasetstates(name, null);
    }
// @formatter:on
}
