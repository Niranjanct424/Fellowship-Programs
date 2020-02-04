/*
 * Simple Address book interfaces
 */
package com.bridgelabz.service;

public interface AddressBookService 
{
		public void addPerson();
		public void editUser (String person );
		public void deleteUser(String person);
		boolean search(String person);
		public void saveAs(String fileName);
		public void addJson(String fileName);
		public void deleteJson(String fileName);
		public void selectJson();
		
	
}
