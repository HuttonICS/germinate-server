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
import jhi.germinate.server.database.tables.records.CommenttypesRecord;


/**
 * Defines the comment type.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Commenttypes extends TableImpl<CommenttypesRecord> {

    private static final long serialVersionUID = -1711937381;

    /**
     * The reference instance of <code>germinate_template_3_7_0.commenttypes</code>
     */
    public static final Commenttypes COMMENTTYPES = new Commenttypes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CommenttypesRecord> getRecordType() {
        return CommenttypesRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.commenttypes.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<CommenttypesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.commenttypes.description</code>. Describes the comment type.
     */
    public final TableField<CommenttypesRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "Describes the comment type.");

    /**
     * The column <code>germinate_template_3_7_0.commenttypes.reference_table</code>. This could include 'germinatebase' or 'markers' to define the table that the comment relates to.
     */
    public final TableField<CommenttypesRecord, String> REFERENCE_TABLE = createField("reference_table", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "This could include 'germinatebase' or 'markers' to define the table that the comment relates to.");

    /**
     * The column <code>germinate_template_3_7_0.commenttypes.created_on</code>. When the record was created.
     */
    public final TableField<CommenttypesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.commenttypes.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<CommenttypesRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.commenttypes</code> table reference
     */
    public Commenttypes() {
        this(DSL.name("commenttypes"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.commenttypes</code> table reference
     */
    public Commenttypes(String alias) {
        this(DSL.name(alias), COMMENTTYPES);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.commenttypes</code> table reference
     */
    public Commenttypes(Name alias) {
        this(alias, COMMENTTYPES);
    }

    private Commenttypes(Name alias, Table<CommenttypesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Commenttypes(Name alias, Table<CommenttypesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Defines the comment type."));
    }

    public <O extends Record> Commenttypes(Table<O> child, ForeignKey<O, CommenttypesRecord> key) {
        super(child, key, COMMENTTYPES);
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
        return Arrays.<Index>asList(Indexes.COMMENTTYPES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CommenttypesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COMMENTTYPES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CommenttypesRecord> getPrimaryKey() {
        return Keys.KEY_COMMENTTYPES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CommenttypesRecord>> getKeys() {
        return Arrays.<UniqueKey<CommenttypesRecord>>asList(Keys.KEY_COMMENTTYPES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Commenttypes as(String alias) {
        return new Commenttypes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Commenttypes as(Name alias) {
        return new Commenttypes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Commenttypes rename(String name) {
        return new Commenttypes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Commenttypes rename(Name name) {
        return new Commenttypes(name, null);
    }
}
