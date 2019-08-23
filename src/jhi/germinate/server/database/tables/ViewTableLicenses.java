/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import org.jooq.*;
import org.jooq.impl.*;

import javax.annotation.*;

import jhi.germinate.server.database.*;
import jhi.germinate.server.database.tables.records.*;


/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableLicenses extends TableImpl<ViewTableLicensesRecord> {

    /**
     * The reference instance of <code>germinate_template_3_7_0.view_table_licenses</code>
     */
    public static final ViewTableLicenses VIEW_TABLE_LICENSES = new ViewTableLicenses();
    private static final long serialVersionUID = -1498380859;
    /**
     * The column <code>germinate_template_3_7_0.view_table_licenses.licenseId</code>.
     */
    public final TableField<ViewTableLicensesRecord, Integer> LICENSEID = createField("licenseId", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");
    /**
     * The column <code>germinate_template_3_7_0.view_table_licenses.licenseName</code>.
     */
    public final TableField<ViewTableLicensesRecord, String> LICENSENAME = createField("licenseName", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");
    /**
     * The column <code>germinate_template_3_7_0.view_table_licenses.licenseDescription</code>.
     */
    public final TableField<ViewTableLicensesRecord, String> LICENSEDESCRIPTION = createField("licenseDescription", org.jooq.impl.SQLDataType.CLOB, this, "");
    /**
     * The column <code>germinate_template_3_7_0.view_table_licenses.licenseContent</code>.
     */
    public final TableField<ViewTableLicensesRecord, String> LICENSECONTENT = createField("licenseContent", org.jooq.impl.SQLDataType.CLOB, this, "");
    /**
     * The column <code>germinate_template_3_7_0.view_table_licenses.localeName</code>.
     */
    public final TableField<ViewTableLicensesRecord, String> LOCALENAME = createField("localeName", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");
    /**
     * The column <code>germinate_template_3_7_0.view_table_licenses.localeDescription</code>.
     */
    public final TableField<ViewTableLicensesRecord, String> LOCALEDESCRIPTION = createField("localeDescription", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>germinate_template_3_7_0.view_table_licenses</code> table reference
     */
    public ViewTableLicenses() {
        this(DSL.name("view_table_licenses"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.view_table_licenses</code> table reference
     */
    public ViewTableLicenses(String alias) {
        this(DSL.name(alias), VIEW_TABLE_LICENSES);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.view_table_licenses</code> table reference
     */
    public ViewTableLicenses(Name alias) {
        this(alias, VIEW_TABLE_LICENSES);
    }

    private ViewTableLicenses(Name alias, Table<ViewTableLicensesRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewTableLicenses(Name alias, Table<ViewTableLicensesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> ViewTableLicenses(Table<O> child, ForeignKey<O, ViewTableLicensesRecord> key) {
        super(child, key, VIEW_TABLE_LICENSES);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewTableLicensesRecord> getRecordType() {
        return ViewTableLicensesRecord.class;
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
    public ViewTableLicenses as(String alias) {
        return new ViewTableLicenses(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableLicenses as(Name alias) {
        return new ViewTableLicenses(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableLicenses rename(String name) {
        return new ViewTableLicenses(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewTableLicenses rename(Name name) {
        return new ViewTableLicenses(name, null);
    }
}
