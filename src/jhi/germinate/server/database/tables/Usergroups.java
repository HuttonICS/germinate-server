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
import jhi.germinate.server.database.tables.records.UsergroupsRecord;


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
public class Usergroups extends TableImpl<UsergroupsRecord> {

    private static final long serialVersionUID = -209508857;

    /**
     * The reference instance of <code>germinate_template_3_7_0.usergroups</code>
     */
    public static final Usergroups USERGROUPS = new Usergroups();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsergroupsRecord> getRecordType() {
        return UsergroupsRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.usergroups.id</code>.
     */
    public final TableField<UsergroupsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_template_3_7_0.usergroups.name</code>. The name of the user group.
     */
    public final TableField<UsergroupsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "The name of the user group.");

    /**
     * The column <code>germinate_template_3_7_0.usergroups.description</code>. A description of the user group.
     */
    public final TableField<UsergroupsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "A description of the user group.");

    /**
     * The column <code>germinate_template_3_7_0.usergroups.created_on</code>. When the record was created.
     */
    public final TableField<UsergroupsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.usergroups.updated_on</code>. When the record was updated. This may be different from the created on date if changes have been made subsequently to the underlying record.
     */
    public final TableField<UsergroupsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if changes have been made subsequently to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.usergroups</code> table reference
     */
    public Usergroups() {
        this(DSL.name("usergroups"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.usergroups</code> table reference
     */
    public Usergroups(String alias) {
        this(DSL.name(alias), USERGROUPS);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.usergroups</code> table reference
     */
    public Usergroups(Name alias) {
        this(alias, USERGROUPS);
    }

    private Usergroups(Name alias, Table<UsergroupsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Usergroups(Name alias, Table<UsergroupsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<UsergroupsRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.tables.Usergroups.USERGROUPS, jhi.germinate.server.database.tables.Usergroups.USERGROUPS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UsergroupsRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.tables.Usergroups.USERGROUPS, "KEY_usergroups_PRIMARY", jhi.germinate.server.database.tables.Usergroups.USERGROUPS.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UsergroupsRecord>> getKeys() {
        return Arrays.<UniqueKey<UsergroupsRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.tables.Usergroups.USERGROUPS, "KEY_usergroups_PRIMARY", jhi.germinate.server.database.tables.Usergroups.USERGROUPS.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Usergroups as(String alias) {
        return new Usergroups(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Usergroups as(Name alias) {
        return new Usergroups(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Usergroups rename(String name) {
        return new Usergroups(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Usergroups rename(Name name) {
        return new Usergroups(name, null);
    }
// @formatter:on
}
