package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Util;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericBubbleSortofStrings 
{
	public static void main(String[] args)
	{
		String[] arr = {"money","status","anger","joke"};
		//Generic bubble sort for Strings
		ArrayList<String> a = Util.genericBubbleSortforStrings(arr);
		//ArrayList accepts only strings
		System.out.print(a+" ");
		System.out.println("Sorted elements using Iterator");
		//using iterator generating data 
		Iterator<String> it = a.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+", ");
		}
	}
}
