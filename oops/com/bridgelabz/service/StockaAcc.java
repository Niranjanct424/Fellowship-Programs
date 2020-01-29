package com.bridgelabz.service;
import java.util.List;

import com.bridgelabz.model.*;
public interface StockaAcc 
{
	public long valueOf(List<Company> company);
	public void buy(String name);
	public void sell(String name);
	public void save(String filename,String name);
	public void printReport();
}
