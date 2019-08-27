/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


// @formatter:off
/**
 * Defines attributes data. Attributes which are defined in attributes can 
 * have values associated with them. Data which does not warrant new column 
 * in the germinatebase table can be added here. Examples include small amounts 
 * of data defining germplasm which only exists for a small sub-group of the 
 * total database.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Attributedata implements Serializable {

    private static final long serialVersionUID = 175325949;

    private Integer   id;
    private Integer   attributeId;
    private Integer   foreignId;
    private String    value;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Attributedata() {}

    public Attributedata(Attributedata value) {
        this.id = value.id;
        this.attributeId = value.attributeId;
        this.foreignId = value.foreignId;
        this.value = value.value;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Attributedata(
        Integer   id,
        Integer   attributeId,
        Integer   foreignId,
        String    value,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.attributeId = attributeId;
        this.foreignId = foreignId;
        this.value = value;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAttributeId() {
        return this.attributeId;
    }

    public void setAttributeId(Integer attributeId) {
        this.attributeId = attributeId;
    }

    public Integer getForeignId() {
        return this.foreignId;
    }

    public void setForeignId(Integer foreignId) {
        this.foreignId = foreignId;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
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
        StringBuilder sb = new StringBuilder("Attributedata (");

        sb.append(id);
        sb.append(", ").append(attributeId);
        sb.append(", ").append(foreignId);
        sb.append(", ").append(value);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
