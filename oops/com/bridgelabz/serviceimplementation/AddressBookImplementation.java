package com.bridgelabz.serviceimplementation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.model.AddressBook;
import com.bridgelabz.service.AddressBookService;
import com.bridgelabz.utility.Utility;

public class AddressBookImplementation implements AddressBookService {
	AddressBook a = new AddressBook();
	JSONObject globalobject = new JSONObject();
	JSONArray globalarray = new JSONArray();
	
	static String book = "/home/bridgelabz/eclipse-workspace/bridgelabz/oops/com/bridgelabz/repositary/book.json";

	@SuppressWarnings("unchecked")
	@Override
	public void addPerson() {
		
		 globalobject= Utility.readDetails(book);
		
		System.out.println("Enter person detials ");
		System.out.println("Enter person firstname");
		a.setFirstName(Utility.next());
		System.out.println("Enter person lastname");
		a.setLastName(Utility.next());
		System.out.println("Enter person city");
		a.setCity(Utility.next());
		System.out.println("Enter person state");
		a.setState(Utility.next());
		System.out.println("Enter person zip");
		a.setZip(Utility.next());
		System.out.println("Enter person phoneno");
		a.setPhone_no(Utility.next());
		
		JSONObject obj1 = new JSONObject();
		JSONArray array = new JSONArray();

		
		obj1.put("firstname", a.getFirstName());
		obj1.put("lastname", a.getLastName());
		obj1.put("city",a.getCity());
		obj1.put("state",a.getState() );
		obj1.put("zip",a.getZip());
		obj1.put("phone",a.getPhone_no());
		globalobject.put(a.getFirstName(), obj1);
		
		Utility.writeToFile(globalobject, book);	
		
		
	}

	@Override
	public void editUser(String person) {
		JSONObject index = new JSONObject();
		if(globalobject.containsKey(person))
		{
			index = (JSONObject) globalobject.get(person);
			index.get(0);
			index.replace(person, "f", "fffff");
		}

	}

	@Override
	public void deleteUser(String person) {
		JSONObject userobj = Utility.readDetails(book);
		if(userobj.containsKey(person))
		{
			System.out.println("person found");
			JSONObject delete = (JSONObject) globalobject.get(person);
			globalobject.remove(delete.get(0));
		}
		else
		{
			System.out.println("person not found");
		}
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
