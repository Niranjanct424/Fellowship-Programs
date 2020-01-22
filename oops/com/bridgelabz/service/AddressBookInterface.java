/*
 * Simple Address book interfaces
 */
package com.bridgelabz.service;

import java.io.File;

public interface AddressBookInterface 
{
	public void addPerson(String firstName, String lastName,String address,
		       String city, String state, String Zip, String phone_no);
	
	public void removePerson(int index);
	
	public void updatePerson(String firstName, String lastName,String address,
		       String city, String state, String Zip, String phone_no);
	
	public void sortByName();
	
	public void sortByZip();
	
	public void printAll();
	
	public void setFile(File file);
	
}
