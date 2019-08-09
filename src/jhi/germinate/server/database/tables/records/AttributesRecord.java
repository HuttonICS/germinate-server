/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import org.jooq.*;
import org.jooq.impl.*;

import java.sql.*;

import javax.annotation.*;

import jhi.germinate.server.database.enums.*;
import jhi.germinate.server.database.tables.*;


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
public class AttributesRecord extends UpdatableRecordImpl<AttributesRecord> implements Record7<Integer, String, String, AttributesDatatype, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 87137833;

    /**
     * Create a detached AttributesRecord
     */
    public AttributesRecord() {
        super(Attributes.ATTRIBUTES);
    }

    /**
     * Getter for <code>germinate_template_3_6_0.attributes.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Create a detached, initialised AttributesRecord
     */
    public AttributesRecord(Integer id, String name, String description, AttributesDatatype datatype, String targetTable, Timestamp createdOn, Timestamp updatedOn) {
        super(Attributes.ATTRIBUTES);

        set(0, id);
        set(1, name);
        set(2, description);
        set(3, datatype);
        set(4, targetTable);
        set(5, createdOn);
        set(6, updatedOn);
    }

    /**
     * Getter for <code>germinate_template_3_6_0.attributes.name</code>. Defines the name of the attribute.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_template_3_6_0.attributes.description</code>. Describes the attribute. This should expand on the name to make it clear what the attribute actually is.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Setter for <code>germinate_template_3_6_0.attributes.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Setter for <code>germinate_template_3_6_0.attributes.datatype</code>. Describes the data type of the attribute. This can be INT, FLOAT or CHAR type.
     */
    public void setDatatype(AttributesDatatype value) {
        set(3, value);
    }

    /**
     * Setter for <code>germinate_template_3_6_0.attributes.name</code>. Defines the name of the attribute.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Setter for <code>germinate_template_3_6_0.attributes.target_table</code>.
     */
    public void setTargetTable(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_3_6_0.attributes.description</code>. Describes the attribute. This should expand on the name to make it clear what the attribute actually is.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_3_6_0.attributes.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_3_6_0.attributes.datatype</code>. Describes the data type of the attribute. This can be INT, FLOAT or CHAR type.
     */
    public AttributesDatatype getDatatype() {
        return (AttributesDatatype) get(3);
    }

    /**
     * Getter for <code>germinate_template_3_6_0.attributes.target_table</code>.
     */
    public String getTargetTable() {
        return (String) get(4);
    }

    /**
     * Getter for <code>germinate_template_3_6_0.attributes.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, AttributesDatatype, String, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, AttributesDatatype, String, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Attributes.ATTRIBUTES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Attributes.ATTRIBUTES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Attributes.ATTRIBUTES.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<AttributesDatatype> field4() {
        return Attributes.ATTRIBUTES.DATATYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Attributes.ATTRIBUTES.TARGET_TABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Attributes.ATTRIBUTES.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Attributes.ATTRIBUTES.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributesDatatype component4() {
        return getDatatype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTargetTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributesDatatype value4() {
        return getDatatype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTargetTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributesRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributesRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributesRecord value4(AttributesDatatype value) {
        setDatatype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributesRecord value5(String value) {
        setTargetTable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributesRecord value6(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributesRecord value7(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttributesRecord values(Integer value1, String value2, String value3, AttributesDatatype value4, String value5, Timestamp value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>germinate_template_3_6_0.attributes.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>germinate_template_3_6_0.attributes.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(6, value);
    }
}
