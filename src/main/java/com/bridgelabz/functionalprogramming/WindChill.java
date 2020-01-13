package com.bridgelabz.functionalprogramming;

import com.bridgelabz.utility.Util;

public class WindChill 
{
	public static void main(String[] args) 
	{
		String d1 = args[0];
		String d2 = args[1];
		
		double t = Double.parseDouble(d1);
		double v = Double.parseDouble(d2);
		
		Util.WindChild(t,v);
		//4 7
	}

}
