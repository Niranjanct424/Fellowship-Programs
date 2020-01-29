/*
 * Stock Account Management Service methods
 */
package com.bridgelabz.service;

public interface StockAccountServices 
{
	public void Stock(String Name, int NumberofShare, double SharePrice);	
	public void StockReport();
}
