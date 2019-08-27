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
import jhi.germinate.server.database.enums.AttributesDatatype;
import jhi.germinate.server.database.tables.records.AttributesRecord;


// @formatter:off
/**
 * Describes attributes. Attributes are bits of information that can be joined 
 * to, for example, a germinatebase entry. These are bits of data that while 
 * important do not warrant adding additional columns in the other tables. 
 * Examples would be using this to define ecotypes for germinatebase entries.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Attributes extends TableImpl<AttributesRecord> {

    private static final long serialVersionUID = -599692925;

    /**
     * The reference instance of <code>germinate_template_3_7_0.attributes</code>
     */
    public static final Attributes ATTRIBUTES = new Attributes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AttributesRecord> getRecordType() {
        return AttributesRecord.class;
    }

    /**
     * The column <code>germinate_template_3_7_0.attributes.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<AttributesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_7_0.attributes.name</code>. Defines the name of the attribute.
     */
    public final TableField<AttributesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "Defines the name of the attribute.");

    /**
     * The column <code>germinate_template_3_7_0.attributes.description</code>. Describes the attribute. This should expand on the name to make it clear what the attribute actually is.
     */
    public final TableField<AttributesRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Describes the attribute. This should expand on the name to make it clear what the attribute actually is.");

    /**
     * The column <code>germinate_template_3_7_0.attributes.datatype</code>. Describes the data type of the attribute. This can be INT, FLOAT or CHAR type.
     */
    public final TableField<AttributesRecord, AttributesDatatype> DATATYPE = createField("datatype", org.jooq.impl.SQLDataType.VARCHAR(5).nullable(false).defaultValue(org.jooq.impl.DSL.inline("int", org.jooq.impl.SQLDataType.VARCHAR)).asEnumDataType(jhi.germinate.server.database.enums.AttributesDatatype.class), this, "Describes the data type of the attribute. This can be INT, FLOAT or CHAR type.");

    /**
     * The column <code>germinate_template_3_7_0.attributes.target_table</code>.
     */
    public final TableField<AttributesRecord, String> TARGET_TABLE = createField("target_table", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("germinatebase", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>germinate_template_3_7_0.attributes.created_on</code>. When the record was created.
     */
    public final TableField<AttributesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_7_0.attributes.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<AttributesRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_7_0.attributes</code> table reference
     */
    public Attributes() {
        this(DSL.name("attributes"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.attributes</code> table reference
     */
    public Attributes(String alias) {
        this(DSL.name(alias), ATTRIBUTES);
    }

    /**
     * Create an aliased <code>germinate_template_3_7_0.attributes</code> table reference
     */
    public Attributes(Name alias) {
        this(alias, ATTRIBUTES);
    }

    private Attributes(Name alias, Table<AttributesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Attributes(Name alias, Table<AttributesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Describes attributes. Attributes are bits of information that can be joined to, for example, a germinatebase entry. These are bits of data that while important do not warrant adding additional columns in the other tables. Examples would be using this to define ecotypes for germinatebase entries."));
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
    public Identity<AttributesRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.tables.Attributes.ATTRIBUTES, jhi.germinate.server.database.tables.Attributes.ATTRIBUTES.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AttributesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.tables.Attributes.ATTRIBUTES, "KEY_attributes_PRIMARY", jhi.germinate.server.database.tables.Attributes.ATTRIBUTES.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AttributesRecord>> getKeys() {
        return Arrays.<UniqueKey<AttributesRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.tables.Attributes.ATTRIBUTES, "KEY_attributes_PRIMARY", jhi.germinate.server.database.tables.Attributes.ATTRIBUTES.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Attributes as(String alias) {
        return new Attributes(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Attributes as(Name alias) {
        return new Attributes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Attributes rename(String name) {
        return new Attributes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Attributes rename(Name name) {
        return new Attributes(name, null);
    }
// @formatter:on
}
