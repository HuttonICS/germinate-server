/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import org.jooq.*;
import org.jooq.impl.*;

import java.sql.Date;
import java.sql.*;
import java.util.*;

import javax.annotation.*;

import jhi.germinate.server.database.*;
import jhi.germinate.server.database.tables.records.*;


/**
 * Germinatebase is the Germinate base table which contains passport and other 
 * germplasm definition data.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Germinatebase extends TableImpl<GerminatebaseRecord> {

    private static final long serialVersionUID = 461590991;

    /**
     * The reference instance of <code>germinate_template_3_6_0.germinatebase</code>
     */
    public static final Germinatebase GERMINATEBASE = new Germinatebase();
    /**
     * The column <code>germinate_template_3_6_0.germinatebase.colldate</code>. Collecting date of the sample, where YYYY is the year, MM is the month and DD is the day.
Missing data (MM or DD) should be indicated with hyphens or ‘00’ [double zero].
     */
    public final TableField<GerminatebaseRecord, Date> COLLDATE = createField("colldate", org.jooq.impl.SQLDataType.DATE, this, "Collecting date of the sample, where YYYY is the year, MM is the month and DD is the day.\nMissing data (MM or DD) should be indicated with hyphens or ‘00’ [double zero]. ");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.id</code>. Primary id for this table. This uniquely identifies the row.
     */
    public final TableField<GerminatebaseRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "Primary id for this table. This uniquely identifies the row.");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.general_identifier</code>. A unique identifier.
     */
    public final TableField<GerminatebaseRecord, String> GENERAL_IDENTIFIER = createField("general_identifier", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "A unique identifier.");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.number</code>. This is the unique identifier for accessions within a genebank, and is assigned when a sample is
