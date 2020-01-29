package com.bridgelabz.model;
/**
 * Seller model
 * @author Niranjan
 */
public class SellerModel 
{
	private String name;
	private String companyName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Seller [name=" + name + ", companyName=" + companyName + "]";
	}
}
