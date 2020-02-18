/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.pojos;


import com.google.gson.JsonArray;

import java.io.Serializable;

import javax.annotation.Generated;

import jhi.germinate.server.database.enums.ViewTableTraitsDataType;


// @formatter:off
/**
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableTraits implements Serializable {

    private static final long serialVersionUID = 339836375;

    private Integer                 traitId;
    private String                  traitName;
    private String                  traitNameShort;
    private String                  traitDescription;
    private ViewTableTraitsDataType dataType;
    private Integer                 unitId;
    private String                  unitName;
    private String                  unitDescription;
    private String                  unitAbbreviation;
    private JsonArray               synonyms;
    private Long                    count;

    public ViewTableTraits() {}

    public ViewTableTraits(ViewTableTraits value) {
        this.traitId = value.traitId;
        this.traitName = value.traitName;
        this.traitNameShort = value.traitNameShort;
        this.traitDescription = value.traitDescription;
        this.dataType = value.dataType;
        this.unitId = value.unitId;
        this.unitName = value.unitName;
        this.unitDescription = value.unitDescription;
        this.unitAbbreviation = value.unitAbbreviation;
        this.synonyms = value.synonyms;
        this.count = value.count;
    }

    public ViewTableTraits(
        Integer                 traitId,
        String                  traitName,
        String                  traitNameShort,
        String                  traitDescription,
        ViewTableTraitsDataType dataType,
        Integer                 unitId,
        String                  unitName,
        String                  unitDescription,
        String                  unitAbbreviation,
        JsonArray               synonyms,
        Long                    count
    ) {
        this.traitId = traitId;
        this.traitName = traitName;
        this.traitNameShort = traitNameShort;
        this.traitDescription = traitDescription;
        this.dataType = dataType;
        this.unitId = unitId;
        this.unitName = unitName;
        this.unitDescription = unitDescription;
        this.unitAbbreviation = unitAbbreviation;
        this.synonyms = synonyms;
        this.count = count;
    }

    public Integer getTraitId() {
        return this.traitId;
    }

    public void setTraitId(Integer traitId) {
        this.traitId = traitId;
    }

    public String getTraitName() {
        return this.traitName;
    }

    public void setTraitName(String traitName) {
        this.traitName = traitName;
    }

    public String getTraitNameShort() {
        return this.traitNameShort;
    }

    public void setTraitNameShort(String traitNameShort) {
        this.traitNameShort = traitNameShort;
    }

    public String getTraitDescription() {
        return this.traitDescription;
    }

    public void setTraitDescription(String traitDescription) {
        this.traitDescription = traitDescription;
    }

    public ViewTableTraitsDataType getDataType() {
        return this.dataType;
    }

    public void setDataType(ViewTableTraitsDataType dataType) {
        this.dataType = dataType;
    }

    public Integer getUnitId() {
        return this.unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return this.unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitDescription() {
        return this.unitDescription;
    }

    public void setUnitDescription(String unitDescription) {
        this.unitDescription = unitDescription;
    }

    public String getUnitAbbreviation() {
        return this.unitAbbreviation;
    }

    public void setUnitAbbreviation(String unitAbbreviation) {
        this.unitAbbreviation = unitAbbreviation;
    }

    public JsonArray getSynonyms() {
        return this.synonyms;
    }

    public void setSynonyms(JsonArray synonyms) {
        this.synonyms = synonyms;
    }

    public Long getCount() {
        return this.count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableTraits (");

        sb.append(traitId);
        sb.append(", ").append(traitName);
        sb.append(", ").append(traitNameShort);
        sb.append(", ").append(traitDescription);
        sb.append(", ").append(dataType);
        sb.append(", ").append(unitId);
        sb.append(", ").append(unitName);
        sb.append(", ").append(unitDescription);
        sb.append(", ").append(unitAbbreviation);
        sb.append(", ").append(synonyms);
        sb.append(", ").append(count);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}