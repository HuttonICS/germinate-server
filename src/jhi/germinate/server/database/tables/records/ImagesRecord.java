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
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ImagesRecord extends UpdatableRecordImpl<ImagesRecord> implements Record7<Integer, Integer, String, Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -2051456666;

    /**
     * Create a detached ImagesRecord
     */
    public ImagesRecord() {
        super(Images.IMAGES);
    }

    /**
     * Getter for <code>germinate_template_3_6_0.images.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Create a detached, initialised ImagesRecord
     */
    public ImagesRecord(Integer id, Integer imagetypeId, String description, Integer foreignId, String path, Timestamp createdOn, Timestamp updatedOn) {
        super(Images.IMAGES);

        set(0, id);
        set(1, imagetypeId);
        set(2, description);
        set(3, foreignId);
        set(4, path);
        set(5, createdOn);
        set(6, updatedOn);
    }

    /**
     * Getter for <code>germinate_template_3_6_0.images.imagetype_id</code>. Foreign key to imagetypes (imagetypes.id).
     */
    public Integer getImagetypeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_template_3_6_0.images.description</code>. A description of what the image shows if required.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Setter for <code>germinate_template_3_6_0.images.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Setter for <code>germinate_template_3_6_0.images.foreign_id</code>. Relates to the UID of the table to which the comment relates.
     */
    public void setForeignId(Integer value) {
        set(3, value);
    }

    /**
     * Setter for <code>germinate_template_3_6_0.images.imagetype_id</code>. Foreign key to imagetypes (imagetypes.id).
     */
    public void setImagetypeId(Integer value) {
        set(1, value);
    }

    /**
     * Setter for <code>germinate_template_3_6_0.images.path</code>. The file system path to the image.
     */
    public void setPath(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>germinate_template_3_6_0.images.description</code>. A description of what the image shows if required.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_3_6_0.images.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_3_6_0.images.foreign_id</code>. Relates to the UID of the table to which the comment relates.
     */
    public Integer getForeignId() {
        return (Integer) get(3);
    }

    /**
     * Getter for <code>germinate_template_3_6_0.images.path</code>. The file system path to the image.
     */
    public String getPath() {
        return (String) get(4);
    }

    /**
     * Getter for <code>germinate_template_3_6_0.images.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
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
    public Row7<Integer, Integer, String, Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Images.IMAGES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Images.IMAGES.IMAGETYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Images.IMAGES.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Images.IMAGES.FOREIGN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Images.IMAGES.PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Images.IMAGES.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Images.IMAGES.UPDATED_ON;
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
        return getImagetypeId();
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
    public Integer component4() {
        return getForeignId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPath();
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
    public Integer value2() {
        return getImagetypeId();
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
    public Integer value4() {
        return getForeignId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPath();
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
    public ImagesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImagesRecord value2(Integer value) {
        setImagetypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImagesRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImagesRecord value4(Integer value) {
        setForeignId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImagesRecord value5(String value) {
        setPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImagesRecord value6(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImagesRecord value7(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImagesRecord values(Integer value1, Integer value2, String value3, Integer value4, String value5, Timestamp value6, Timestamp value7) {
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
     * Getter for <code>germinate_template_3_6_0.images.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>germinate_template_3_6_0.images.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(6, value);
    }
}
