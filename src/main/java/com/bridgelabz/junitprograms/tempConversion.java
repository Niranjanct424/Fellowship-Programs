package com.bridgelabz.junitprograms;

import com.bridgelabz.utility.Util;

public class tempConversion 
{
	public static void main(String[] args) 
	{
		double tempincel = Util.temperaturConversion(41);
		System.out.println("fahrenheit to celcius "+tempincel);
		double tempinFarh = Util.temperaturConversion1(41);
		System.out.println("celsius to fahrenheit "+tempinFarh);
	}
}
