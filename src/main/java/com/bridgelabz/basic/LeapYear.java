package com.bridgelabz.basic;

import com.bridgelabz.utility.Util;

public class LeapYear 
{
	public static void main(String[] args) 
	{
			System.out.println("Enter the Year of 4 digit to chick is it LeapYear or Not ");
			int str = Util.inputInteger();
			boolean dg=Util.digitlength(str);
			if(dg)
			{
				boolean res = Util.isLeapYear(str);
				if(res)
					System.out.println("Yes "+str+" it is a Leap year");
				else
					System.out.println(str+" is Not a Leap year");
			}
			else
				System.out.println("Enter four digit year to check Leap year");
	}

}
