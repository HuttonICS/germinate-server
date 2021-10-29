/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.resource;

import java.sql.*;


public class ViewTableExperiments
{
	private Integer   experimentId;
	private String    experimentName;
	private String    experimentDescription;
	private Date      experimentDate;
	private Timestamp createdOn;
	private Long      genotypeCount;
	private Long      trialsCount;
	private Long      alleleFreqCount;
	private Long      climateCount;
	private Long      compoundCount;

	public ViewTableExperiments()
	{
	}

	public Integer getExperimentId()
	{
		return this.experimentId;
	}

	public void setExperimentId(Integer experimentId)
	{
		this.experimentId = experimentId;
	}

	public String getExperimentName()
	{
		return this.experimentName;
	}

	public void setExperimentName(String experimentName)
	{
		this.experimentName = experimentName;
	}

	public String getExperimentDescription()
	{
		return this.experimentDescription;
	}

	public void setExperimentDescription(String experimentDescription)
	{
		this.experimentDescription = experimentDescription;
	}

	public Date getExperimentDate()
	{
		return this.experimentDate;
	}

	public void setExperimentDate(Date experimentDate)
	{
		this.experimentDate = experimentDate;
	}

	public Timestamp getCreatedOn()
	{
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn)
	{
		this.createdOn = createdOn;
	}

	public Long getGenotypeCount()
	{
		return this.genotypeCount;
	}

	public void setGenotypeCount(Long genotypeCount)
	{
		this.genotypeCount = genotypeCount;
	}

	public Long getTrialsCount()
	{
		return this.trialsCount;
	}

	public void setTrialsCount(Long trialsCount)
	{
		this.trialsCount = trialsCount;
	}

	public Long getAlleleFreqCount()
	{
		return this.alleleFreqCount;
	}

	public void setAlleleFreqCount(Long alleleFreqCount)
	{
		this.alleleFreqCount = alleleFreqCount;
	}

	public Long getClimateCount()
	{
		return this.climateCount;
	}

	public void setClimateCount(Long climateCount)
	{
		this.climateCount = climateCount;
	}

	public Long getCompoundCount()
	{
		return this.compoundCount;
	}

	public void setCompoundCount(Long compoundCount)
	{
		this.compoundCount = compoundCount;
	}
}
