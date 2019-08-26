/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * Germinate allows to define external links for different types of data. 
 * With this feature you can
 * define links to external resources.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Links implements Serializable {

    private static final long serialVersionUID = -1531081808;

    private Integer   id;
    private Integer   linktypeId;
    private Integer   foreignId;
    private String    hyperlink;
    private String    description;
    private Byte      visibility;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Links() {}

    public Links(Links value) {
        this.id = value.id;
        this.linktypeId = value.linktypeId;
        this.foreignId = value.foreignId;
        this.hyperlink = value.hyperlink;
        this.description = value.description;
        this.visibility = value.visibility;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Links(
        Integer   id,
        Integer   linktypeId,
        Integer   foreignId,
        String    hyperlink,
        String    description,
        Byte      visibility,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.linktypeId = linktypeId;
        this.foreignId = foreignId;
        this.hyperlink = hyperlink;
        this.description = description;
        this.visibility = visibility;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLinktypeId() {
        return this.linktypeId;
    }

    public void setLinktypeId(Integer linktypeId) {
        this.linktypeId = linktypeId;
    }

    public Integer getForeignId() {
        return this.foreignId;
    }

    public void setForeignId(Integer foreignId) {
        this.foreignId = foreignId;
    }

    public String getHyperlink() {
        return this.hyperlink;
    }

    public void setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte getVisibility() {
        return this.visibility;
    }

    public void setVisibility(Byte visibility) {
        this.visibility = visibility;
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
        StringBuilder sb = new StringBuilder("Links (");

        sb.append(id);
        sb.append(", ").append(linktypeId);
        sb.append(", ").append(foreignId);
        sb.append(", ").append(hyperlink);
        sb.append(", ").append(description);
        sb.append(", ").append(visibility);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
}
