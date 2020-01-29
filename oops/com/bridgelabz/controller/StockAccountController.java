package com.bridgelabz.controller;

import com.bridgelabz.oopsutility.Util;
import com.bridgelabz.service.StockAccountServices;
import com.bridgelabz.serviceimplementation.StockAccountServiceImplementaion;

public class StockAccountController 
{
	public static void main(String[] args) 
	{
		
		StockAccountServiceImplementaion s1 = new StockAccountServiceImplementaion();
		int ch = 0;
		StockAccountServices in = new StockAccountServiceImplementaion();
		System.out.println("please enter option.\n1. add stock \n2. caculate stock \n3. exit");
		ch = Util.inputInteger();	
			switch(ch)
			{
			   case 1 :
				   System.out.println("Add Stock details ");	
			     	System.out.println("Enter Stock name");
			     	String name = Util.inputString();
			     	System.out.println("Enter Number of Shares ");
			     	int num = Util.inputInteger();
			     	System.out.println("Enter Share Price");
			     	double shareprice = Util.inputDouble();
			     	in.Stock(name, num, shareprice);
			      break;
			   
			   case 2 :
					System.out.println("Stock Reports-->StockName, NumberShares, ShareaPrices");
					System.out.println();
					in.StockReport();
			      break;
			   case 3 :
				   System.out.println("exit");
			
			   default : 
				   System.out.println("Invalid choice");
			}
		}		 

}
