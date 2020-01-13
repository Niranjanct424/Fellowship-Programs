package com.bridgelabz.basic;

import com.bridgelabz.utility.Util;

public class ReplaceString 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Your Name Here :");
		String str = Util.inputString();
		String result = Util.replaceString(str);
		System.out.println(result);
	}
}
