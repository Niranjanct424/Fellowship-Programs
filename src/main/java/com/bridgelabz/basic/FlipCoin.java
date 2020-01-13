package com.bridgelabz.basic;

import com.bridgelabz.utility.Util;

public class FlipCoin
{
	public static void main(String[] args) 
	{
		System.out.println("Enter how many time you want to Flip a Coin");
		double number = Util.inputInteger();
		double[] darr = Util.FlipCoin(number);
		System.out.println("FlipCoin results : ");
		System.out.println("Head Percentage = "+darr[0]);
		System.out.println("Tail Percentage = "+darr[1]);
	}
}




