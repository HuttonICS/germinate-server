/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import javax.annotation.Generated;

import jhi.germinate.server.database.enums.ViewTableDatasetAttributesAttributeType;
import jhi.germinate.server.database.tables.ViewTableDatasetAttributes;

import org.jooq.Field;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.TableRecordImpl;


// @formatter:off
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
public class ViewTableDatasetAttributesRecord extends TableRecordImpl<ViewTableDatasetAttributesRecord> implements Record10<Integer, String, String, Integer, String, String, ViewTableDatasetAttributesAttributeType, String, Integer, String> {

    private static final long serialVersionUID = -151003032;

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_dataset_attributes.dataset_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setDatasetId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_dataset_attributes.dataset_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getDatasetId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_dataset_attributes.dataset_name</code>. Describes the dataset.
     */
    public void setDatasetName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_dataset_attributes.dataset_name</code>. Describes the dataset.
     */
    public String getDatasetName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_dataset_attributes.dataset_description</code>. The name of this dataset.
     */
    public void setDatasetDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_dataset_attributes.dataset_description</code>. The name of this dataset.
     */
    public String getDatasetDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_dataset_attributes.attribute_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setAttributeId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_dataset_attributes.attribute_id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getAttributeId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_dataset_attributes.attribute_name</code>. Defines the name of the attribute.
     */
    public void setAttributeName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_dataset_attributes.attribute_name</code>. Defines the name of the attribute.
     */
    public String getAttributeName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_dataset_attributes.attribute_description</code>. Describes the attribute. This should expand on the name to make it clear what the attribute actually is.
     */
    public void setAttributeDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_dataset_attributes.attribute_description</code>. Describes the attribute. This should expand on the name to make it clear what the attribute actually is.
     */
    public String getAttributeDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_dataset_attributes.attribute_type</code>. Describes the data type of the attribute. This can be INT, FLOAT or CHAR type.
     */
    public void setAttributeType(ViewTableDatasetAttributesAttributeType value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_dataset_attributes.attribute_type</code>. Describes the data type of the attribute. This can be INT, FLOAT or CHAR type.
     */
    public ViewTableDatasetAttributesAttributeType getAttributeType() {
        return (ViewTableDatasetAttributesAttributeType) get(6);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_dataset_attributes.target_table</code>.
     */
    public void setTargetTable(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_dataset_attributes.target_table</code>.
     */
    public String getTargetTable() {
        return (String) get(7);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_dataset_attributes.foreign_id</code>. Foreign key to germinatebase (germinatebase.id).
     */
    public void setForeignId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_dataset_attributes.foreign_id</code>. Foreign key to germinatebase (germinatebase.id).
     */
    public Integer getForeignId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.view_table_dataset_attributes.attribute_value</code>. The value of the attribute.
     */
    public void setAttributeValue(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.view_table_dataset_attributes.attribute_value</code>. The value of the attribute.
     */
    public String getAttributeValue() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, Integer, String, String, ViewTableDatasetAttributesAttributeType, String, Integer, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, Integer, String, String, ViewTableDatasetAttributesAttributeType, String, Integer, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewTableDatasetAttributes.VIEW_TABLE_DATASET_ATTRIBUTES.DATASET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewTableDatasetAttributes.VIEW_TABLE_DATASET_ATTRIBUTES.DATASET_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewTableDatasetAttributes.VIEW_TABLE_DATASET_ATTRIBUTES.DATASET_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ViewTableDatasetAttributes.VIEW_TABLE_DATASET_ATTRIBUTES.ATTRIBUTE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ViewTableDatasetAttributes.VIEW_TABLE_DATASET_ATTRIBUTES.ATTRIBUTE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ViewTableDatasetAttributes.VIEW_TABLE_DATASET_ATTRIBUTES.ATTRIBUTE_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ViewTableDatasetAttributesAttributeType> field7() {
        return ViewTableDatasetAttributes.VIEW_TABLE_DATASET_ATTRIBUTES.ATTRIBUTE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ViewTableDatasetAttributes.VIEW_TABLE_DATASET_ATTRIBUTES.TARGET_TABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return ViewTableDatasetAttributes.VIEW_TABLE_DATASET_ATTRIBUTES.FOREIGN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ViewTableDatasetAttributes.VIEW_TABLE_DATASET_ATTRIBUTES.ATTRIBUTE_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getDatasetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDatasetDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getAttributeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getAttributeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getAttributeDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableDatasetAttributesAttributeType component7() {
        return getAttributeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getTargetTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getForeignId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getAttributeValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDatasetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDatasetDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAttributeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAttributeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAttributeDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableDatasetAttributesAttributeType value7() {
        return getAttributeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getTargetTable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getForeignId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getAttributeValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableDatasetAttributesRecord value1(Integer value) {
        setDatasetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableDatasetAttributesRecord value2(String value) {
        setDatasetName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableDatasetAttributesRecord value3(String value) {
        setDatasetDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableDatasetAttributesRecord value4(Integer value) {
        setAttributeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableDatasetAttributesRecord value5(String value) {
        setAttributeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableDatasetAttributesRecord value6(String value) {
        setAttributeDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableDatasetAttributesRecord value7(ViewTableDatasetAttributesAttributeType value) {
        setAttributeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableDatasetAttributesRecord value8(String value) {
        setTargetTable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableDatasetAttributesRecord value9(Integer value) {
        setForeignId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableDatasetAttributesRecord value10(String value) {
        setAttributeValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableDatasetAttributesRecord values(Integer value1, String value2, String value3, Integer value4, String value5, String value6, ViewTableDatasetAttributesAttributeType value7, String value8, Integer value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTableDatasetAttributesRecord
     */
    public ViewTableDatasetAttributesRecord() {
        super(ViewTableDatasetAttributes.VIEW_TABLE_DATASET_ATTRIBUTES);
    }

    /**
     * Create a detached, initialised ViewTableDatasetAttributesRecord
     */
    public ViewTableDatasetAttributesRecord(Integer datasetId, String datasetName, String datasetDescription, Integer attributeId, String attributeName, String attributeDescription, ViewTableDatasetAttributesAttributeType attributeType, String targetTable, Integer foreignId, String attributeValue) {
        super(ViewTableDatasetAttributes.VIEW_TABLE_DATASET_ATTRIBUTES);

        set(0, datasetId);
        set(1, datasetName);
        set(2, datasetDescription);
        set(3, attributeId);
        set(4, attributeName);
        set(5, attributeDescription);
        set(6, attributeType);
        set(7, targetTable);
        set(8, foreignId);
        set(9, attributeValue);
    }
// @formatter:on
}