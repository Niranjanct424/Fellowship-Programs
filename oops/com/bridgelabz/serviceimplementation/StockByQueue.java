package com.bridgelabz.serviceimplementation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.bridgelabz.utility.Queue;

public class StockByQueue {

	Queue<Object> transactionQueue = new Queue<>();
	LocalDateTime dateTime = LocalDateTime.now();
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String date_Time;
	String company_Name;
	String buyer_name;

	public StockByQueue(String company_Name, String buyer_name, String date_Time) {
		this.company_Name = company_Name;
		this.buyer_name = buyer_name;
		this.date_Time = date_Time;
	}

	public void queueTransaction() {
		transactionQueue.enQueue(new StockByQueue(company_Name, buyer_name, date_Time));
		display();
	}

	public void display() {
		StockByQueue object[] = transactionQueue.getObject();
		for (StockByQueue obj : object) {
			System.out.println("Company_Name : " + obj.company_Name);
			System.out.println("Buyer_Name : " + obj.buyer_name);
			System.out.println("Trade Initiated : " + obj.date_Time);
		}
	}

}
