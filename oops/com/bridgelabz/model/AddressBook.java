/*
 * Simple Address book
 */
package com.bridgelabz.model;

import java.io.Serializable;
import java.util.Observable;

@SuppressWarnings("serial")
public class AddressBook extends Observable implements Serializable
{
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String Zip;
	private String phone_no;
	
	public static String getFileName() 
	{
		return fileName;
	}

	public static void setFileName(String fileName) {
		AddressBook.fileName = fileName;
	}
	
	private static String fileName;
	
		
	public AddressBook()
	{
		super();
	}


	public AddressBook(String firstName, String lastName, String address, String city, String state, String zip,
			String phone_no) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		Zip = zip;
		this.phone_no = phone_no;
	}
	
	
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city) 
	{
		this.city = city;
	}
	public String getState() 
	{
		return state;
	}
	public void setState(String state) 
	{
		this.state = state;
	}
	public String getZip() 
	{
		return Zip;
	}
	public void setZip(String zip) 
	{
		Zip = zip;
	}
	public String getPhone_no() 
	{
		return phone_no;
	}
	public void setPhone_no(String phone_no) 
	{
		this.phone_no = phone_no;
	}
	
}
