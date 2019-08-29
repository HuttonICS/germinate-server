/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.tables.Institutions;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


// @formatter:off
/**
 * Defines institutions within Germinate. Accessions may be associated with 
 * an institute and this can be defined here.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InstitutionsRecord extends UpdatableRecordImpl<InstitutionsRecord> implements Record11<Integer, String, String, String, Integer, String, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1351732082;

    /**
     * Create a detached InstitutionsRecord
     */
    public InstitutionsRecord() {
        super(Institutions.INSTITUTIONS);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.institutions.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Create a detached, initialised InstitutionsRecord
     */
    public InstitutionsRecord(Integer id, String code, String name, String acronym, Integer countryId, String contact, String phone, String email, String address, Timestamp createdOn, Timestamp updatedOn) {
        super(Institutions.INSTITUTIONS);

        set(0, id);
        set(1, code);
        set(2, name);
        set(3, acronym);
        set(4, countryId);
        set(5, contact);
        set(6, phone);
        set(7, email);
        set(8, address);
        set(9, createdOn);
        set(10, updatedOn);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.institutions.code</code>. If there is a defined ISO code for the institute this should be used here.
     */
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.institutions.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.institutions.name</code>. The institute name.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.institutions.acronym</code>. If there is an acronym for the institute.
     */
    public void setAcronym(String value) {
        set(3, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.institutions.code</code>. If there is a defined ISO code for the institute this should be used here.
     */
    public void setCode(String value) {
        set(1, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.institutions.country_id</code>. Foreign key to countries.id.
     */
    public void setCountryId(Integer value) {
        set(4, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.institutions.name</code>. The institute name.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.institutions.contact</code>. The contact at the institute which should be used for correspondence.
     */
    public void setContact(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.institutions.contact</code>. The contact at the institute which should be used for correspondence.
     */
    public String getContact() {
        return (String) get(5);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.institutions.acronym</code>. If there is an acronym for the institute.
     */
    public String getAcronym() {
        return (String) get(3);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.institutions.phone</code>. The telephone number for the institute.
     */
    public String getPhone() {
        return (String) get(6);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.institutions.email</code>. The email address to contact the institute.
     */
    public void setEmail(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.institutions.email</code>. The email address to contact the institute.
     */
    public String getEmail() {
        return (String) get(7);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.institutions.address</code>. The postal address of the institute.
     */
    public void setAddress(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.institutions.address</code>. The postal address of the institute.
     */
    public String getAddress() {
        return (String) get(8);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.institutions.created_on</code>. When the record was created.
     */
    public void setCreatedOn(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.institutions.country_id</code>. Foreign key to countries.id.
     */
    public Integer getCountryId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.institutions.phone</code>. The telephone number for the institute.
     */
    public void setPhone(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>germinate_template_3_7_0.institutions.created_on</code>. When the record was created.
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) get(9);
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
    public Row11<Integer, String, String, String, Integer, String, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, String, String, Integer, String, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Institutions.INSTITUTIONS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Institutions.INSTITUTIONS.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Institutions.INSTITUTIONS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Institutions.INSTITUTIONS.ACRONYM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Institutions.INSTITUTIONS.COUNTRY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Institutions.INSTITUTIONS.CONTACT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Institutions.INSTITUTIONS.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Institutions.INSTITUTIONS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Institutions.INSTITUTIONS.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return Institutions.INSTITUTIONS.CREATED_ON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Institutions.INSTITUTIONS.UPDATED_ON;
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
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAcronym();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getContact();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getAddress();
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
    public String value2() {
        return getCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAcronym();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getContact();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getAddress();
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
    public InstitutionsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstitutionsRecord value2(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstitutionsRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstitutionsRecord value4(String value) {
        setAcronym(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstitutionsRecord value5(Integer value) {
        setCountryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstitutionsRecord value6(String value) {
        setContact(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstitutionsRecord value7(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstitutionsRecord value8(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstitutionsRecord value9(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstitutionsRecord value10(Timestamp value) {
        setCreatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstitutionsRecord value11(Timestamp value) {
        setUpdatedOn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstitutionsRecord values(Integer value1, String value2, String value3, String value4, Integer value5, String value6, String value7, String value8, String value9, Timestamp value10, Timestamp value11) {
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
     * Getter for <code>germinate_template_3_7_0.institutions.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>germinate_template_3_7_0.institutions.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public void setUpdatedOn(Timestamp value) {
        set(10, value);
    }
// @formatter:on
}
