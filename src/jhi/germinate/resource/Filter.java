package jhi.germinate.resource;

/**
 * @author Sebastian Raubach
 */
public class Filter
{
	private String column;
	private String comparator;
	private String operator;
	private String[] values;

	public Filter()
	{
	}

	public String getColumn()
	{
		return column;
	}

	public Filter setColumn(String column)
	{
		this.column = column;
		return this;
	}

	public String getComparator()
	{
		return comparator;
	}

	public Filter setComparator(String comparator)
	{
		this.comparator = comparator;
		return this;
	}

	public String getOperator()
	{
		return operator;
	}

	public Filter setOperator(String operator)
	{
		this.operator = operator;
		return this;
	}

	public String[] getValues()
	{
		return values;
	}

	public Filter setValues(String[] values)
	{
		this.values = values;
		return this;
	}
}
