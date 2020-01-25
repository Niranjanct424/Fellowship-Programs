/*
 * JSON Inventory Data Management of Rice, Pulses and Wheat
 */
package com.bridgelabz.controller;
import com.bridgelabz.oopsutility.Util;
import com.bridgelabz.serviceimplementation.AddressBookImplementation;

public class AddressBookController 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter your first name");
		String fname = Util.inputString();
		System.out.println("Enter your last name");
		String lname = Util.inputString();
		System.out.println("Enter your city ");
		String city = Util.inputString();
		System.out.println("Enter your state");
		String state = Util.inputString();
		System.out.println("Enter your Zip-code");
		String zip = Util.inputString();
		System.out.println("Enter your phonenumber");
		String phno = Util.inputString();
		AddressBookImplementation amp = new AddressBookImplementation();
		amp.addPerson(fname,lname, city, state, zip, phno);
	}

}
