/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import org.jooq.*;
import org.jooq.impl.UpdatableRecordImpl;

import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.tables.Synonyms;


// @formatter:off
/**
 * Allows the definition of synonyms for entries such as germinatebase entries 
 * or marker names.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SynonymsRecord extends UpdatableRecordImpl<SynonymsRecord> implements Record6<Integer, Integer, Integer, Object, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1780152286;

    /**
     * Create a detached SynonymsRecord
     */
    public SynonymsRecord() {
        super(Synonyms.SYNONYMS);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.synonyms.id</code>. Primary id for this table. This uniquely identifies the row.

     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Create a detached, initialised SynonymsRecord
     */
    public SynonymsRecord(Integer id, Integer foreignId, Integer synonymtypeId, Object synonyms, Timestamp createdOn, Timestamp updatedOn) {
        super(Synonyms.SYNONYMS);

        set(0, id);
        set(1, foreignId);
        set(2, synonymtypeId);
        set(3, synonyms);
        set(4, createdOn);
        set(5, updatedOn);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.synonyms.foreign_id</code>. Foreign key to target table (l[targettable].id).
     */
    public Integer getForeignId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.synonyms.id</code>. Primary id for this table. This uniquely identifies the row.

     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.synonyms.foreign_id</code>. Foreign key to target table (l[targettable].id).
     */
    public void setForeignId(Integer value) {
        set(1, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setSynonyms(Object value) {
        set(3, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getSynonyms() {
        return get(3);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.synonyms.synonymtype_id</code>. Foreign key to synonymtypes (synonymnstypes.id).
     */
    public Integer getSynonymtypeId() {
        return (Integer) get(2);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.synonyms.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.synonyms.synonymtype_id</code>. Foreign key to synonymtypes (synonymnstypes.id).
     */
    public void setSynonymtypeId(Integer value) {
        set(2, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.synonyms.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Object, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Object, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Synonyms.SYNONYMS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Synonyms.SYNONYMS.FOREIGN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Synonyms.SYNONYMS.SYNONYMTYPE_ID;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field4() {
        return Synonyms.SYNONYMS.SYNONYMS_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Synonyms.SYNONYMS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Synonyms.SYNONYMS.UPDATED_ON;
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
        return getForeignId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getSynonymtypeId();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component4() {
        return getSynonyms();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
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
        return getForeignId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSynonymtypeId();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value4() {
        return getSynonyms();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getUpdatedOn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SynonymsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SynonymsRecord value2(Integer value) {
        setForeignId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SynonymsRecord value3(Integer value) {
        setSynonymtypeId(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public SynonymsRecord value4(Object value) {
        setSynonyms(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SynonymsRecord value5(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SynonymsRecord value6(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SynonymsRecord values(Integer value1, Integer value2, Integer value3, Object value4, Timestamp value5, Timestamp value6) {
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
     * Getter for <code>germinate_template_3_7_0.synonyms.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.synonyms.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(5, value);
    }
// @formatter:on
}
