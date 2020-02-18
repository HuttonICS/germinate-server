/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.germinate.server.database.GerminateTemplate_4_0_0;
import jhi.germinate.server.database.tables.records.AttributedataRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.TableImpl;


// @formatter:off
/**
 * Defines attributes data. Attributes which are defined in attributes can 
 * have values associated with them. Data which does not warrant new column 
 * in the germinatebase table can be added here. Examples include small amounts 
 * of data defining germplasm which only exists for a small sub-group of the 
 * total database.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Attributedata extends TableImpl<AttributedataRecord> {

    private static final long serialVersionUID = 762498181;

    /**
     * The reference instance of <code>germinate_template_4_0_0.attributedata</code>
     */
    public static final Attributedata ATTRIBUTEDATA = new Attributedata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AttributedataRecord> getRecordType() {
        return AttributedataRecord.class;
    }

    /**
     * The column <code>germinate_template_4_0_0.attributedata.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<AttributedataRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_4_0_0.attributedata.attribute_id</code>. Foreign key to attributes (attributes.id).
     */
    public final TableField<AttributedataRecord, Integer> ATTRIBUTE_ID = createField("attribute_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key to attributes (attributes.id).");

    /**
     * The column <code>germinate_template_4_0_0.attributedata.foreign_id</code>. Foreign key to germinatebase (germinatebase.id).
     */
    public final TableField<AttributedataRecord, Integer> FOREIGN_ID = createField("foreign_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key to germinatebase (germinatebase.id).");

    /**
     * The column <code>germinate_template_4_0_0.attributedata.value</code>. The value of the attribute.
     */
    public final TableField<AttributedataRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "The value of the attribute.");

    /**
     * The column <code>germinate_template_4_0_0.attributedata.created_on</code>. When the record was created.
     */
    public final TableField<AttributedataRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_4_0_0.attributedata.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<AttributedataRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_4_0_0.attributedata</code> table reference
     */
    public Attributedata() {
        this(DSL.name("attributedata"), null);
    }

    /**
     * Create an aliased <code>germinate_template_4_0_0.attributedata</code> table reference
     */
    public Attributedata(String alias) {
        this(DSL.name(alias), ATTRIBUTEDATA);
    }

    /**
     * Create an aliased <code>germinate_template_4_0_0.attributedata</code> table reference
     */
    public Attributedata(Name alias) {
        this(alias, ATTRIBUTEDATA);
    }

    private Attributedata(Name alias, Table<AttributedataRecord> aliased) {
        this(alias, aliased, null);
    }

    private Attributedata(Name alias, Table<AttributedataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Defines attributes data. Attributes which are defined in attributes can have values associated with them. Data which does not warrant new column in the germinatebase table can be added here. Examples include small amounts of data defining germplasm which only exists for a small sub-group of the total database."));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return GerminateTemplate_4_0_0.GERMINATE_TEMPLATE_4_0_0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<AttributedataRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.tables.Attributedata.ATTRIBUTEDATA, jhi.germinate.server.database.tables.Attributedata.ATTRIBUTEDATA.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AttributedataRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.tables.Attributedata.ATTRIBUTEDATA, "KEY_attributedata_PRIMARY", jhi.germinate.server.database.tables.Attributedata.ATTRIBUTEDATA.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AttributedataRecord>> getKeys() {
        return Arrays.<UniqueKey<AttributedataRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.tables.Attributedata.ATTRIBUTEDATA, "KEY_attributedata_PRIMARY", jhi.germinate.server.database.tables.Attributedata.ATTRIBUTEDATA.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Attributedata as(String alias) {
        return new Attributedata(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Attributedata as(Name alias) {
        return new Attributedata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Attributedata rename(String name) {
        return new Attributedata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Attributedata rename(Name name) {
        return new Attributedata(name, null);
    }
// @formatter:on
}