package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Util;

import java.io.BufferedReader;
import java.io.FileReader;

public class BinarySearch 
{
	public static void main(String[] args) 
	{
		 try 
		 {
			 String str;
			 //Binary search first sorts and then searchs for the element into the list 
			 String[] arr = null;
			//reads data from file
			BufferedReader br = new BufferedReader(new FileReader("/home/bridgelabz/Desktop/one.txt"));
			while((str=br.readLine())!=null) 
			{
				//adding into string array
				arr = str.split(",");
			}
			//
			int searchitem = Util.binarySearchforWordList(arr,"7");
			System.out.println("List words from a file :");
			for(int i=0; i<arr.length; i++)
			{
				System.out.print(arr[i]+",");
			}
			System.out.println();
			System.out.println(arr[searchitem]+" found at "+searchitem+" index");
		 }
		 catch (Exception e) 
		 {
			e.printStackTrace();
		 }
	}
}
