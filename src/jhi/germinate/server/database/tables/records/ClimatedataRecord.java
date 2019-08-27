/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import org.jooq.*;
import org.jooq.impl.UpdatableRecordImpl;

import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.tables.Climatedata;


// @formatter:off
/**
 * Holds montly average climate data such as rainfall, temperature or cloud 
 * cover. This is based on locations rather than accessions like most of the 
 * other tables in Germinate.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClimatedataRecord extends UpdatableRecordImpl<ClimatedataRecord> implements Record8<Integer, Integer, Integer, Double, Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1048835029;

    /**
     * Create a detached ClimatedataRecord
     */
    public ClimatedataRecord() {
        super(Climatedata.CLIMATEDATA);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climatedata.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Create a detached, initialised ClimatedataRecord
     */
    public ClimatedataRecord(Integer id, Integer climateId, Integer locationId, Double climateValue, Integer datasetId, String recordingDate, Timestamp createdOn, Timestamp updatedOn) {
        super(Climatedata.CLIMATEDATA);

        set(0, id);
        set(1, climateId);
        set(2, locationId);
        set(3, climateValue);
        set(4, datasetId);
        set(5, recordingDate);
        set(6, createdOn);
        set(7, updatedOn);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climatedata.climate_id</code>. Foreign key to climates (climates.id).
     */
    public Integer getClimateId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climatedata.location_id</code>. Foreign key to locations (locations.id).
     */
    public void setLocationId(Integer value) {
        set(2, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climatedata.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climatedata.climate_value</code>. Value for the specific climate attribute. These are monthly averages and not daily. Monthly data is required for the current Germinate climate viisualizations and interface.
     */
    public void setClimateValue(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climatedata.climate_value</code>. Value for the specific climate attribute. These are monthly averages and not daily. Monthly data is required for the current Germinate climate viisualizations and interface.
     */
    public Double getClimateValue() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climatedata.climate_id</code>. Foreign key to climates (climates.id).
     */
    public void setClimateId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climatedata.dataset_id</code>. Foreign key to datasets (datasets.id).
     */
    public Integer getDatasetId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climatedata.recording_date</code>. The month that the data was recorded. This uses an integer to represent the month (1-12).
     */
    public void setRecordingDate(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climatedata.location_id</code>. Foreign key to locations (locations.id).
     */
    public Integer getLocationId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climatedata.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climatedata.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climatedata.dataset_id</code>. Foreign key to datasets (datasets.id).
     */
    public void setDatasetId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climatedata.recording_date</code>. The month that the data was recorded. This uses an integer to represent the month (1-12).
     */
    public String getRecordingDate() {
        return (String) get(5);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Double, Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Double, Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Climatedata.CLIMATEDATA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Climatedata.CLIMATEDATA.CLIMATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Climatedata.CLIMATEDATA.LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return Climatedata.CLIMATEDATA.CLIMATE_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Climatedata.CLIMATEDATA.DATASET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Climatedata.CLIMATEDATA.RECORDING_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Climatedata.CLIMATEDATA.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Climatedata.CLIMATEDATA.UPDATED_ON;
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
    public Integer component2() {
        return getClimateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getClimateValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRecordingDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
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
    public Integer value2() {
        return getClimateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getClimateValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getDatasetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRecordingDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimatedataRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimatedataRecord value2(Integer value) {
        setClimateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimatedataRecord value3(Integer value) {
        setLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimatedataRecord value4(Double value) {
        setClimateValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimatedataRecord value5(Integer value) {
        setDatasetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimatedataRecord value6(String value) {
        setRecordingDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimatedataRecord value7(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimatedataRecord value8(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimatedataRecord values(Integer value1, Integer value2, Integer value3, Double value4, Integer value5, String value6, Timestamp value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>germinate_template_3_7_0.climatedata.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climatedata.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(7, value);
    }
// @formatter:on
}
