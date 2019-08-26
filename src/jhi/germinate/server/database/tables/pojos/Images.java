/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class Images implements Serializable {

    private static final long serialVersionUID = 991509222;

    private Integer   id;
    private Integer   imagetypeId;
    private String    description;
    private Integer   foreignId;
    private String    path;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Images() {}

    public Images(Images value) {
        this.id = value.id;
        this.imagetypeId = value.imagetypeId;
        this.description = value.description;
        this.foreignId = value.foreignId;
        this.path = value.path;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Images(
        Integer   id,
        Integer   imagetypeId,
        String    description,
        Integer   foreignId,
        String    path,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.imagetypeId = imagetypeId;
        this.description = description;
        this.foreignId = foreignId;
        this.path = path;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImagetypeId() {
        return this.imagetypeId;
    }

    public void setImagetypeId(Integer imagetypeId) {
        this.imagetypeId = imagetypeId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getForeignId() {
        return this.foreignId;
    }

    public void setForeignId(Integer foreignId) {
        this.foreignId = foreignId;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
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
        StringBuilder sb = new StringBuilder("Images (");

        sb.append(id);
        sb.append(", ").append(imagetypeId);
        sb.append(", ").append(description);
        sb.append(", ").append(foreignId);
        sb.append(", ").append(path);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
}
