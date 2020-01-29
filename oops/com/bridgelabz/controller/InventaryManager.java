package com.bridgelabz.controller;

import com.bridgelabz.serviceimplementation.InventaryManagerserviceImplementation;

public class InventaryManager {

	public static void main(String[] args) 
	{
		System.out.println("--Inventary Manager Calculated detials---->");
		InventaryManagerserviceImplementation in = new InventaryManagerserviceImplementation();
		in.readInventoryDataFile();
	}

}
