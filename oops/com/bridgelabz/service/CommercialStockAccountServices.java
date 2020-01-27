package com.bridgelabz.service;

public interface CommercialStockAccountServices 
{
	public String StockAccount(String file);
	double vauleof();
	void buy(int amout,String symbol,String name);
	void sell(int amout,String symbol);
	void save();
	void printReport();
}
