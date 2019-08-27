/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import org.jooq.*;
import org.jooq.impl.UpdatableRecordImpl;

import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.tables.Trialseries;


// @formatter:off
/**
 * Holds the names of trial series. Trial series define the name of the trial 
 * to which trials data is associated. Examples would include the overarching 
 * project.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TrialseriesRecord extends UpdatableRecordImpl<TrialseriesRecord> implements Record4<Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -600813968;

    /**
     * Create a detached TrialseriesRecord
     */
    public TrialseriesRecord() {
        super(Trialseries.TRIALSERIES);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.trialseries.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.trialseries.seriesname</code>. The description of the trial series name.
     */
    public void setSeriesname(String value) {
        set(1, value);
    }

    /**
     * Create a detached, initialised TrialseriesRecord
     */
    public TrialseriesRecord(Integer id, String seriesname, Timestamp createdOn, Timestamp updatedOn) {
        super(Trialseries.TRIALSERIES);

        set(0, id);
        set(1, seriesname);
        set(2, createdOn);
        set(3, updatedOn);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.trialseries.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.trialseries.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.trialseries.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.trialseries.seriesname</code>. The description of the trial series name.
     */
    public String getSeriesname() {
        return (String) get(1);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Trialseries.TRIALSERIES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Trialseries.TRIALSERIES.SERIESNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Trialseries.TRIALSERIES.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Trialseries.TRIALSERIES.UPDATED_ON;
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
        return getSeriesname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
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
        return getSeriesname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrialseriesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrialseriesRecord value2(String value) {
        setSeriesname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrialseriesRecord value3(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrialseriesRecord value4(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrialseriesRecord values(Integer value1, String value2, Timestamp value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>germinate_template_3_7_0.trialseries.updated_on</code>. When the record was updated. This may be different from the created on date if changes have been made subsequently to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.trialseries.updated_on</code>. When the record was updated. This may be different from the created on date if changes have been made subsequently to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(3, value);
    }
// @formatter:on
}
