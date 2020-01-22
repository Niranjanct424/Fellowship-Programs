package com.bridgelabbz.oops;

import java.io.Serializable;
import java.util.Observable;
public class AddressBook extends Observable implements Serializable
{
	/*
	 * An object of this class maintains the collection of Person objects 
	 * that constitute an address book
	 */
	  String firstName;
	  String lastName;
	  String address;
	  String city;
	  String stat;
	  String zip;
	  String phno;
	  int numofpersons;
	
	public AddressBook() 
	{
		super();
	}
	public int getNumberofPersons()
	{
		return numofpersons;
	}
	
	public void addPerson(String firstName,
						  String lastName,
						  String address,
						  String city,
						  String state,
						  String zip,
						  String phno)
	{
		
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		
	}

	
}
