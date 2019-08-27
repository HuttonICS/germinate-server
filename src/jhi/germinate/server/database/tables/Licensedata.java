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
import jhi.germinate.server.database.tables.records.LicensedataRecord;


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
public class Licensedata extends TableImpl<LicensedataRecord> {

    private static final long serialVersionUID = 38570510;

    /**
     * The reference instance of <code>germinate_template_3_7_0.licensedata</code>
     */
    public static final Licensedata LICENSEDATA = new Licensedata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LicensedataRecord> getRecordType() {
        return LicensedataRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.licensedata.id</code>.
     */
    public final TableField<LicensedataRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>germinate_template_3_7_0.licensedata.license_id</code>.
     */
    public final TableField<LicensedataRecord, Integer> LICENSE_ID = createField("license_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_template_3_7_0.licensedata.locale_id</code>.
     */
    public final TableField<LicensedataRecord, Integer> LOCALE_ID = createField("locale_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>germinate_template_3_7_0.licensedata.content</code>.
     */
    public final TableField<LicensedataRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>germinate_template_3_7_0.licensedata.created_on</code>. When the record was created.
     */
    public final TableField<LicensedataRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.licensedata.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<LicensedataRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.licensedata</code> table reference
     */
    public Licensedata() {
        this(DSL.name("licensedata"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.licensedata</code> table reference
     */
    public Licensedata(String alias) {
        this(DSL.name(alias), LICENSEDATA);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.licensedata</code> table reference
     */
    public Licensedata(Name alias) {
        this(alias, LICENSEDATA);
    }

    private Licensedata(Name alias, Table<LicensedataRecord> aliased) {
        this(alias, aliased, null);
    }

    private Licensedata(Name alias, Table<LicensedataRecord> aliased, Field<?>[] parameters) {
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
    public Identity<LicensedataRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.tables.Licensedata.LICENSEDATA, jhi.germinate.server.database.tables.Licensedata.LICENSEDATA.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LicensedataRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.tables.Licensedata.LICENSEDATA, "KEY_licensedata_PRIMARY", jhi.germinate.server.database.tables.Licensedata.LICENSEDATA.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LicensedataRecord>> getKeys() {
        return Arrays.<UniqueKey<LicensedataRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.tables.Licensedata.LICENSEDATA, "KEY_licensedata_PRIMARY", jhi.germinate.server.database.tables.Licensedata.LICENSEDATA.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Licensedata as(String alias) {
        return new Licensedata(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Licensedata as(Name alias) {
        return new Licensedata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Licensedata rename(String name) {
        return new Licensedata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Licensedata rename(Name name) {
        return new Licensedata(name, null);
    }
// @formatter:on
}
