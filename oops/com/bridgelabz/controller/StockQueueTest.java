package com.bridgelabz.controller;


import com.bridgelabz.serviceimplementation.StockQueue;
import com.bridgelabz.utility.Utility;

public class StockQueueTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		StockQueue stockQueue = new StockQueue();

		int ch = 0;
		do {
			System.out.println("Enter your choice : ");
			System.out.println("1.Buyer Details ");
			System.out.println("2.Seller Details ");
			int choice = Utility.nextInteger();
			switch (choice) {
			case 1:
				stockQueue.buyDetails();
				break;

			case 2:
				stockQueue.sellDetails();
				break;

			default:
				System.out.println("Invalid Choice");
			}

		} while (ch < 2);
	}
}
