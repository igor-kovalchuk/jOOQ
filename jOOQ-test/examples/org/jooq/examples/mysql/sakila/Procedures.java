/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures in sakila
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public final class Procedures {

	/**
	 * Invoke FILM_IN_STOCK
	 *
	 * @param pFilmId IN parameter
	 * @param pStoreId IN parameter
	 * @param pFilmCount OUT parameter
	 */
	public static java.lang.Integer filmInStock(org.jooq.Configuration configuration, java.lang.Integer pFilmId, java.lang.Integer pStoreId) throws java.sql.SQLException {
		org.jooq.examples.mysql.sakila.procedures.FilmInStock p = new org.jooq.examples.mysql.sakila.procedures.FilmInStock();
		p.setPFilmId(pFilmId);
		p.setPStoreId(pStoreId);

		p.execute(configuration);
		return p.getPFilmCount();
	}

	/**
	 * Invoke FILM_NOT_IN_STOCK
	 *
	 * @param pFilmId IN parameter
	 * @param pStoreId IN parameter
	 * @param pFilmCount OUT parameter
	 */
	public static java.lang.Integer filmNotInStock(org.jooq.Configuration configuration, java.lang.Integer pFilmId, java.lang.Integer pStoreId) throws java.sql.SQLException {
		org.jooq.examples.mysql.sakila.procedures.FilmNotInStock p = new org.jooq.examples.mysql.sakila.procedures.FilmNotInStock();
		p.setPFilmId(pFilmId);
		p.setPStoreId(pStoreId);

		p.execute(configuration);
		return p.getPFilmCount();
	}

	/**
	 * Invoke REWARDS_REPORT
	 *
	 * @param minMonthlyPurchases IN parameter
	 * @param minDollarAmountPurchased IN parameter
	 * @param countRewardees OUT parameter
	 */
	public static java.lang.Integer rewardsReport(org.jooq.Configuration configuration, java.lang.Byte minMonthlyPurchases, java.math.BigDecimal minDollarAmountPurchased) throws java.sql.SQLException {
		org.jooq.examples.mysql.sakila.procedures.RewardsReport p = new org.jooq.examples.mysql.sakila.procedures.RewardsReport();
		p.setMinMonthlyPurchases(minMonthlyPurchases);
		p.setMinDollarAmountPurchased(minDollarAmountPurchased);

		p.execute(configuration);
		return p.getCountRewardees();
	}

	/**
	 * No instances
	 */
	private Procedures() {}
}
