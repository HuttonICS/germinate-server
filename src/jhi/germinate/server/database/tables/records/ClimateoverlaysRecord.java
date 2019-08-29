/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.tables.Climateoverlays;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * Climate overlays can be used in conjunction with OpenStreetMap in order 
 * to visualize climate data in a geographic context.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClimateoverlaysRecord extends UpdatableRecordImpl<ClimateoverlaysRecord> implements Record11<Integer, Integer, String, Double, Double, Double, Double, Byte, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 581041527;

    /**
     * Create a detached ClimateoverlaysRecord
     */
    public ClimateoverlaysRecord() {
        super(Climateoverlays.CLIMATEOVERLAYS);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climateoverlays.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Create a detached, initialised ClimateoverlaysRecord
     */
    public ClimateoverlaysRecord(Integer id, Integer climateId, String path, Double bottomLeftLongitude, Double bottomLeftLatitude, Double topRightLongitude, Double topRightLatitude, Byte isLegend, String description, Timestamp createdOn, Timestamp updatedOn) {
        super(Climateoverlays.CLIMATEOVERLAYS);

        set(0, id);
        set(1, climateId);
        set(2, path);
        set(3, bottomLeftLongitude);
        set(4, bottomLeftLatitude);
        set(5, topRightLongitude);
        set(6, topRightLatitude);
        set(7, isLegend);
        set(8, description);
        set(9, createdOn);
        set(10, updatedOn);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climateoverlays.climate_id</code>. Foreign key to climates (climates.id).
     */
    public Integer getClimateId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climateoverlays.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climateoverlays.path</code>. This is the path for holding images which can be used as overlays for the Google Maps representation in Germinate. The path is relative.
     */
    public String getPath() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climateoverlays.bottom_left_longitude</code>. Allows the allignment of images against OpenStreetMap API.
     */
    public void setBottomLeftLongitude(Double value) {
        set(3, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climateoverlays.climate_id</code>. Foreign key to climates (climates.id).
     */
    public void setClimateId(Integer value) {
        set(1, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climateoverlays.bottom_left_latitude</code>. Allows the allignment of images against OpenStreetMap API.
     */
    public void setBottomLeftLatitude(Double value) {
        set(4, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climateoverlays.path</code>. This is the path for holding images which can be used as overlays for the Google Maps representation in Germinate. The path is relative.
     */
    public void setPath(String value) {
        set(2, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climateoverlays.top_right_longitude</code>. Allows the allignment of images against OpenStreetMap API.
     */
    public void setTopRightLongitude(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climateoverlays.top_right_longitude</code>. Allows the allignment of images against OpenStreetMap API.
     */
    public Double getTopRightLongitude() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climateoverlays.top_right_latitude</code>. Allows the allignment of images against OpenStreetMap API.
     */
    public void setTopRightLatitude(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climateoverlays.top_right_latitude</code>. Allows the allignment of images against OpenStreetMap API.
     */
    public Double getTopRightLatitude() {
        return (Double) get(6);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climateoverlays.bottom_left_longitude</code>. Allows the allignment of images against OpenStreetMap API.
     */
    public Double getBottomLeftLongitude() {
        return (Double) get(3);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climateoverlays.bottom_left_latitude</code>. Allows the allignment of images against OpenStreetMap API.
     */
    public Double getBottomLeftLatitude() {
        return (Double) get(4);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climateoverlays.is_legend</code>. The legend for the image. What colours represent in the overlays. This is not required but used if present.
     */
    public Byte getIsLegend() {
        return (Byte) get(7);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climateoverlays.description</code>. Describes the climate overlay if additional explanation of  the overlay image is required.
     */
    public String getDescription() {
        return (String) get(8);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climateoverlays.is_legend</code>. The legend for the image. What colours represent in the overlays. This is not required but used if present.
     */
    public void setIsLegend(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.climateoverlays.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climateoverlays.description</code>. Describes the climate overlay if additional explanation of  the overlay image is required.
     */
    public void setDescription(String value) {
        set(8, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climateoverlays.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(9, value);
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
    public Row11<Integer, Integer, String, Double, Double, Double, Double, Byte, String, Timestamp, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Integer, String, Double, Double, Double, Double, Byte, String, Timestamp, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Climateoverlays.CLIMATEOVERLAYS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Climateoverlays.CLIMATEOVERLAYS.CLIMATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Climateoverlays.CLIMATEOVERLAYS.PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return Climateoverlays.CLIMATEOVERLAYS.BOTTOM_LEFT_LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field5() {
        return Climateoverlays.CLIMATEOVERLAYS.BOTTOM_LEFT_LATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return Climateoverlays.CLIMATEOVERLAYS.TOP_RIGHT_LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return Climateoverlays.CLIMATEOVERLAYS.TOP_RIGHT_LATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return Climateoverlays.CLIMATEOVERLAYS.IS_LEGEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Climateoverlays.CLIMATEOVERLAYS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return Climateoverlays.CLIMATEOVERLAYS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Climateoverlays.CLIMATEOVERLAYS.UPDATED_ON;
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
    public String component3() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getBottomLeftLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component5() {
        return getBottomLeftLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component6() {
        return getTopRightLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component7() {
        return getTopRightLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component8() {
        return getIsLegend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
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
    public String value3() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getBottomLeftLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value5() {
        return getBottomLeftLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getTopRightLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getTopRightLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getIsLegend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimateoverlaysRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimateoverlaysRecord value2(Integer value) {
        setClimateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimateoverlaysRecord value3(String value) {
        setPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimateoverlaysRecord value4(Double value) {
        setBottomLeftLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimateoverlaysRecord value5(Double value) {
        setBottomLeftLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimateoverlaysRecord value6(Double value) {
        setTopRightLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimateoverlaysRecord value7(Double value) {
        setTopRightLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimateoverlaysRecord value8(Byte value) {
        setIsLegend(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimateoverlaysRecord value9(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimateoverlaysRecord value10(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimateoverlaysRecord value11(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClimateoverlaysRecord values(Integer value1, Integer value2, String value3, Double value4, Double value5, Double value6, Double value7, Byte value8, String value9, Timestamp value10, Timestamp value11) {
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
     * Getter for <code>germinate_template_3_7_0.climateoverlays.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.climateoverlays.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(10, value);
    }
// @formatter:on
}
