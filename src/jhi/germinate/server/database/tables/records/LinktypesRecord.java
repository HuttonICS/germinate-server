/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import org.jooq.*;
import org.jooq.impl.UpdatableRecordImpl;

import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.tables.Linktypes;


/**
 * The link type determines which database table and column are used to construct 
 * the final
 * link. The ”placeholder” in the link (from the links table) will be replaced 
 * by the value of the
 * ”target column” in the ”target table”
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LinktypesRecord extends UpdatableRecordImpl<LinktypesRecord> implements Record7<Integer, String, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -653209307;

    /**
     * Create a detached LinktypesRecord
     */
    public LinktypesRecord() {
        super(Linktypes.LINKTYPES);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.linktypes.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Create a detached, initialised LinktypesRecord
     */
    public LinktypesRecord(Integer id, String description, String targetTable, String targetColumn, String placeholder, Timestamp createdOn, Timestamp updatedOn) {
        super(Linktypes.LINKTYPES);

        set(0, id);
        set(1, description);
        set(2, targetTable);
        set(3, targetColumn);
        set(4, placeholder);
        set(5, createdOn);
        set(6, updatedOn);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.linktypes.description</code>. A description of the link
.
     */
    public String getDescription() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.linktypes.target_table</code>. This is the table that the link links to.
     */
    public void setTargetTable(String value) {
        set(2, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.linktypes.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.linktypes.target_column</code>. This is the column that is used to generate the link.
     */
    public void setTargetColumn(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.linktypes.target_column</code>. This is the column that is used to generate the link.
     */
    public String getTargetColumn() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.linktypes.description</code>. A description of the link
.
     */
    public void setDescription(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.linktypes.placeholder</code>. The part of the link that will be replaced by the value of the target column.
     */
    public String getPlaceholder() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.linktypes.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.linktypes.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(5);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.linktypes.target_table</code>. This is the table that the link links to.
     */
    public String getTargetTable() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.linktypes.placeholder</code>. The part of the link that will be replaced by the value of the target column.
     */
    public void setPlaceholder(String value) {
        set(4, value);
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
    public Row7<Integer, String, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Linktypes.LINKTYPES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Linktypes.LINKTYPES.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Linktypes.LINKTYPES.TARGET_TABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Linktypes.LINKTYPES.TARGET_COLUMN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Linktypes.LINKTYPES.PLACEHOLDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Linktypes.LINKTYPES.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Linktypes.LINKTYPES.UPDATED_ON;
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
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTargetTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTargetColumn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPlaceholder();
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
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTargetTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTargetColumn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPlaceholder();
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
    public LinktypesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LinktypesRecord value2(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LinktypesRecord value3(String value) {
        setTargetTable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LinktypesRecord value4(String value) {
        setTargetColumn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LinktypesRecord value5(String value) {
        setPlaceholder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LinktypesRecord value6(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LinktypesRecord value7(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LinktypesRecord values(Integer value1, String value2, String value3, String value4, String value5, Timestamp value6, Timestamp value7) {
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
     * Getter for <code>germinate_template_3_7_0.linktypes.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.linktypes.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(6, value);
    }
}
