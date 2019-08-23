/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.pojos;


import java.io.*;

import javax.annotation.*;


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
public class ViewTableLicenses implements Serializable {

    private static final long serialVersionUID = 1233257554;

    private Integer licenseid;
    private String  licensename;
    private String  licensedescription;
    private String  licensecontent;
    private String  localename;
    private String  localedescription;

    public ViewTableLicenses() {}

    public ViewTableLicenses(ViewTableLicenses value) {
        this.licenseid = value.licenseid;
        this.licensename = value.licensename;
        this.licensedescription = value.licensedescription;
        this.licensecontent = value.licensecontent;
        this.localename = value.localename;
        this.localedescription = value.localedescription;
    }

    public ViewTableLicenses(
        Integer licenseid,
        String  licensename,
        String  licensedescription,
        String  licensecontent,
        String  localename,
        String  localedescription
    ) {
        this.licenseid = licenseid;
        this.licensename = licensename;
        this.licensedescription = licensedescription;
        this.licensecontent = licensecontent;
        this.localename = localename;
        this.localedescription = localedescription;
    }

    public Integer getLicenseid() {
        return this.licenseid;
    }

    public void setLicenseid(Integer licenseid) {
        this.licenseid = licenseid;
    }

    public String getLicensename() {
        return this.licensename;
    }

    public void setLicensename(String licensename) {
        this.licensename = licensename;
    }

    public String getLicensedescription() {
        return this.licensedescription;
    }

    public void setLicensedescription(String licensedescription) {
        this.licensedescription = licensedescription;
    }

    public String getLicensecontent() {
        return this.licensecontent;
    }

    public void setLicensecontent(String licensecontent) {
        this.licensecontent = licensecontent;
    }

    public String getLocalename() {
        return this.localename;
    }

    public void setLocalename(String localename) {
        this.localename = localename;
    }

    public String getLocaledescription() {
        return this.localedescription;
    }

    public void setLocaledescription(String localedescription) {
        this.localedescription = localedescription;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableLicenses (");

        sb.append(licenseid);
        sb.append(", ").append(licensename);
        sb.append(", ").append(licensedescription);
        sb.append(", ").append(licensecontent);
        sb.append(", ").append(localename);
        sb.append(", ").append(localedescription);

        sb.append(")");
        return sb.toString();
    }
}
