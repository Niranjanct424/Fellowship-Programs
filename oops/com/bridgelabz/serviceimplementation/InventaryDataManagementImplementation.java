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
	
	@Override
	public void readInventoryDataFile()
	{
		int ch = 0;
		try
		{
			JSONObject obj = (JSONObject)parser.parse(new FileReader("/home/bridgelabz/eclipse-workspace/BridgelabNiranjan/oops/com/bridgelabz/repositary/InventoryData.json"));
			while(ch != 4)
			{
				System.out.println("    Enter 1 get the rice detials");
				System.out.println("    Enter 2 get the wheats detials");
				System.out.println("    Enter 3 get the pulses detials");
				System.out.println("    Enter 4 to exit");
				ch = Util.inputInteger();
				
				switch (ch) 
				{
				case 1:
					//Rice 
					
					JSONArray riceProperties = (JSONArray)obj.get("Rice");
					//System.out.println("RICE: "+obj.get("Rice"));
					//System.out.println(" index "+riceProperties.get(0));
					System.out.println("Rice Details : ");
					@SuppressWarnings("unchecked")
					Iterator<Object> itr  = riceProperties.iterator();
					while(itr.hasNext())
					{
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
