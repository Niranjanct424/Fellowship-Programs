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
				System.out.println("    Enter 4 to Calculate the value of Rices ");
				System.out.println("    Enter 5 to Calculate the value of wheats");
				System.out.println("    Enter 6 to Calculate the value of pulses");
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
						JSONArray riceweight = (JSONArray)obj.get("Rice");
						System.out.println("rice weights : ");
						@SuppressWarnings("unchecked")
						Iterator<Object> itrr  = riceweight.iterator();
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
						for(int i1 =0; i1<arrweight.length; i1++)
						{
							System.out.println("weight "+arrweight[i1]);
						}
						JSONArray ricePrice = (JSONArray)obj.get("Rice");
						Iterator<Object> itrp1  = ricePrice.iterator();
						System.out.println("rice prices : ");
						while(itrp1.hasNext())
						{
							JSONObject json = (JSONObject)itrp1.next();
							String priceperkg = (String) json.get("priceperKg");
							val1 = Double.parseDouble(priceperkg);
							arrprice[j] = val1;
							j++;
						}
						for(int i1 =0; i1<arrprice.length; i1++)
						{
							System.out.println("price "+arrprice[i1]);
						}
						System.out.println("Rajbhoga Rice -> total weight "+arrweight[0]+" PricePerKg -> "+arrprice[0]);
						System.out.println("Totol value of Rajbhoga Rice -> "+arrweight[0]*arrprice[0]);
						System.out.println("Rajkamal Rice -> total weight "+arrweight[1]+" PricePerKg -> "+arrprice[1]);
						System.out.println("Totol value of Rajkamal Rice ->"+arrweight[1]*arrprice[1]);
						System.out.println();
					break;
				case 5:
					
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
