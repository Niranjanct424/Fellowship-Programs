package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Util;

public class InsertionSortForInts 
{

	public static void main(String[] args) 
	{
		int[] arr = {4,2,8,5,9,1};
		//Insertion sort for integers
		int[] ar = Util.insertionSortforIntegers(arr);
		for(int i=0; i<ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
	
}
