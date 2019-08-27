/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


// @formatter:off
/**
 * Based on Multi Crop Passport Descriptors (MCPD V2 2012) - The coding scheme 
 * proposed can be used at 3 different levels of detail: either by using the
 * general codes (in boldface) such as 100, 200, 300, 400, or by using the 
 * more specific codes
 * such as 110, 120, etc.
 * 100) Wild
 * 110) Natural
 * 120) Semi-natural/wild
 * 130) Semi-natural/sown
 * 200) Weedy
 * 300) Traditional cultivar/landrace
 * 400) Breeding/research material
 *  410) Breeder's line
 *  411) Synthetic population
 *  412) Hybrid
 *  413) Founder stock/base population
 *  414) Inbred line (parent of hybrid cultivar)
 *  415) Segregating population
 *  416) Clonal selection
 *  420) Genetic stock
 *  421) Mutant (e.g. induced/insertion mutants, tilling populations)
 *  422) Cytogenetic stocks (e.g. chromosome addition/substitution, aneuploids,
 * amphiploids)
 *  423) Other genetic stocks (e.g. mapping populations)
 * 500) Advanced or improved cultivar (conventional breeding methods)
 * 600) GMO (by genetic engineering)
 *  999) Other 
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Biologicalstatus implements Serializable {

    private static final long serialVersionUID = 1861513436;

    private Integer   id;
    private String    sampstat;
    private Timestamp createdOn;
    private Timestamp updatedOn;

    public Biologicalstatus() {}

    public Biologicalstatus(Biologicalstatus value) {
        this.id = value.id;
        this.sampstat = value.sampstat;
        this.createdOn = value.createdOn;
        this.updatedOn = value.updatedOn;
    }

    public Biologicalstatus(
        Integer   id,
        String    sampstat,
        Timestamp createdOn,
        Timestamp updatedOn
    ) {
        this.id = id;
        this.sampstat = sampstat;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSampstat() {
        return this.sampstat;
    }

    public void setSampstat(String sampstat) {
        this.sampstat = sampstat;
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
        StringBuilder sb = new StringBuilder("Biologicalstatus (");

        sb.append(id);
        sb.append(", ").append(sampstat);
        sb.append(", ").append(createdOn);
        sb.append(", ").append(updatedOn);

        sb.append(")");
        return sb.toString();
    }
// @formatter:on
}
