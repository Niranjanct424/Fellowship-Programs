package com.bridgelabz.service;
/**
 * StockAccount services => buy(),sell(),printReport()
 * @author Niranjan c t
 *
 */
public interface StockaAccountServices 
{
	public abstract void buy(int amount,String companySymbol);
	public abstract void sell(int amount,String companySymbol);
	public abstract void printReport();
}
