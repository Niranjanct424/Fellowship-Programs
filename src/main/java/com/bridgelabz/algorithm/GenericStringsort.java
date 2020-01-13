package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Util;

public class GenericStringsort 
{
	public static void main(String[] args) 
	{
		String[] arr = {"na","ok","has","at"};
		//Insertion sort for Stings using generic's
		String[] s = Util.insertionSortforStrings(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(s[i]+" ");
		}
	}
}
