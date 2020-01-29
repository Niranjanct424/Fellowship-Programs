package com.bridgelabz.model;

/**
 * Buyer Model
 * @author Niranjan
 *
 */
public class BuyerModel 
{
	private String name;
	private String companySymbol;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanySymbol() {
		return companySymbol;
	}

	public void setCompanySymbol(String companySymbol) {
		this.companySymbol = companySymbol;
	}

	@Override
	public String toString() {
		return "BuyerModel [name=" + name + ", companySymbol=" + companySymbol + "]";
	}
}
