package com.bridgelabz.serviceimplementation;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.oopsutility.Util;
import com.bridgelabz.service.InventaryManagerServices;

public class InventaryManagerserviceImplementation implements InventaryManagerServices
{

	JSONParser parser = new JSONParser();
	
	@Override
	public void readInventoryDataFile() 
	{
		int ch = 0;
		double[] arrweight = new double[2];
		double[] arrprice = new double[2];
		double[] wheatweight = new double[2];
		double[] wheatprice = new double[2];
		double[] pulsesweight = new double[2];
		double[] pulsesprice = new double[2];
		try
		{
			
			JSONObject obj = (JSONObject)parser.parse(new FileReader("/home/bridgelabz/eclipse-workspace/BridgelabNiranjan/oops/com/bridgelabz/repositary/InventoryData.json"));
			while(ch != 5)
			{
				System.out.println("    Enter 1 to Calculate the Total value of Rices ");
				System.out.println("    Enter 2 to Calculate the Total value of wheats");
				System.out.println("    Enter 3 to Calculate the Total value of pulses");
				System.out.println("    Enter 4 get JSONObjectString all data");
				System.out.println("    Enter 5 to exit");
				ch = Util.inputInteger();
				
				switch (ch) 
				{
				case 1:
					 double val = 0 ;
					 double val1 = 0 ;
						JSONArray wheatweighta = (JSONArray)obj.get("Wheats");
						@SuppressWarnings("unchecked")
						Iterator<Object> itrr  = wheatweighta.iterator();
						int i = 0;
						int j = 0;
						while(itrr.hasNext())
						{
							JSONObject json = (JSONObject)itrr.next();
							String weight = (String) json.get("weight");
							val = Double.parseDouble(weight);
							arrweight[i] = val;
							i++;
						}
						JSONArray ricePrice = (JSONArray)obj.get("Rice");
						Iterator<Object> itrp1  = ricePrice.iterator();
						
						while(itrp1.hasNext())
						{
							JSONObject json = (JSONObject)itrp1.next();
							String priceperkg = (String) json.get("priceperKg");
							val1 = Double.parseDouble(priceperkg);
							arrprice[j] = val1;
							j++;
						}
						System.out.println("Rice calculation");
						System.out.println("Rajbhoga Rice -> total weight "+arrweight[0]+" kg PricePerKg -> "+arrprice[0]);
						System.out.println("Totol value of Rajbhoga Rice -> "+arrweight[0]*arrprice[0]);
						System.out.println("Rajkamal Rice -> total weight "+arrweight[1]+" kg PricePerKg -> "+arrprice[1]);
						System.out.println("Totol value of Rajkamal Rice ->"+arrweight[1]*arrprice[1]);
						System.out.println();
					break;
				case 2:
					 double val3 = 0 ;
					 double val4 = 0 ;
						JSONArray Wheatweight = (JSONArray)obj.get("Wheats");
						@SuppressWarnings("unchecked")
						Iterator<Object> itrw  = Wheatweight.iterator();
						int i4 = 0;
						int j4 = 0;
						while(itrw.hasNext())
						{
							JSONObject json = (JSONObject)itrw.next();
							String weight = (String) json.get("weight");
							val = Double.parseDouble(weight);
							wheatweight[i4] = val;
							i4++;
						}
						JSONArray wheatPrice = (JSONArray)obj.get("Wheats");
						Iterator<Object> witr  = wheatPrice.iterator();
			
						while(witr.hasNext())
						{
							JSONObject json = (JSONObject)witr.next();
							String priceperkg = (String) json.get("priceperKg");
							val1 = Double.parseDouble(priceperkg);
							wheatprice[j4] = val1;
							j4++;
						}
						System.out.println("Wheats calculation ");
						System.out.println("Atta Wheats -> total weight "+wheatweight[0]+" kg PricePerKg -> "+wheatprice[0]);
						System.out.println("Totol value of Atta Wheats -> "+wheatweight[0]*wheatprice[0]);
						System.out.println("Bran Wheats -> total weight "+wheatweight[1]+" kg PricePerKg -> "+wheatprice[1]);
						System.out.println("Totol value of Atta Wheats ->"+wheatweight[1]*wheatprice[1]);
						System.out.println();
					break;
				case 3:
					double val5 = 0 ;
					 double val6 = 0 ;
						JSONArray pulsewe = (JSONArray)obj.get("pulses");
						@SuppressWarnings("unchecked")
						Iterator<Object> pitr  = pulsewe.iterator();
						int i5 = 0;
						int j5 = 0;
						while(pitr.hasNext())
						{
							JSONObject json = (JSONObject)pitr.next();
							String weight = (String) json.get("weight");
							val5 = Double.parseDouble(weight);
							pulsesweight[i5] = val5;
							i5++;
						}
						JSONArray pulsePri = (JSONArray)obj.get("pulses");
						Iterator<Object> pritr  = pulsePri.iterator();
			
						while(pritr.hasNext())
						{
							JSONObject json = (JSONObject)pritr.next();
							String priceperkg = (String) json.get("priceperKg");
							val6 = Double.parseDouble(priceperkg);
							pulsesprice[j5] = val6;
							j5++;
						}
						System.out.println("Pulse calculation ");
						System.out.println("Green Gram -> total weight "+pulsesweight[0]+" kg PricePerKg -> "+pulsesprice[0]);
						System.out.println("Totol value of Atta Wheats -> "+pulsesweight[0]*pulsesprice[0]);
						System.out.println("Red Gram -> total weight "+pulsesweight[1]+" kg PricePerKg -> "+pulsesprice[1]);
						System.out.println("Totol value of Atta Wheats ->"+pulsesweight[1]*pulsesprice[1]);
						System.out.println();
					
					break;
				case 4:
					String str = obj.toJSONString();
					System.out.println("Inventary data from JSONString -> "+str);
					break;
				case 5:
					System.out.println("exit");
					break;
				default:
					System.out.println("Invalid choice");
					break;
				}
			}	
		}
			
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		catch (ParseException e) 
		{
			e.printStackTrace();
		}		
	}

}
