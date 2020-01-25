package com.bridgelabz.serviceimplementation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.service.StockAccountServices;

public class StockAccountServiceImplementaion implements StockAccountServices
{
	@Override
	public void Stock(String Name, int NumberofShare, double SharePrice) 
	{
		JSONArray jsonarr = new JSONArray();
		jsonarr.add(Name);
		jsonarr.add(NumberofShare);
		jsonarr.add(SharePrice);
		JSONObject jsonobj = new JSONObject();
		try 
		{
			
			
		} 
		catch (Exception e) 
		{
			
		}
	}
}
