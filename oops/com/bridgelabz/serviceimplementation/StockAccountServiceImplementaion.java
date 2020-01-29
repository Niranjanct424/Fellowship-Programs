/*
 * Stock account implementation of total price
 */
package com.bridgelabz.serviceimplementation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.service.StockAccountServices;

public class StockAccountServiceImplementaion implements StockAccountServices {
	// json file reader
	public static JSONObject json() 
	{
		// first we create JSONparse
		JSONParser jsonparse = new JSONParser();
		try (FileReader fr = new FileReader("/home/bridgelabz/eclipse-workspace/BridgelabNiranjan/oops/repositary/stock.json");
				BufferedReader br = new BufferedReader(fr)) {
			return (JSONObject) jsonparse.parse(br);
			// it will parse JSONObject
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings({ "unchecked", "unused" })
	@Override
	public void Stock(String Name, int NumberofShare, double SharePrice) 
	{
		JSONObject jobj = json();
		JSONArray jsonarr = new JSONArray();
		jsonarr = (JSONArray) jobj.get("Stocks");

		JSONObject obj2 = new JSONObject();
		obj2.put("Name", Name);
		obj2.put("NumberofShare", NumberofShare);
		obj2.put("SharePrice", SharePrice);
		obj2.put("Total Share value ", (NumberofShare*SharePrice));
		jsonarr.add(obj2);

		try {
			PrintWriter p1 = new PrintWriter("/home/bridgelabz/eclipse-workspace/BridgelabNiranjan/oops/repositary/stock.json");
			p1.write((jobj.toJSONString()));
			p1.flush();
			System.out.println(jobj.toString());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

	@SuppressWarnings("rawtypes")
	@Override
	public void StockReport() 
	{
		JSONObject jsonobj = new JSONObject();
		//read json object
		jsonobj = json();
		JSONArray array = new JSONArray();
		array = (JSONArray)jsonobj.get("Stocks");
		JSONObject ob = new JSONObject();
		Iterator itr = array.iterator();
			//generating stock details
			while(itr.hasNext())
			{
				ob = (JSONObject)itr.next();
				System.out.print("Name "+ob.get("Name")+"\t");
				System.out.print("NumberofShare "+ob.get("NumberofShare")+"\t");
				System.out.print("SharePrice "+ob.get("SharePrice")+"\t");
				System.out.print("Total share value "+ob.get("Total Share value ")+"\t\n");
			}
	}
}
