/*
 * JSON Inventory Data Management of Rice, Pulses and Wheat
 * readInventoryDataFile() implementation
 */
package com.bridgelabz.serviceimplementation;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.bridgelabz.oopsutility.Util;
import com.bridgelabz.service.InventaryDataServices;

public class InventaryDataManagementImplementation implements InventaryDataServices
{
	JSONParser parser = new JSONParser();
	
	@SuppressWarnings("unchecked")
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
			while(ch != 8)
			{
				System.out.println("    Enter 1 get the rice detials");
				System.out.println("    Enter 2 get the wheats detials");
				System.out.println("    Enter 3 get the pulses detials");
				System.out.println("    Enter 4 to Calculate the Total value of Rices ");
				System.out.println("    Enter 5 to Calculate the Total value of wheats");
				System.out.println("    Enter 6 to Calculate the Total value of pulses");
				System.out.println("    Enter 7 get JSONObjectString all data");
				System.out.println("    Enter 8 to exit");
				ch = Util.inputInteger();
				
				switch (ch) 
				{
				case 1:
					//Rice 
					JSONArray riceProperties = (JSONArray)obj.get("Rice");
					//System.out.println("RICE: "+obj.get("Rice"));
					//System.out.println(" index "+riceProperties.get(0));
					//JSONArray recs = obj.getJSONArray("record");
				   
					System.out.println("Rice Details : ");
					@SuppressWarnings("unchecked")
					Iterator<Object> itr  = riceProperties.iterator();
					
					while(itr.hasNext())
					{
						int i = 0;
						System.out.println(itr.next());
					}
					System.out.println();

					break;
					
				case 2:
					//Wheat
					JSONArray wheatsProperties = (JSONArray)obj.get("Wheats");
					System.out.println("Wheats Details : ");
					@SuppressWarnings("unchecked")
					Iterator<Object> itr2  = wheatsProperties.iterator();
					while(itr2.hasNext())
					{
						System.out.println(itr2.next());
					}
					System.out.println();
					break;
					
				case 3:
					//pulses
					JSONArray pulsesProperties = (JSONArray)obj.get("pulses");
					System.out.println("Pulses Details : ");
					@SuppressWarnings("unchecked")
					Iterator<Object> itrp  = pulsesProperties.iterator();
					while(itrp.hasNext())
					{
						System.out.println(itrp.next());
					}
					break;
				case 4:
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
				case 5:
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
				case 6:
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
				case 7:
					String str = obj.toJSONString();
					System.out.println("Inventary data from JSONString -> "+str);
					break;
				case 8:
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
