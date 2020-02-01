package com.bridgelabz.basic;

import com.bridgelabz.utility.Util;

public class FlipCoin
{
	public static void main(String[] args) 
	{
		System.out.println("Enter how many time you want to Flip a Coin");
		double number = Util.inputInteger();
		Util.FlipCoin(number);
		System.out.println("FlipCoin results : ");
		Util  u = new Util();
		u.getH();
		u.getT();

		System.out.println("Head Percentage = "+u.getH());
		System.out.println("Tail Percentage = "+u.getT());
	}
}




