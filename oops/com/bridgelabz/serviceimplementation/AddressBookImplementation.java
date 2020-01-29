package com.bridgelabz.serviceimplementation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.bridgelabz.service.AddressBookService;

public class AddressBookImplementation implements AddressBookService
{

	JSONParser jsonParser = new JSONParser();
	int count = 0;
	@SuppressWarnings("unchecked")
	@Override
	public void addPerson(String firstname, String lastname, String city, String state, String zip, String phone) 
	{	
		
		try  
		{
			FileReader f1 = new FileReader("/home/bridgelabz/eclipse-workspace/BridgelabNiranjan/oops/repositary/book.json");
			FileWriter file = new FileWriter("/home/bridgelabz/eclipse-workspace/BridgelabNiranjan/oops/repositary/book.json");
			
			 JSONObject personDetails = new JSONObject();
			 Object obj = jsonParser.parse(f1);
			 System.out.println(" obj "+obj);
			 JSONArray personList = (JSONArray) obj;
			 System.out.println("personList "+personList);
			 personDetails.put("FirstName", firstname);
			 personDetails.put("LasttName", firstname);
			 personDetails.put("City", firstname);
			 personDetails.put("State", firstname);
			 personDetails.put("Zip", firstname);
			 personDetails.put("PhoneNo", firstname);
			 
			 personList.add(personDetails);
			 file.write(personList.toJSONString());
	         file.flush();
        }
		catch (IOException | ParseException e) 
		{
			e.printStackTrace();
		}
		
	}

	public void editUser(String person) 
	{
			
	}

	@Override
	public void deleteUser(String person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean search(String person) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void saveAs(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addJson(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteJson(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectJson() {
		// TODO Auto-generated method stub
		
	}

	
	
}
