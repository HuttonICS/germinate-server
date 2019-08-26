/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * Holds montly average climate data such as rainfall, temperature or cloud 
 * cover. This is based on locations rather than accessions like most of the 
 * other tables in Germinate.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Climatedata implements Serializable {

    private static final long serialVersionUID = 915761361;

    private Integer   id;
    private Integer   climateId;
    private Integer   locationId;
    private Double    climateValue;
    private Integer   datasetId;
    private String    recordingDate;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Climatedata() {}

    public Climatedata(Climatedata value) {
        this.id = value.id;
        this.climateId = value.climateId;
        this.locationId = value.locationId;
        this.climateValue = value.climateValue;
        this.datasetId = value.datasetId;
        this.recordingDate = value.recordingDate;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Climatedata(
        Integer   id,
        Integer   climateId,
        Integer   locationId,
        Double    climateValue,
        Integer   datasetId,
        String    recordingDate,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.climateId = climateId;
        this.locationId = locationId;
        this.climateValue = climateValue;
        this.datasetId = datasetId;
        this.recordingDate = recordingDate;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClimateId() {
        return this.climateId;
    }

    public void setClimateId(Integer climateId) {
        this.climateId = climateId;
    }

    public Integer getLocationId() {
        return this.locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Double getClimateValue() {
        return this.climateValue;
    }

    public void setClimateValue(Double climateValue) {
        this.climateValue = climateValue;
    }

    public Integer getDatasetId() {
        return this.datasetId;
    }

    public void setDatasetId(Integer datasetId) {
        this.datasetId = datasetId;
    }

    public String getRecordingDate() {
        return this.recordingDate;
    }

    public void setRecordingDate(String recordingDate) {
        this.recordingDate = recordingDate;
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
        StringBuilder sb = new StringBuilder("Climatedata (");

        sb.append(id);
        sb.append(", ").append(climateId);
        sb.append(", ").append(locationId);
        sb.append(", ").append(climateValue);
        sb.append(", ").append(datasetId);
        sb.append(", ").append(recordingDate);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
}
