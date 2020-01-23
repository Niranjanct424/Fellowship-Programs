package com.bridgelabz.controller;

import com.bridgelabz.serviceimplementation.InventaryDataManagementImplementation;

public class InventaryDataManagementController 
{

	public static void main(String[] args) 
	{
		System.out.println("<----Inventary Data Management Detials ---->");
		InventaryDataManagementImplementation in = new InventaryDataManagementImplementation();
		in.readInventoryDataFile();
	}

}
