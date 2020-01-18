package com.bridgelabz.algorithm;

import java.io.IOException;
import java.util.ArrayList;

import com.bridgelabz.utility.Util;

public class CustomizeMessage 
{
	public static void main(String[] args) 
	{
		try 
		{
			ArrayList<String> al = Util.customizeMessage();
			System.out.println(al);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
