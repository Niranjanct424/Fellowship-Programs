package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class BubbleSortForIntegers 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,9,3,5,4,7,1};
		//bubble sort for Integers
		int[] ar = Util.bubbleSortforIntegers(arr);
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}
