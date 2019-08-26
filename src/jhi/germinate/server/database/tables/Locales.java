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
import jhi.germinate.server.database.tables.records.LocalesRecord;


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
public class Locales extends TableImpl<LocalesRecord> {

    private static final long serialVersionUID = -854631051;

    /**
     * The reference instance of <code>germinate_template_3_7_0.locales</code>
     */
    public static final Locales LOCALES = new Locales();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LocalesRecord> getRecordType() {
        return LocalesRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.locales.id</code>.
     */
    public final TableField<LocalesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_template_3_7_0.locales.name</code>.
     */
    public final TableField<LocalesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>germinate_template_3_7_0.locales.description</code>.
     */
    public final TableField<LocalesRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>germinate_template_3_7_0.locales.created_on</code>. When the record was created.
     */
    public final TableField<LocalesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.locales.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<LocalesRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.locales</code> table reference
     */
    public Locales() {
        this(DSL.name("locales"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.locales</code> table reference
     */
    public Locales(String alias) {
        this(DSL.name(alias), LOCALES);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.locales</code> table reference
     */
    public Locales(Name alias) {
        this(alias, LOCALES);
    }

    private Locales(Name alias, Table<LocalesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Locales(Name alias, Table<LocalesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Locales(Table<O> child, ForeignKey<O, LocalesRecord> key) {
        super(child, key, LOCALES);
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
        return Arrays.<Index>asList(Indexes.LOCALES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LocalesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LOCALES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LocalesRecord> getPrimaryKey() {
        return Keys.KEY_LOCALES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LocalesRecord>> getKeys() {
        return Arrays.<UniqueKey<LocalesRecord>>asList(Keys.KEY_LOCALES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Locales as(String alias) {
        return new Locales(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Locales as(Name alias) {
        return new Locales(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Locales rename(String name) {
        return new Locales(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Locales rename(Name name) {
        return new Locales(name, null);
    }
}
