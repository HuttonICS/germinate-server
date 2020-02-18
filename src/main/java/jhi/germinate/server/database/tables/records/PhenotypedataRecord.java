/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.tables.Phenotypedata;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * Contains phenotypic data which has been collected.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PhenotypedataRecord extends UpdatableRecordImpl<PhenotypedataRecord> implements Record11<Integer, Integer, Integer, String, Integer, Timestamp, Timestamp, Timestamp, Integer, Integer, Integer> {

    private static final long serialVersionUID = 265527728;

    /**
     * Setter for <code>germinate_template_4_0_0.phenotypedata.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.phenotypedata.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.phenotypedata.phenotype_id</code>. Foreign key phenotypes (phenotype.id).
     */
    public void setPhenotypeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.phenotypedata.phenotype_id</code>. Foreign key phenotypes (phenotype.id).
     */
    public Integer getPhenotypeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.phenotypedata.germinatebase_id</code>. Foreign key germinatebase (germinatebase.id).
     */
    public void setGerminatebaseId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.phenotypedata.germinatebase_id</code>. Foreign key germinatebase (germinatebase.id).
     */
    public Integer getGerminatebaseId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.phenotypedata.phenotype_value</code>. The phenotype value for this phenotype_id and germinatebase_id combination.
     */
    public void setPhenotypeValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.phenotypedata.phenotype_value</code>. The phenotype value for this phenotype_id and germinatebase_id combination.
     */
    public String getPhenotypeValue() {
        return (String) get(3);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.phenotypedata.dataset_id</code>. Foreign key datasets (datasets.id).
     */
    public void setDatasetId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.phenotypedata.dataset_id</code>. Foreign key datasets (datasets.id).
     */
    public Integer getDatasetId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.phenotypedata.recording_date</code>. Date when the phenotypic result was recorded. Should be formatted 'YYYY-MM-DD HH:MM:SS' or just 'YYYY-MM-DD' where a timestamp is not available.
     */
    public void setRecordingDate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.phenotypedata.recording_date</code>. Date when the phenotypic result was recorded. Should be formatted 'YYYY-MM-DD HH:MM:SS' or just 'YYYY-MM-DD' where a timestamp is not available.
     */
    public Timestamp getRecordingDate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.phenotypedata.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.phenotypedata.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.phenotypedata.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.phenotypedata.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.phenotypedata.location_id</code>. Foreign key to locations (locations.id).
     */
    public void setLocationId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.phenotypedata.location_id</code>. Foreign key to locations (locations.id).
     */
    public Integer getLocationId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.phenotypedata.treatment_id</code>. Foreign key to treatments (treatments.id).
     */
    public void setTreatmentId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.phenotypedata.treatment_id</code>. Foreign key to treatments (treatments.id).
     */
    public Integer getTreatmentId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>germinate_template_4_0_0.phenotypedata.trialseries_id</code>. Foreign key to trialseries (trialseries.id).
     */
    public void setTrialseriesId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>germinate_template_4_0_0.phenotypedata.trialseries_id</code>. Foreign key to trialseries (trialseries.id).
     */
    public Integer getTrialseriesId() {
        return (Integer) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, Integer, String, Integer, Timestamp, Timestamp, Timestamp, Integer, Integer, Integer> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, Integer, String, Integer, Timestamp, Timestamp, Timestamp, Integer, Integer, Integer> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Phenotypedata.PHENOTYPEDATA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Phenotypedata.PHENOTYPEDATA.PHENOTYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Phenotypedata.PHENOTYPEDATA.GERMINATEBASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Phenotypedata.PHENOTYPEDATA.PHENOTYPE_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Phenotypedata.PHENOTYPEDATA.DATASET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Phenotypedata.PHENOTYPEDATA.RECORDING_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Phenotypedata.PHENOTYPEDATA.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Phenotypedata.PHENOTYPEDATA.UPDATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Phenotypedata.PHENOTYPEDATA.LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Phenotypedata.PHENOTYPEDATA.TREATMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Phenotypedata.PHENOTYPEDATA.TRIALSERIES_ID;
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
        return getPhenotypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getGerminatebaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPhenotypeValue();
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
    public Timestamp component6() {
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
    public Integer component9() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getTreatmentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getTrialseriesId();
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
        return getPhenotypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getGerminatebaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPhenotypeValue();
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
    public Timestamp value6() {
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
    public Integer value9() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getTreatmentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getTrialseriesId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypedataRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypedataRecord value2(Integer value) {
        setPhenotypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypedataRecord value3(Integer value) {
        setGerminatebaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypedataRecord value4(String value) {
        setPhenotypeValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypedataRecord value5(Integer value) {
        setDatasetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypedataRecord value6(Timestamp value) {
        setRecordingDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypedataRecord value7(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypedataRecord value8(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypedataRecord value9(Integer value) {
        setLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypedataRecord value10(Integer value) {
        setTreatmentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypedataRecord value11(Integer value) {
        setTrialseriesId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PhenotypedataRecord values(Integer value1, Integer value2, Integer value3, String value4, Integer value5, Timestamp value6, Timestamp value7, Timestamp value8, Integer value9, Integer value10, Integer value11) {
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
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PhenotypedataRecord
     */
    public PhenotypedataRecord() {
        super(Phenotypedata.PHENOTYPEDATA);
    }

    /**
     * Create a detached, initialised PhenotypedataRecord
     */
    public PhenotypedataRecord(Integer id, Integer phenotypeId, Integer germinatebaseId, String phenotypeValue, Integer datasetId, Timestamp recordingDate, Timestamp createdOn, Timestamp updatedOn, Integer locationId, Integer treatmentId, Integer trialseriesId) {
        super(Phenotypedata.PHENOTYPEDATA);

        set(0, id);
        set(1, phenotypeId);
        set(2, germinatebaseId);
        set(3, phenotypeValue);
        set(4, datasetId);
        set(5, recordingDate);
        set(6, createdOn);
        set(7, updatedOn);
        set(8, locationId);
        set(9, treatmentId);
        set(10, trialseriesId);
    }
// @formatter:on
}