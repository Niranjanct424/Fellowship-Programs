package com.bridgelabz.serviceimplementation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.model.AddressBook;
import com.bridgelabz.service.AddressBookService;

public class AddressBookImplementation implements AddressBookService
{
//	public AddressBookImplementation() 
//	{
//		AddressBook.setFileName("/BridgelabNiranjan/oops/com/bridgelabz/repositary/addressbook.json");
//	}

	AddressBook a = new AddressBook();
	
	JSONObject obj2 = new JSONObject();
	int count = 0;
	@SuppressWarnings("unchecked")
	@Override
	public void addPerson(String firstname, String lastname, String city, String state, String zip, String phone) 
	{	
		try (FileWriter file = new FileWriter("/home/bridgelabz/eclipse-workspace/BridgelabNiranjan/oops/com/bridgelabz/repositary/book.json")) 
		{
			JSONObject obj1 = new JSONObject();
			JSONArray arr = new JSONArray();
			arr.add(firstname);
			arr.add(lastname);
			arr.add(city);
			arr.add(state);
			arr.add(zip);  
			arr.add(phone);
			obj1.put(count++, arr);
            file.write(obj1.toJSONString()+"\n");
            file.flush();
            System.out.println(obj1);
 
        }
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

	@Override
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
