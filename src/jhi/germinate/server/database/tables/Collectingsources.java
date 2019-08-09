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
 * The coding scheme proposed can be used at 2 different levels of detail: 
 * either by using the
 * general codes such as 10, 20, 30, 40, etc., or by using the more specific 
 * codes,
 * such as 11, 12, etc. See Multi Crop Passport Descriptors (MCPD V2 2012) 
 * for further definitions.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Collectingsources extends TableImpl<CollectingsourcesRecord> {

    private static final long serialVersionUID = -1225076071;

    /**
     * The reference instance of <code>germinate_template_3_6_0.collectingsources</code>
     */
    public static final Collectingsources COLLECTINGSOURCES = new Collectingsources();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CollectingsourcesRecord> getRecordType() {
        return CollectingsourcesRecord.class;
    }

    /**
     * The column <code>germinate_template_3_6_0.collectingsources.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<CollectingsourcesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_6_0.collectingsources.collsrc</code>. collsrc in the Multi Crop Passport Descriptors (MCPD V2 2012)

     */
    public final TableField<CollectingsourcesRecord, String> COLLSRC = createField("collsrc", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "collsrc in the Multi Crop Passport Descriptors (MCPD V2 2012)\n");

    /**
     * The column <code>germinate_template_3_6_0.collectingsources.created_on</code>. When the record was created.
     */
    public final TableField<CollectingsourcesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_6_0.collectingsources.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<CollectingsourcesRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_6_0.collectingsources</code> table reference
     */
    public Collectingsources() {
        this(DSL.name("collectingsources"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_6_0.collectingsources</code> table reference
     */
    public Collectingsources(String alias) {
        this(DSL.name(alias), COLLECTINGSOURCES);
    }

    /**
     * Create an aliased <code>germinate_template_3_6_0.collectingsources</code> table reference
     */
    public Collectingsources(Name alias) {
        this(alias, COLLECTINGSOURCES);
    }

    private Collectingsources(Name alias, Table<CollectingsourcesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Collectingsources(Name alias, Table<CollectingsourcesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("The coding scheme proposed can be used at 2 different levels of detail: either by using the\r\ngeneral codes such as 10, 20, 30, 40, etc., or by using the more specific codes,\r\nsuch as 11, 12, etc. See Multi Crop Passport Descriptors (MCPD V2 2012) for further definitions."));
    }

    public <O extends Record> Collectingsources(Table<O> child, ForeignKey<O, CollectingsourcesRecord> key) {
        super(child, key, COLLECTINGSOURCES);
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
        return Arrays.<Index>asList(Indexes.COLLECTINGSOURCES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CollectingsourcesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COLLECTINGSOURCES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CollectingsourcesRecord> getPrimaryKey() {
        return Keys.KEY_COLLECTINGSOURCES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CollectingsourcesRecord>> getKeys() {
        return Arrays.<UniqueKey<CollectingsourcesRecord>>asList(Keys.KEY_COLLECTINGSOURCES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collectingsources as(String alias) {
        return new Collectingsources(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collectingsources as(Name alias) {
        return new Collectingsources(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Collectingsources rename(String name) {
        return new Collectingsources(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Collectingsources rename(Name name) {
        return new Collectingsources(name, null);
    }
}
