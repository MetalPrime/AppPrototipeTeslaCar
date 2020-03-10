package model;

public class Cards {
	
	private String titular;
	private int numberCount;
	private int dateExpiration;
	private int CVV;

	public Cards(String titular, int numberCount, int dateExpiration, int CVV) {
		this.titular = titular;
		this.numberCount = numberCount;
		this.dateExpiration = dateExpiration;
		this.CVV = CVV;
	}

	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @return the numberCount
	 */
	public int getNumberCount() {
		return numberCount;
	}

	/**
	 * @param numberCount the numberCount to set
	 */
	public void setNumberCount(int numberCount) {
		this.numberCount = numberCount;
	}

	/**
	 * @return the dateExpiration
	 */
	public int getDateExpiration() {
		return dateExpiration;
	}

	/**
	 * @param dateExpiration the dateExpiration to set
	 */
	public void setDateExpiration(int dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	/**
	 * @return the cVV
	 */
	public int getCVV() {
		return CVV;
	}

	/**
	 * @param cVV the cVV to set
	 */
	public void setCVV(int cVV) {
		CVV = cVV;
	}
	
	
}
