/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PDefault extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1445152769;

	/**
	 * The parameter <code>dbo.p_default.p_in_number</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P_IN_NUMBER = createParameter("p_in_number", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>dbo.p_default.p_out_number</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> P_OUT_NUMBER = createParameter("p_out_number", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>dbo.p_default.p_in_varchar</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> P_IN_VARCHAR = createParameter("p_in_varchar", org.jooq.impl.SQLDataType.VARCHAR.length(10));

	/**
	 * The parameter <code>dbo.p_default.p_out_varchar</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> P_OUT_VARCHAR = createParameter("p_out_varchar", org.jooq.impl.SQLDataType.VARCHAR.length(10));

	/**
	 * The parameter <code>dbo.p_default.p_in_date</code>. 
	 */
	public static final org.jooq.Parameter<java.sql.Date> P_IN_DATE = createParameter("p_in_date", org.jooq.impl.SQLDataType.DATE);

	/**
	 * The parameter <code>dbo.p_default.p_out_date</code>. 
	 */
	public static final org.jooq.Parameter<java.sql.Date> P_OUT_DATE = createParameter("p_out_date", org.jooq.impl.SQLDataType.DATE);

	/**
	 * Create a new routine call instance
	 */
	public PDefault() {
		super("p_default", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);

		addInParameter(P_IN_NUMBER);
		addInOutParameter(P_OUT_NUMBER);
		addInParameter(P_IN_VARCHAR);
		addInOutParameter(P_OUT_VARCHAR);
		addInParameter(P_IN_DATE);
		addInOutParameter(P_OUT_DATE);
	}

	/**
	 * Set the <code>p_in_number</code> parameter IN value to the routine
	 */
	public void setPInNumber(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.routines.PDefault.P_IN_NUMBER, value);
	}

	/**
	 * Set the <code>p_out_number</code> parameter IN value to the routine
	 */
	public void setPOutNumber(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.routines.PDefault.P_OUT_NUMBER, value);
	}

	/**
	 * Set the <code>p_in_varchar</code> parameter IN value to the routine
	 */
	public void setPInVarchar(java.lang.String value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.routines.PDefault.P_IN_VARCHAR, value);
	}

	/**
	 * Set the <code>p_out_varchar</code> parameter IN value to the routine
	 */
	public void setPOutVarchar(java.lang.String value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.routines.PDefault.P_OUT_VARCHAR, value);
	}

	/**
	 * Set the <code>p_in_date</code> parameter IN value to the routine
	 */
	public void setPInDate(java.sql.Date value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.routines.PDefault.P_IN_DATE, value);
	}

	/**
	 * Set the <code>p_out_date</code> parameter IN value to the routine
	 */
	public void setPOutDate(java.sql.Date value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.routines.PDefault.P_OUT_DATE, value);
	}

	/**
	 * Get the <code>p_out_number</code> parameter OUT value from the routine
	 */
	public java.lang.Integer getPOutNumber() {
		return getValue(P_OUT_NUMBER);
	}

	/**
	 * Get the <code>p_out_varchar</code> parameter OUT value from the routine
	 */
	public java.lang.String getPOutVarchar() {
		return getValue(P_OUT_VARCHAR);
	}

	/**
	 * Get the <code>p_out_date</code> parameter OUT value from the routine
	 */
	public java.sql.Date getPOutDate() {
		return getValue(P_OUT_DATE);
	}
}
