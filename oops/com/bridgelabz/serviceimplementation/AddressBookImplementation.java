package com.bridgelabz.serviceimplementation;


import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.model.AddressBook;
import com.bridgelabz.service.AddressBookInterface;

public class AddressBookImplementation implements AddressBookInterface
{
	List<AddressBook> personAddressList = new ArrayList<>();
	JSONObject jo = new JSONObject();
	JSONArray ja = new JSONArray();
	JSONParser jpr = new JSONParser();

	@Override
	public void addPerson(String firstName, String lastName, String address, String city, String state, String Zip,
			String phoneNo) 
	{
		try 
		{
			AddressBook input = new AddressBook();
			input.setFirstName(firstName);
			input.setLastName(lastName);
			input.setAddress(address);
			input.setCity(city);
			input.setCity(state);
			input.setZip(Zip);
			personAddressList.add(input);
			jo.put("Person", input);
			PrintWriter pw  = new PrintWriter("/home/bridgelabz/eclipse-workspace/BridgelabNiranjan/oops/com/bridgelabz/repositary/person.json");
			pw.write(jo.toJSONString());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void printAll() 
	{
		personAddressList.forEach(i -> {System.out.println(" FirstName : "+i.getFirstName()+" LastName : "+i.getLastName()+" Address : "+i.getAddress()+" City : "+i.getCity()+" State : "+i.getState()+" Zip : "+i.getZip()+" Phoneno : "+i.getPhone_no());});

	}
	
	
	@Override
	public void removePerson(int index) 
	{
		
	}

	@Override
	public void updatePerson(String firstName, String lastName, String address, String city, String state, String Zip,
			String phoneno) {
		
	}

	@Override
	public void sortByName() {
		
	}

	@Override
	public void sortByZip() {

		
	}

	

	@Override
	public void setFile(File file) {

	}
	
}
