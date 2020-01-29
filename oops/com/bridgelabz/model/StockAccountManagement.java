/*
 * Stock Account Management holds the variables 
 * Stock variables ->Stock Names, Number of Share, Share Price
 */

package com.bridgelabz.model;

public class StockAccountManagement 
{
	private String Names;
	private int NumberofShare;
	private double SharePrice;
	
	public String getNames() 
	{
		return Names;
	}
	public void setNames(String names) 
	{
		Names = names;
	}
	public int getNumberofShare() 
	{
		return NumberofShare;
	}
	public void setNumberofShare(int numberofShare) 
	{
		NumberofShare = numberofShare;
	}
	public double getSharePrice() 
	{
		return SharePrice;
	}
	public void setSharePrice(double sharePrice) 
	{
		SharePrice = sharePrice;
	}
}
