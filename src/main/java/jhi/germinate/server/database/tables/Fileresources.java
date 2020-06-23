/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jhi.germinate.server.database.GerminateTemplate_4_20_06_15;
import jhi.germinate.server.database.tables.records.FileresourcesRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.TableImpl;


// @formatter:off
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
public class Fileresources extends TableImpl<FileresourcesRecord> {

    private static final long serialVersionUID = 1098394513;

    /**
     * The reference instance of <code>germinate_template_4_20_06_15.fileresources</code>
     */
    public static final Fileresources FILERESOURCES = new Fileresources();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FileresourcesRecord> getRecordType() {
        return FileresourcesRecord.class;
    }

    /**
     * The column <code>germinate_template_4_20_06_15.fileresources.id</code>. The primary id.
     */
    public final TableField<FileresourcesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "The primary id.");

    /**
     * The column <code>germinate_template_4_20_06_15.fileresources.name</code>. The name of the file resource.
     */
    public final TableField<FileresourcesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "The name of the file resource.");

    /**
     * The column <code>germinate_template_4_20_06_15.fileresources.path</code>. The file name of the actual data file.
     */
    public final TableField<FileresourcesRecord, String> PATH = createField("path", org.jooq.impl.SQLDataType.CLOB, this, "The file name of the actual data file.");

    /**
     * The column <code>germinate_template_4_20_06_15.fileresources.description</code>. A description of the file contents.
     */
    public final TableField<FileresourcesRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "A description of the file contents.");

    /**
     * The column <code>germinate_template_4_20_06_15.fileresources.filesize</code>. The file size in bytes.
     */
    public final TableField<FileresourcesRecord, Long> FILESIZE = createField("filesize", org.jooq.impl.SQLDataType.BIGINT, this, "The file size in bytes.");

    /**
     * The column <code>germinate_template_4_20_06_15.fileresources.fileresourcetype_id</code>. Foreign key to fileresourcetypes.
     */
    public final TableField<FileresourcesRecord, Integer> FILERESOURCETYPE_ID = createField("fileresourcetype_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "Foreign key to fileresourcetypes.");

    /**
     * The column <code>germinate_template_4_20_06_15.fileresources.created_on</code>. When this record was created.
     */
    public final TableField<FileresourcesRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When this record was created.");

    /**
     * The column <code>germinate_template_4_20_06_15.fileresources.updated_on</code>. When this record was last updated.
     */
    public final TableField<FileresourcesRecord, Timestamp> UPDATED_ON = createField("updated_on", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "When this record was last updated.");

    /**
     * Create a <code>germinate_template_4_20_06_15.fileresources</code> table reference
     */
    public Fileresources() {
        this(DSL.name("fileresources"), null);
    }

    /**
     * Create an aliased <code>germinate_template_4_20_06_15.fileresources</code> table reference
     */
    public Fileresources(String alias) {
        this(DSL.name(alias), FILERESOURCES);
    }

    /**
     * Create an aliased <code>germinate_template_4_20_06_15.fileresources</code> table reference
     */
    public Fileresources(Name alias) {
        this(alias, FILERESOURCES);
    }

    private Fileresources(Name alias, Table<FileresourcesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Fileresources(Name alias, Table<FileresourcesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return GerminateTemplate_4_20_06_15.GERMINATE_TEMPLATE_4_20_06_15;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FileresourcesRecord, Integer> getIdentity() {
        return Internal.createIdentity(jhi.germinate.server.database.tables.Fileresources.FILERESOURCES, jhi.germinate.server.database.tables.Fileresources.FILERESOURCES.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FileresourcesRecord> getPrimaryKey() {
        return Internal.createUniqueKey(jhi.germinate.server.database.tables.Fileresources.FILERESOURCES, "KEY_fileresources_PRIMARY", jhi.germinate.server.database.tables.Fileresources.FILERESOURCES.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FileresourcesRecord>> getKeys() {
        return Arrays.<UniqueKey<FileresourcesRecord>>asList(
              Internal.createUniqueKey(jhi.germinate.server.database.tables.Fileresources.FILERESOURCES, "KEY_fileresources_PRIMARY", jhi.germinate.server.database.tables.Fileresources.FILERESOURCES.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Fileresources as(String alias) {
        return new Fileresources(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Fileresources as(Name alias) {
        return new Fileresources(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Fileresources rename(String name) {
        return new Fileresources(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Fileresources rename(Name name) {
        return new Fileresources(name, null);
    }
// @formatter:on
}