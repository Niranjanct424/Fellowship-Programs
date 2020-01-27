package com.bridgelabz.controller;

import com.bridgelabz.model.CommercialStockAccount;
import com.bridgelabz.oopsutility.Util;
import com.bridgelabz.service.CommercialStockAccountServices;
import com.bridgelabz.serviceimplementation.CommercialStockAccountImple;

public class CommercialStockAccountCon extends CommercialStockAccount  {

	public static void main(String[] args) 
	{
		CommercialStockAccountServices cm = new  CommercialStockAccountImple();
		int ch=0;
		while (ch != 4) 
		{
			System.out.println("Enter your choice");
			System.out.println("Enter 1 to create new file");
			System.out.println("Enter 2 to buy data");
			System.out.println("Enter 3 to sell");
			System.out.println("Enter 4 exit");
			ch = Util.inputInteger();
			
			switch (ch) 
			{
			case 1:
				System.out.println("Enter file name to create File ");
				String file = Util.inputString();
				cm.StockAccount(file);
				System.out.println("Done created New File for Stock data");
				break;
			case 2:
				System.out.println("Enter amout you want to buy");
				int amt = Util.inputInteger();
				System.out.println("Enter Symbol(NameOFCmpany) to buy Stock for");
				String symb = Util.inputString();
				System.out.println("Enter buyer name");
				String name = Util.inputString();
				cm.buy(amt, symb, name);
				System.out.println("Stock buy successful and Detials Recorded");
				break;
			case 3:
				
				break;
			default:
				System.out.println("Invalid choice ");
				break;
			}
		}
		
	}

}
