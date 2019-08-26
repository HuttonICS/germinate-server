/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import org.jooq.*;
import org.jooq.impl.TableRecordImpl;

import javax.annotation.Generated;

import jhi.germinate.server.database.tables.ViewTableMaps;


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
public class ViewTableMapsRecord extends TableRecordImpl<ViewTableMapsRecord> implements Record6<Integer, String, String, Integer, Byte, Long> {

    private static final long serialVersionUID = 2181462;

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_maps.mapId</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setMapid(Integer value) {
        set(0, value);
    }

    /**
     * Create a detached ViewTableMapsRecord
     */
    public ViewTableMapsRecord() {
        super(ViewTableMaps.VIEW_TABLE_MAPS);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_maps.mapName</code>. Describes the map.
     */
    public void setMapname(String value) {
        set(1, value);
    }

    /**
     * Create a detached, initialised ViewTableMapsRecord
     */
    public ViewTableMapsRecord(Integer mapid, String mapname, String mapdescription, Integer userid, Byte visibility, Long markercount) {
        super(ViewTableMaps.VIEW_TABLE_MAPS);

        set(0, mapid);
        set(1, mapname);
        set(2, mapdescription);
        set(3, userid);
        set(4, visibility);
        set(5, markercount);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_maps.mapDescription</code>. The name of this map.
     */
    public void setMapdescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_maps.mapId</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getMapid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_maps.userId</code>. Foreign key to Gatekeeper users (Gatekeeper users.id).
     */
    public void setUserid(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_maps.mapName</code>. Describes the map.
     */
    public String getMapname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_maps.visibility</code>. Determines if the map is visible to the Germinate interface or hidden.
     */
    public void setVisibility(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_maps.mapDescription</code>. The name of this map.
     */
    public String getMapdescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.view_table_maps.markerCount</code>.
     */
    public void setMarkercount(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_maps.userId</code>. Foreign key to Gatekeeper users (Gatekeeper users.id).
     */
    public Integer getUserid() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, Integer, Byte, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, Integer, Byte, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ViewTableMaps.VIEW_TABLE_MAPS.MAPID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewTableMaps.VIEW_TABLE_MAPS.MAPNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewTableMaps.VIEW_TABLE_MAPS.MAPDESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ViewTableMaps.VIEW_TABLE_MAPS.USERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return ViewTableMaps.VIEW_TABLE_MAPS.VISIBILITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return ViewTableMaps.VIEW_TABLE_MAPS.MARKERCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getMapid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getMapname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getMapdescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getVisibility();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getMarkercount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getMapid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getMapname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMapdescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getUserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getVisibility();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getMarkercount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableMapsRecord value1(Integer value) {
        setMapid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableMapsRecord value2(String value) {
        setMapname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableMapsRecord value3(String value) {
        setMapdescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableMapsRecord value4(Integer value) {
        setUserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableMapsRecord value5(Byte value) {
        setVisibility(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableMapsRecord value6(Long value) {
        setMarkercount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewTableMapsRecord values(Integer value1, String value2, String value3, Integer value4, Byte value5, Long value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_maps.visibility</code>. Determines if the map is visible to the Germinate interface or hidden.
     */
    public Byte getVisibility() {
        return (Byte) get(4);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.view_table_maps.markerCount</code>.
     */
    public Long getMarkercount() {
        return (Long) get(5);
    }
}
