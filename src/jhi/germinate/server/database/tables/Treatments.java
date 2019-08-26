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
import jhi.germinate.server.database.tables.records.TreatmentsRecord;


/**
 * For trials data the treatment is used to distinguish between factors. Examples 
 * would include whether the trial was treated with fungicides or not.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Treatments extends TableImpl<TreatmentsRecord> {

    private static final long serialVersionUID = 1989242498;

    /**
     * The reference instance of <code>germinate_template_3_7_0.treatments</code>
     */
    public static final Treatments TREATMENTS = new Treatments();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TreatmentsRecord> getRecordType() {
        return TreatmentsRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.treatments.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<TreatmentsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.treatments.name</code>. The name which defines the treatment.
     */
    public final TableField<TreatmentsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "The name which defines the treatment.");

    /**
     * The column <code>germinate_template_3_7_0.treatments.description</code>. A longer descripiton of the treatment. This should include enough information to be able to identify what the treatment was and why it was applied.
     */
    public final TableField<TreatmentsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(255), this, "A longer descripiton of the treatment. This should include enough information to be able to identify what the treatment was and why it was applied.");

    /**
     * The column <code>germinate_template_3_7_0.treatments.created_on</code>. When the record was created.
     */
    public final TableField<TreatmentsRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.treatments.updated_on</code>. When the record was updated. This may be different from the created on date if changes have been made subsequently to the underlying record.
     */
    public final TableField<TreatmentsRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if changes have been made subsequently to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.treatments</code> table reference
     */
    public Treatments() {
        this(DSL.name("treatments"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.treatments</code> table reference
     */
    public Treatments(String alias) {
        this(DSL.name(alias), TREATMENTS);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.treatments</code> table reference
     */
    public Treatments(Name alias) {
        this(alias, TREATMENTS);
    }

    private Treatments(Name alias, Table<TreatmentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Treatments(Name alias, Table<TreatmentsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("For trials data the treatment is used to distinguish between factors. Examples would include whether the trial was treated with fungicides or not."));
    }

    public <O extends Record> Treatments(Table<O> child, ForeignKey<O, TreatmentsRecord> key) {
        super(child, key, TREATMENTS);
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
        return Arrays.<Index>asList(Indexes.TREATMENTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TreatmentsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TREATMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TreatmentsRecord> getPrimaryKey() {
        return Keys.KEY_TREATMENTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TreatmentsRecord>> getKeys() {
        return Arrays.<UniqueKey<TreatmentsRecord>>asList(Keys.KEY_TREATMENTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Treatments as(String alias) {
        return new Treatments(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Treatments as(Name alias) {
        return new Treatments(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Treatments rename(String name) {
        return new Treatments(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Treatments rename(Name name) {
        return new Treatments(name, null);
    }
}
