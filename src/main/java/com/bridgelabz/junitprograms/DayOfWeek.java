package com.bridgelabz.junitprograms;
import com.bridgelabz.utility.Util;

public class DayOfWeek 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter day");
		int d1 = Util.inputInteger();
		System.out.println("Enter month");
		int m1 = Util.inputInteger();
		System.out.println("Enter year");
		int y1 = Util.inputInteger();
		String dayofWeek = Util.dayOfWeek(d1,m1,y1);
		System.out.println("Day of week is "+dayofWeek);
	}
}
