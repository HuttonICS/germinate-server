/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * Defines which entities are contained within a group. These can be the primary 
 * key from any table.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Groupmembers implements Serializable {

    private static final long serialVersionUID = -826430574;

    private Integer   id;
    private Integer   foreignId;
    private Integer   groupId;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Groupmembers() {}

    public Groupmembers(Groupmembers value) {
        this.id = value.id;
        this.foreignId = value.foreignId;
        this.groupId = value.groupId;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Groupmembers(
        Integer   id,
        Integer   foreignId,
        Integer   groupId,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.foreignId = foreignId;
        this.groupId = groupId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getForeignId() {
        return this.foreignId;
    }

    public void setForeignId(Integer foreignId) {
        this.foreignId = foreignId;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
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
        StringBuilder sb = new StringBuilder("Groupmembers (");

        sb.append(id);
        sb.append(", ").append(foreignId);
        sb.append(", ").append(groupId);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
}
