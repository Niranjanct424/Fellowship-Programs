package com.bridgelabz.logicalprograms;

import com.bridgelabz.utility.Util;

public class ElapsedTime 
{
	public static void main(String[] args) 
	{
		System.out.println("Elapsed time using Thred");
		long elapsedtime = Util.stopWatch();
		System.out.println("Elapsed time "+elapsedtime+" seconds");
	}
}
