/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


// @formatter:off
/**
 * Describes locations. Locations can be collecting sites or the location 
 * of any geographical feature such as research institutes or lab locations.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Locations implements Serializable {

    private static final long serialVersionUID = 2039161530;

    private Integer    id;
    private Integer    locationtypeId;
    private Integer    countryId;
    private String     state;
    private String     region;
    private String     siteName;
    private String     siteNameShort;
    private BigDecimal elevation;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Integer    coordinateUncertainty;
    private String     coordinateDatum;
    private String     georeferencingMethod;
    private Timestamp  createdOn;
    private Timestamp  updatedOn;

    public Locations() {}

    public Locations(Locations value) {
        this.id = value.id;
        this.locationtypeId = value.locationtypeId;
        this.countryId = value.countryId;
        this.state = value.state;
        this.region = value.region;
        this.siteName = value.siteName;
        this.siteNameShort = value.siteNameShort;
        this.elevation = value.elevation;
        this.latitude = value.latitude;
        this.longitude = value.longitude;
        this.coordinateUncertainty = value.coordinateUncertainty;
        this.coordinateDatum = value.coordinateDatum;
        this.georeferencingMethod = value.georeferencingMethod;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Locations(
        Integer    id,
        Integer    locationtypeId,
        Integer    countryId,
        String     state,
        String     region,
        String     siteName,
        String     siteNameShort,
        BigDecimal elevation,
        BigDecimal latitude,
        BigDecimal longitude,
        Integer    coordinateUncertainty,
        String     coordinateDatum,
        String     georeferencingMethod,
        Timestamp  createdOn,
        Timestamp  updatedOn
    ) {
        this.id = id;
        this.locationtypeId = locationtypeId;
        this.countryId = countryId;
        this.state = state;
        this.region = region;
        this.siteName = siteName;
        this.siteNameShort = siteNameShort;
        this.elevation = elevation;
        this.latitude = latitude;
        this.longitude = longitude;
        this.coordinateUncertainty = coordinateUncertainty;
        this.coordinateDatum = coordinateDatum;
        this.georeferencingMethod = georeferencingMethod;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLocationtypeId() {
        return this.locationtypeId;
    }

    public void setLocationtypeId(Integer locationtypeId) {
        this.locationtypeId = locationtypeId;
    }

    public Integer getCountryId() {
        return this.countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteNameShort() {
        return this.siteNameShort;
    }

    public void setSiteNameShort(String siteNameShort) {
        this.siteNameShort = siteNameShort;
    }

    public BigDecimal getElevation() {
        return this.elevation;
    }

    public void setElevation(BigDecimal elevation) {
        this.elevation = elevation;
    }

    public BigDecimal getLatitude() {
        return this.latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return this.longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public Integer getCoordinateUncertainty() {
        return this.coordinateUncertainty;
    }

    public void setCoordinateUncertainty(Integer coordinateUncertainty) {
        this.coordinateUncertainty = coordinateUncertainty;
    }

    public String getCoordinateDatum() {
        return this.coordinateDatum;
    }

    public void setCoordinateDatum(String coordinateDatum) {
        this.coordinateDatum = coordinateDatum;
    }

    public String getGeoreferencingMethod() {
        return this.georeferencingMethod;
    }

    public void setGeoreferencingMethod(String georeferencingMethod) {
        this.georeferencingMethod = georeferencingMethod;
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
        StringBuilder sb = new StringBuilder("Locations (");

        sb.append(id);
        sb.append(", ").append(locationtypeId);
        sb.append(", ").append(countryId);
        sb.append(", ").append(state);
        sb.append(", ").append(region);
        sb.append(", ").append(siteName);
        sb.append(", ").append(siteNameShort);
        sb.append(", ").append(elevation);
        sb.append(", ").append(latitude);
        sb.append(", ").append(longitude);
        sb.append(", ").append(coordinateUncertainty);
        sb.append(", ").append(coordinateDatum);
        sb.append(", ").append(georeferencingMethod);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
