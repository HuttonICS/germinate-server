/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jhi.germinate.server.database.enums.AttributesDatatype;


// @formatter:off
/**
 * Describes attributes. Attributes are bits of information that can be joined 
 * to, for example, a germinatebase entry. These are bits of data that while 
 * important do not warrant adding additional columns in the other tables. 
 * Examples would be using this to define ecotypes for germinatebase entries.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Attributes implements Serializable {

    private static final long serialVersionUID = -1447057369;

    private Integer            id;
    private String             name;
    private String             description;
    private AttributesDatatype datatype;
    private String             targetTable;
    private Timestamp          createdOn;
    private Timestamp          updatedOn;

    public Attributes() {}

    public Attributes(Attributes value) {
        this.id = value.id;
        this.name = value.name;
        this.description = value.description;
        this.datatype = value.datatype;
        this.targetTable = value.targetTable;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Attributes(
        Integer            id,
        String             name,
        String             description,
        AttributesDatatype datatype,
        String             targetTable,
        Timestamp          createdOn,
        Timestamp          updatedOn
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.datatype = datatype;
        this.targetTable = targetTable;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AttributesDatatype getDatatype() {
        return this.datatype;
    }

    public void setDatatype(AttributesDatatype datatype) {
        this.datatype = datatype;
    }

    public String getTargetTable() {
        return this.targetTable;
    }

    public void setTargetTable(String targetTable) {
        this.targetTable = targetTable;
    }

    public Timestamp getCreatedOn() {
        return this.createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public Timestamp getUpdatedOn() {
        return this.updatedOn;
    }

    public void setUpdatedOn(Timestamp updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Attributes (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(datatype);
        sb.append(", ").append(targetTable);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
