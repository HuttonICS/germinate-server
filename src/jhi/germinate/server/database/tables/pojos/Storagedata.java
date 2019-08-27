/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class Storagedata implements Serializable {

    private static final long serialVersionUID = 970425832;

    private Integer   id;
    private Integer   germinatebaseId;
    private Integer   storageId;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Storagedata() {}

    public Storagedata(Storagedata value) {
        this.id = value.id;
        this.germinatebaseId = value.germinatebaseId;
        this.storageId = value.storageId;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Storagedata(
        Integer   id,
        Integer   germinatebaseId,
        Integer   storageId,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.germinatebaseId = germinatebaseId;
        this.storageId = storageId;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGerminatebaseId() {
        return this.germinatebaseId;
    }

    public void setGerminatebaseId(Integer germinatebaseId) {
        this.germinatebaseId = germinatebaseId;
    }

    public Integer getStorageId() {
        return this.storageId;
    }

    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
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
        StringBuilder sb = new StringBuilder("Storagedata (");

        sb.append(id);
        sb.append(", ").append(germinatebaseId);
        sb.append(", ").append(storageId);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