entered into the genebank collection (e.g. ‘PI 113869’).
     */
    public final TableField<GerminatebaseRecord, String> NUMBER = createField("number", org.jooq.impl.SQLDataType.VARCHAR(255), this, "This is the unique identifier for accessions within a genebank, and is assigned when a sample is\nentered into the genebank collection (e.g. ‘PI 113869’).");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.name</code>. A unique name which defines an entry in the germinatbase table.
     */
    public final TableField<GerminatebaseRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "A unique name which defines an entry in the germinatbase table.");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.bank_number</code>. Alternative genebank number.
     */
    public final TableField<GerminatebaseRecord, String> BANK_NUMBER = createField("bank_number", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Alternative genebank number.");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.breeders_code</code>. FAO WIEWS code of the institute that has bred the material. If the holding institute has bred the material, the breeding institute code (BREDCODE) should be the same as the holding institute code (INSTCODE). Follows INSTCODE standard. Multiple values are separated by a semicolon without space.
     */
    public final TableField<GerminatebaseRecord, String> BREEDERS_CODE = createField("breeders_code", org.jooq.impl.SQLDataType.CHAR(50), this, "FAO WIEWS code of the institute that has bred the material. If the holding institute has bred the material, the breeding institute code (BREDCODE) should be the same as the holding institute code (INSTCODE). Follows INSTCODE standard. Multiple values are separated by a semicolon without space.");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.breeders_name</code>. Name of the institute (or person) that bred the material. This descriptor should be used only if BREDCODE cannot be filled because the FAO WIEWS code for this institute is not available. Multiple names are separated by a semicolon without space.
     */
    public final TableField<GerminatebaseRecord, String> BREEDERS_NAME = createField("breeders_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Name of the institute (or person) that bred the material. This descriptor should be used only if BREDCODE cannot be filled because the FAO WIEWS code for this institute is not available. Multiple names are separated by a semicolon without space.");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.taxonomy_id</code>. Foreign key to taxonomies (taxonomies.id).
     */
    public final TableField<GerminatebaseRecord, Integer> TAXONOMY_ID = createField("taxonomy_id", org.jooq.impl.SQLDataType.INTEGER, this, "Foreign key to taxonomies (taxonomies.id).");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.institution_id</code>. Foreign key to institutions (institutions.id).
     */
    public final TableField<GerminatebaseRecord, Integer> INSTITUTION_ID = createField("institution_id", org.jooq.impl.SQLDataType.INTEGER, this, "Foreign key to institutions (institutions.id).");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.plant_passport</code>. Record if the entry has a plant passport.
     */
    public final TableField<GerminatebaseRecord, String> PLANT_PASSPORT = createField("plant_passport", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Record if the entry has a plant passport.");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.donor_code</code>. FAO WIEWS code of the donor institute. Follows INSTCODE standard.
     */
    public final TableField<GerminatebaseRecord, String> DONOR_CODE = createField("donor_code", org.jooq.impl.SQLDataType.VARCHAR(255), this, "FAO WIEWS code of the donor institute. Follows INSTCODE standard.");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.donor_name</code>. Name of the donor institute (or person). This descriptor should be used only if DONORCODE cannot be filled because the FAO WIEWS code for this institute is not available.
     */
    public final TableField<GerminatebaseRecord, String> DONOR_NAME = createField("donor_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Name of the donor institute (or person). This descriptor should be used only if DONORCODE cannot be filled because the FAO WIEWS code for this institute is not available.");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.donor_number</code>. Identifier assigned to an accession by the donor. Follows ACCENUMB standard.
     */
    public final TableField<GerminatebaseRecord, String> DONOR_NUMBER = createField("donor_number", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Identifier assigned to an accession by the donor. Follows ACCENUMB standard.");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.acqdate</code>. Date on which the accession entered the collection where YYYY is the year, MM is the month and
DD is the day. Missing data (MM or DD) should be indicated with hyphens or ‘00’ [double zero].
     */
    public final TableField<GerminatebaseRecord, String> ACQDATE = createField("acqdate", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Date on which the accession entered the collection where YYYY is the year, MM is the month and\nDD is the day. Missing data (MM or DD) should be indicated with hyphens or ‘00’ [double zero].");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.collnumb</code>. Original identifier assigned by the collector(s) of the sample, normally composed of the name or
initials of the collector(s) followed by a number (e.g. ‘FM9909’). This identifier is essential for
identifying duplicates held in different collections.
     */
    public final TableField<GerminatebaseRecord, String> COLLNUMB = createField("collnumb", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Original identifier assigned by the collector(s) of the sample, normally composed of the name or\ninitials of the collector(s) followed by a number (e.g. ‘FM9909’). This identifier is essential for\nidentifying duplicates held in different collections.");

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GerminatebaseRecord> getRecordType() {
        return GerminatebaseRecord.class;
    }

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.collcode</code>. FAO WIEWS code of the institute collecting the sample. If the holding institute has collected the
material, the collecting institute code (COLLCODE) should be the same as the holding institute
code (INSTCODE). Follows INSTCODE standard. Multiple values are separated by a semicolon
without space.
     */
    public final TableField<GerminatebaseRecord, String> COLLCODE = createField("collcode", org.jooq.impl.SQLDataType.VARCHAR(255), this, "FAO WIEWS code of the institute collecting the sample. If the holding institute has collected the\nmaterial, the collecting institute code (COLLCODE) should be the same as the holding institute\ncode (INSTCODE). Follows INSTCODE standard. Multiple values are separated by a semicolon\nwithout space.");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.collname</code>. Name of the institute collecting the sample. This descriptor should be used only if COLLCODE cannot be filled because the FAO WIEWS code for this institute is not available. Multiple values are separated by a semicolon without space.
     */
    public final TableField<GerminatebaseRecord, String> COLLNAME = createField("collname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Name of the institute collecting the sample. This descriptor should be used only if COLLCODE cannot be filled because the FAO WIEWS code for this institute is not available. Multiple values are separated by a semicolon without space.");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.collmissid</code>. Identifier of the collecting mission used by the Collecting Institute (4 or 4.1) (e.g. 'CIATFOR-052', 'CN426').
     */
    public final TableField<GerminatebaseRecord, String> COLLMISSID = createField("collmissid", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Identifier of the collecting mission used by the Collecting Institute (4 or 4.1) (e.g. 'CIATFOR-052', 'CN426').");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.othernumb</code>. Any other identifiers known to exist in other collections for this accession. Use the following format: INSTCODE:ACCENUMB;INSTCODE:identifier;… INSTCODE and identifier are separated by a colon without space. Pairs of INSTCODE and identifier are separated by a semicolon without space. When the institute is not known, the identifier should be preceded by a colon.
     */
    public final TableField<GerminatebaseRecord, String> OTHERNUMB = createField("othernumb", org.jooq.impl.SQLDataType.CLOB, this, "Any other identifiers known to exist in other collections for this accession. Use the following format: INSTCODE:ACCENUMB;INSTCODE:identifier;… INSTCODE and identifier are separated by a colon without space. Pairs of INSTCODE and identifier are separated by a semicolon without space. When the institute is not known, the identifier should be preceded by a colon.");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.duplsite</code>. FAO WIEWS code of the institute(s) where a safety duplicate of the accession is maintained.
Multiple values are separated by a semicolon without space. Follows INSTCODE standard.
     */
    public final TableField<GerminatebaseRecord, String> DUPLSITE = createField("duplsite", org.jooq.impl.SQLDataType.VARCHAR(255), this, "FAO WIEWS code of the institute(s) where a safety duplicate of the accession is maintained.\nMultiple values are separated by a semicolon without space. Follows INSTCODE standard.");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.duplinstname</code>. Name of the institute where a safety duplicate of the accession is maintained. Multiple values are separated by a semicolon without space.
     */
    public final TableField<GerminatebaseRecord, String> DUPLINSTNAME = createField("duplinstname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Name of the institute where a safety duplicate of the accession is maintained. Multiple values are separated by a semicolon without space.");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.mlsstatus_id</code>. Foreign key to mlsstatus (mlsstatus.id).
     */
    public final TableField<GerminatebaseRecord, Integer> MLSSTATUS_ID = createField("mlsstatus_id", org.jooq.impl.SQLDataType.INTEGER, this, "Foreign key to mlsstatus (mlsstatus.id).");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.puid</code>. Any persistent, unique identifier assigned to the accession so it can be unambiguously referenced at the global level and the information associated with it harvested through automated means. Report one PUID for each accession.
     */
    public final TableField<GerminatebaseRecord, String> PUID = createField("puid", org.jooq.impl.SQLDataType.VARCHAR(255), this, "Any persistent, unique identifier assigned to the accession so it can be unambiguously referenced at the global level and the information associated with it harvested through automated means. Report one PUID for each accession.");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.biologicalstatus_id</code>. Foreign key to biologicalstatus (biologicalstaus.id).
     */
    public final TableField<GerminatebaseRecord, Integer> BIOLOGICALSTATUS_ID = createField("biologicalstatus_id", org.jooq.impl.SQLDataType.INTEGER, this, "Foreign key to biologicalstatus (biologicalstaus.id).");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.collsrc_id</code>. Foreign key to collectionsources (collectionsources.id).
     */
    public final TableField<GerminatebaseRecord, Integer> COLLSRC_ID = createField("collsrc_id", org.jooq.impl.SQLDataType.INTEGER, this, "Foreign key to collectionsources (collectionsources.id).");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.location_id</code>. Foreign key to locations (locations.id).
     */
    public final TableField<GerminatebaseRecord, Integer> LOCATION_ID = createField("location_id", org.jooq.impl.SQLDataType.INTEGER, this, "Foreign key to locations (locations.id).");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.entitytype_id</code>. Foreign key to entitytypes (entitytypes.id).
     */
    public final TableField<GerminatebaseRecord, Integer> ENTITYTYPE_ID = createField("entitytype_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "Foreign key to entitytypes (entitytypes.id).");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.entityparent_id</code>. Foreign key to germinatebase (germinatebase.id).
     */
    public final TableField<GerminatebaseRecord, Integer> ENTITYPARENT_ID = createField("entityparent_id", org.jooq.impl.SQLDataType.INTEGER, this, "Foreign key to germinatebase (germinatebase.id).");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.pdci</code>. Passport Data Completeness Index. This is calculated by Germinate. Manual editing of this field will be overwritten.
     */
    public final TableField<GerminatebaseRecord, Double> PDCI = createField("pdci", org.jooq.impl.SQLDataType.FLOAT, this, "Passport Data Completeness Index. This is calculated by Germinate. Manual editing of this field will be overwritten.");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.created_on</code>. When the record was created.
     */
    public final TableField<GerminatebaseRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was created.");

    /**
     * The column <code>germinate_template_3_6_0.germinatebase.updated_on</code>. When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.
     */
    public final TableField<GerminatebaseRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When the record was updated. This may be different from the created on date if subsequent changes have been made to the underlying record.");

    /**
     * Create a <code>germinate_template_3_6_0.germinatebase</code> table reference
     */
    public Germinatebase() {
        this(DSL.name("germinatebase"), null);
    }

    /**
     * Create an aliased <code>germinate_template_3_6_0.germinatebase</code> table reference
     */
    public Germinatebase(String alias) {
        this(DSL.name(alias), GERMINATEBASE);
    }

    /**
     * Create an aliased <code>germinate_template_3_6_0.germinatebase</code> table reference
     */
    public Germinatebase(Name alias) {
        this(alias, GERMINATEBASE);
    }

    private Germinatebase(Name alias, Table<GerminatebaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private Germinatebase(Name alias, Table<GerminatebaseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Germinatebase is the Germinate base table which contains passport and other germplasm definition data."));
    }

    public <O extends Record> Germinatebase(Table<O> child, ForeignKey<O, GerminatebaseRecord> key) {
        super(child, key, GERMINATEBASE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return GerminateTemplate_3_6_0.GERMINATE_TEMPLATE_3_6_0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.GERMINATEBASE_COLLSITE_ID, Indexes.GERMINATEBASE_GENERAL_IDENTIFIER, Indexes.GERMINATEBASE_GERMINATEBASE_IBFK_8, Indexes.GERMINATEBASE_GERMINATEBASE_IBFK_BIOLOGICALSTATUS, Indexes.GERMINATEBASE_GERMINATEBASE_IBFK_COLLECTINGSOURCE, Indexes.GERMINATEBASE_GERMINATEBASE_IBFK_ENTITYPARENT, Indexes.GERMINATEBASE_GERMINATEBASE_IBFK_ENTITYTYPE, Indexes.GERMINATEBASE_INSTITUTION_ID, Indexes.GERMINATEBASE_PRIMARY, Indexes.GERMINATEBASE_TAXONOMY_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GerminatebaseRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GERMINATEBASE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GerminatebaseRecord> getPrimaryKey() {
        return Keys.KEY_GERMINATEBASE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GerminatebaseRecord>> getKeys() {
        return Arrays.<UniqueKey<GerminatebaseRecord>>asList(Keys.KEY_GERMINATEBASE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<GerminatebaseRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<GerminatebaseRecord, ?>>asList(Keys.GERMINATEBASE_IBFK_TAXONOMY, Keys.GERMINATEBASE_IBFK_INSTITUTION, Keys.GERMINATEBASE_IBFK_MLSSTATUS, Keys.GERMINATEBASE_IBFK_BIOLOGICALSTATUS, Keys.GERMINATEBASE_IBFK_COLLSRC, Keys.GERMINATEBASE_IBFK_LOCATION, Keys.GERMINATEBASE_IBFK_ENTITYTYPE, Keys.GERMINATEBASE_IBFK_ENTITYPARENT);
    }

    public Taxonomies taxonomies() {
        return new Taxonomies(this, Keys.GERMINATEBASE_IBFK_TAXONOMY);
    }

    public Institutions institutions() {
        return new Institutions(this, Keys.GERMINATEBASE_IBFK_INSTITUTION);
    }

    public Mlsstatus mlsstatus() {
        return new Mlsstatus(this, Keys.GERMINATEBASE_IBFK_MLSSTATUS);
    }

    public Biologicalstatus biologicalstatus() {
        return new Biologicalstatus(this, Keys.GERMINATEBASE_IBFK_BIOLOGICALSTATUS);
    }

    public Collectingsources collectingsources() {
        return new Collectingsources(this, Keys.GERMINATEBASE_IBFK_COLLSRC);
    }

    public Locations locations() {
        return new Locations(this, Keys.GERMINATEBASE_IBFK_LOCATION);
    }

    public Entitytypes entitytypes() {
        return new Entitytypes(this, Keys.GERMINATEBASE_IBFK_ENTITYTYPE);
    }

    public jhi.germinate.server.database.tables.Germinatebase germinatebase() {
        return new jhi.germinate.server.database.tables.Germinatebase(this, Keys.GERMINATEBASE_IBFK_ENTITYPARENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Germinatebase as(String alias) {
        return new Germinatebase(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Germinatebase as(Name alias) {
        return new Germinatebase(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Germinatebase rename(String name) {
        return new Germinatebase(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Germinatebase rename(Name name) {
        return new Germinatebase(name, null);
    }
}
