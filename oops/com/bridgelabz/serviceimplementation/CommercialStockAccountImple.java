package com.bridgelabz.serviceimplementation;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.oopsutility.Util;
import com.bridgelabz.service.CommercialStockAccountServices;

public class CommercialStockAccountImple implements CommercialStockAccountServices {
	
	String Commercialdata = "Commercial.json";//commercialStockAccount.json
	@SuppressWarnings("unused")
	private static JSONArray globalJsonArray = new JSONArray();
	
	@Override
	public String StockAccount(String file) 
	{
		//Commercialdata = file;
		try 
		{
			FileWriter fw = new FileWriter(file);
			//fw.write();
			fw.close();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		return file;
	}

	@Override
	public double vauleof() 
	{
		return 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void buy(int amout,String symbol,String name) 
	{
		JSONObject obj = new JSONObject();
		
		
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date(System.currentTimeMillis());
		
		obj.put("symbol",symbol);
		obj.put("amount", amout);
		obj.put("date",dateobj);
		
		JSONObject object = new JSONObject();
		JSONArray ja = new JSONArray();
		
		if(Util.readJSONArray(Commercialdata) != null)
		{
			 globalJsonArray= Util.readJSONArray(Commercialdata);
			 globalJsonArray.add(obj);
			 object.put(name, globalJsonArray);
			 	
		}
		else
		{
			globalJsonArray.add(obj);
			object.put(name, globalJsonArray);
			
		}
		 try (FileWriter file = new FileWriter(Commercialdata)) 
		 {
	            file.write(object.toJSONString());
	            file.flush();
	 
	     } catch (IOException e) 
		 {
	            e.printStackTrace();
	     }

	}

	@Override
	public void sell(int amout, String symbol) 
	{
		
	}

	@Override
	public void save() 
	{
		
	}

	@Override
	public void printReport() {
		// TODO Auto-generated method stub

	}

}
