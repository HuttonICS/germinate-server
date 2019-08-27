/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


// @formatter:off
/**
 * The coding scheme proposed can be used at 2 different levels of detail: 
 * either by using the
 * general codes such as 10, 20, 30, 40, etc., or by using the more specific 
 * codes,
 * such as 11, 12, etc. See Multi Crop Passport Descriptors (MCPD V2 2012) 
 * for further definitions.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Collectingsources implements Serializable {

    private static final long serialVersionUID = 1521701845;

    private Integer   id;
    private String    collsrc;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Collectingsources() {}

    public Collectingsources(Collectingsources value) {
        this.id = value.id;
        this.collsrc = value.collsrc;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Collectingsources(
        Integer   id,
        String    collsrc,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.collsrc = collsrc;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCollsrc() {
        return this.collsrc;
    }

    public void setCollsrc(String collsrc) {
        this.collsrc = collsrc;
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
        StringBuilder sb = new StringBuilder("Collectingsources (");

        sb.append(id);
        sb.append(", ").append(collsrc);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
