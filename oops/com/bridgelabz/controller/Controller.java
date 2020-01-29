package com.bridgelabz.controller;


import com.bridgelabz.utility.Utility;
import com.bridgelabz.serviceimplementation.ServicesImplementation;

public class Controller {

	// Main method
	public static void main(String[] args) {

		ServicesImplementation services = new ServicesImplementation();

		int ch = 0;
		do {
			System.out.println("*************************Stock Management*************************");
			System.out.println("1. Add Company Details");
			System.out.println("2. View Company Details");
			System.out.println("3. Price of share");
			System.out.println("4. Total Price of shares");
			System.out.println("5. Buy Shares");
			System.out.println("6. Sell Shares");
			System.out.println("7. Print report ");
			System.out.println("8. Exit");

			int choice = Utility.nextInteger();
			switch (choice) {
			case 1:
				// logic to add details
				services.addDetails();
				break;

			case 2:
				// for reading a data from file
				services.readFile();
				break;

			case 3:
				// for calculating a price of share
				double price = services.price();
				System.out.println(price);
				break;

			case 4:
				// for calculating a total price
				double totalPrice = services.totalPrice();
				System.out.println(totalPrice);
				break;

			case 5:
				System.out.println("Enter the company symbol : ");
				String companySymbol = Utility.next();
				System.out.println("Enter an amount : ");
				int amount = Utility.nextInteger();
				services.buy(amount, companySymbol);
				break;

			case 6:
				System.out.println("Enter the company name : ");
				String company_Symbol = Utility.next();
				System.out.println("Enter an amount : ");
				int amount1 = Utility.nextInteger();
				services.sell(amount1, company_Symbol);
				break;

			case 7:
				services.printReport();
				break;

			case 8:
				System.out.println("Thank You");
				System.exit(0);

			default:
				System.out.println("You entered wrong choice");
				break;

			}
		} while (ch < 8);
	}

}
