package com.bridgelabz.basic;

import com.bridgelabz.utility.Util;

public class Harmonic
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number to Calculate value of Harmonic number");
		int no = Util.inputInteger();
		boolean bool = Util.isGreaterthanZero(no);
		if(bool)
		{
			double harmonicno = Util.harmonicNumber(no);
			System.out.println("Value of Harmonic number "+no+" is "+harmonicno);
		}
		else
		{
			System.out.println("Number should be greater then Zero");
		}
	}
}
