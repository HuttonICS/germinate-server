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
 * Defines the mega environments if used and their temperature and precipitation 
 * ranges.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MegaenvironmentsRecord extends UpdatableRecordImpl<MegaenvironmentsRecord> implements Record8<Integer, String, Integer, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -34498464;

    /**
     * Create a detached MegaenvironmentsRecord
     */
    public MegaenvironmentsRecord() {
        super(Megaenvironments.MEGAENVIRONMENTS);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.megaenvironments.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Create a detached, initialised MegaenvironmentsRecord
     */
    public MegaenvironmentsRecord(Integer id, String name, Integer maxTempLower, Integer maxTempUpper, Integer precipLower, Integer precipUpper, Timestamp createdOn, Timestamp updatedOn) {
        super(Megaenvironments.MEGAENVIRONMENTS);

        set(0, id);
        set(1, name);
        set(2, maxTempLower);
        set(3, maxTempUpper);
        set(4, precipLower);
        set(5, precipUpper);
        set(6, createdOn);
        set(7, updatedOn);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.megaenvironments.name</code>. The mega environment name.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.megaenvironments.max_temp_lower</code>. The lower maximum temperature for this environment.
     */
    public void setMaxTempLower(Integer value) {
        set(2, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.megaenvironments.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.megaenvironments.max_temp_upper</code>. The maximum temperature for this environment.
     */
    public void setMaxTempUpper(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.megaenvironments.max_temp_upper</code>. The maximum temperature for this environment.
     */
    public Integer getMaxTempUpper() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.megaenvironments.name</code>. The mega environment name.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.megaenvironments.precip_lower</code>. The minimum precipitation for this environment.
     */
    public Integer getPrecipLower() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.megaenvironments.precip_upper</code>. the maximum precipitation for this environment.
     */
    public void setPrecipUpper(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.megaenvironments.max_temp_lower</code>. The lower maximum temperature for this environment.
     */
    public Integer getMaxTempLower() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.megaenvironments.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.megaenvironments.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.megaenvironments.precip_lower</code>. The minimum precipitation for this environment.
     */
    public void setPrecipLower(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.megaenvironments.precip_upper</code>. the maximum precipitation for this environment.
     */
    public Integer getPrecipUpper() {
        return (Integer) get(5);
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
    public Row8<Integer, String, Integer, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, String, Integer, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Megaenvironments.MEGAENVIRONMENTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Megaenvironments.MEGAENVIRONMENTS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Megaenvironments.MEGAENVIRONMENTS.MAX_TEMP_LOWER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Megaenvironments.MEGAENVIRONMENTS.MAX_TEMP_UPPER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Megaenvironments.MEGAENVIRONMENTS.PRECIP_LOWER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Megaenvironments.MEGAENVIRONMENTS.PRECIP_UPPER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Megaenvironments.MEGAENVIRONMENTS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Megaenvironments.MEGAENVIRONMENTS.UPDATED_ON;
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
    public Integer component3() {
        return getMaxTempLower();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getMaxTempUpper();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getPrecipLower();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getPrecipUpper();
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
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getMaxTempLower();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getMaxTempUpper();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getPrecipLower();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getPrecipUpper();
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
    public MegaenvironmentsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MegaenvironmentsRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MegaenvironmentsRecord value3(Integer value) {
        setMaxTempLower(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MegaenvironmentsRecord value4(Integer value) {
        setMaxTempUpper(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MegaenvironmentsRecord value5(Integer value) {
        setPrecipLower(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MegaenvironmentsRecord value6(Integer value) {
        setPrecipUpper(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MegaenvironmentsRecord value7(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MegaenvironmentsRecord value8(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MegaenvironmentsRecord values(Integer value1, String value2, Integer value3, Integer value4, Integer value5, Integer value6, Timestamp value7, Timestamp value8) {
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
     * Getter for <code>germinate_template_3_7_0.megaenvironments.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.megaenvironments.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(7, value);
    }
}
