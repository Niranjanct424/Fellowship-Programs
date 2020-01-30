package com.bridgelabz.junitprograms;

import com.bridgelabz.utility.Util;

public class monthlyPayment 
{
	public static void main(String[] args) 
	{
		double payment = Util.monthlyPayment(5000, 1, 5.5);
		System.out.println("Monthly payment is "+payment);
	}
}
