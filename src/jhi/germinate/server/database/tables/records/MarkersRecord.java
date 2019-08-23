/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import org.jooq.*;
import org.jooq.impl.*;

import java.sql.*;

import javax.annotation.*;

import jhi.germinate.server.database.tables.*;


/**
 * Defines genetic markers within the database and assigns a type (markertypes).
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MarkersRecord extends UpdatableRecordImpl<MarkersRecord> implements Record5<Integer, Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -225196215;

    /**
     * Create a detached MarkersRecord
     */
    public MarkersRecord() {
        super(Markers.MARKERS);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.markers.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Create a detached, initialised MarkersRecord
     */
    public MarkersRecord(Integer id, Integer markertypeId, String markerName, Timestamp createdOn, Timestamp updatedOn) {
        super(Markers.MARKERS);

        set(0, id);
        set(1, markertypeId);
        set(2, markerName);
        set(3, createdOn);
        set(4, updatedOn);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.markers.markertype_id</code>. Foreign key to locations (locations.id).
     */
    public Integer getMarkertypeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.markers.marker_name</code>. The name of the marker. This should be a unique name which identifies the marker.
     */
    public void setMarkerName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.markers.marker_name</code>. The name of the marker. This should be a unique name which identifies the marker.
     */
    public String getMarkerName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.markers.created_on</code>. When the record was created.

     */
    public void setCreatedOn(Timestamp value) {
        set(3, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.markers.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.markers.markertype_id</code>. Foreign key to locations (locations.id).
     */
    public void setMarkertypeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.markers.created_on</code>. When the record was created.

     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(3);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Markers.MARKERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Markers.MARKERS.MARKERTYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Markers.MARKERS.MARKER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Markers.MARKERS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Markers.MARKERS.UPDATED_ON;
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
        return getMarkertypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getMarkerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
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
        return getMarkertypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMarkerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarkersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarkersRecord value2(Integer value) {
        setMarkertypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarkersRecord value3(String value) {
        setMarkerName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarkersRecord value4(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarkersRecord value5(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarkersRecord values(Integer value1, Integer value2, String value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>germinate_template_3_7_0.markers.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.markers.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(4, value);
    }
}
