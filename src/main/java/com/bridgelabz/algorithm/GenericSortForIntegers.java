package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Util;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericSortForIntegers 
{

	public static void main(String[] args) 
	{
		//integers sort using generic's
		int[] arr = {2,1,8,6,5,9};
		//ArrayList which accepts Integers only
		ArrayList<Integer> ar = Util.bubblesortforIntusingGeneric(arr);
		System.out.println("Using Generic Sorted Array Integers");
		System.out.println(ar);
		System.out.println();
		
	}



}
