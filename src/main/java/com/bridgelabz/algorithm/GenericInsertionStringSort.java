package com.bridgelabz.algorithm;
import com.bridgelabz.utility.Util;

import java.util.ArrayList;

public class GenericInsertionStringSort 
{
	public static void main(String[] args) 
	{
		//Insertion sort for strings using generic's
		String[] arr = {"me","sd","agsd","jskdhf"};
		//Generic's which accepts stings only
		ArrayList<String> a = Util.insertionSortforStingsusingGeneric(arr);
		System.out.print(a+" ");
	}
}
