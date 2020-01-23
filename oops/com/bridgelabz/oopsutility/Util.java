package com.bridgelabz.oopsutility;

import java.util.Scanner;

public class Util 
{

	static Scanner scanner = new Scanner(System.in);
	public static int inputInteger()
	{
		try
		{
			return scanner.nextInt();
		}
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		}
		return 0;
	}
	public static String inputString()
	{
		try
		{
			return scanner.next();
		}
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static double inputDouble()
	{
		try
		{
			return scanner.nextDouble();
		}
		catch (NumberFormatException e) 
		{
			e.printStackTrace();
		}
		return 0;
	}
}
