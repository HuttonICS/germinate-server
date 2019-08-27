/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


// @formatter:off
/**
 * This defines which users can view which datasets. Requires Germinate Gatekeeper. 
 * This overrides the datasets state.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Datasetpermissions implements Serializable {

    private static final long serialVersionUID = 465458003;

    private Integer   id;
    private Integer   datasetId;
    private Integer   userId;
    private Integer   groupId;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Datasetpermissions() {}

    public Datasetpermissions(Datasetpermissions value) {
        this.id = value.id;
        this.datasetId = value.datasetId;
        this.userId = value.userId;
        this.groupId = value.groupId;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Datasetpermissions(
        Integer   id,
        Integer   datasetId,
        Integer   userId,
        Integer   groupId,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.datasetId = datasetId;
        this.userId = userId;
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

    public Integer getDatasetId() {
        return this.datasetId;
    }

    public void setDatasetId(Integer datasetId) {
        this.datasetId = datasetId;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
        StringBuilder sb = new StringBuilder("Datasetpermissions (");

        sb.append(id);
        sb.append(", ").append(datasetId);
        sb.append(", ").append(userId);
        sb.append(", ").append(groupId);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
