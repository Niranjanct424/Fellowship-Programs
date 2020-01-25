/*
 * JSON Inventory Data Management of Rice, Pulses and Wheat
 * Data variables name,weight,price per kilogram
 */
package com.bridgelabz.model;

public class InventroryManagement 
{

	private String name;
	private String weight;
	private String priceperkg;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getWeight() 
	{
		return weight;
	}
	public void setWeight(String weight) 
	{
		this.weight = weight;
	}
	public String getPriceperkg() 
	{
		return priceperkg;
	}
	public void setPriceperkg(String priceperkg)
	{
		this.priceperkg = priceperkg;
	}
}
