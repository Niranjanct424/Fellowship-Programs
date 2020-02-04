/*
 * JSON Inventory Data Management of Rice, Pulses and Wheat
 */
package com.bridgelabz.controller;

import com.bridgelabz.serviceimplementation.AddressBookImplementation;
import com.bridgelabz.utility.Utility;

public class AddressBookController {

	public static void main(String[] args) {
		int ch = 0;
		AddressBookImplementation amp = new AddressBookImplementation();

		while (ch != 4) {

			System.out.println("Enter your choice ");
			System.out.println("1 to add detials");
			System.out.println("2 to display detials");
			System.out.println("3 to delete user detials ");
			System.out.println("4 to exit");
			System.out.println("5 to edit");
			ch = Utility.nextInteger();

			switch (ch) {
			case 1:
				amp.addPerson();
				break;
			case 2:
				System.out.println("");

				System.out.println();
				break;

			case 3:
				System.out.println("enter first name to delete detials");
				String firstname = Utility.next();
				amp.deleteUser(firstname);
				break;
			case 5:
				System.out.println("enter firstname to edit");
				amp.editUser(Utility.next());
				break;
			default:
				System.out.println("invalid choice ");
				System.out.println();
				break;
			}
		}

	}

}
