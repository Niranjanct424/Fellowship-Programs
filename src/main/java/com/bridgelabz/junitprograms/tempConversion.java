package com.bridgelabz.junitprograms;

import com.bridgelabz.utility.Util;

public class tempConversion 
{
	public static void main(String[] args) 
	{
		double tempincel = Util.temperaturConversion(100);
		System.out.println("fahrenheit to celcius "+tempincel);
		double tempinFarh = Util.temperaturConversion1(100);
		System.out.println("celsius to fahrenheit "+tempinFarh);
	}
}
