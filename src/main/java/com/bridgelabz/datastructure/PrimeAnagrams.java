/*
 * 
 *   Prime Numbers that are Anagram in the Range of 0 - 1000 in a Stack 
 *   using the Linked List and Print the Anagrams in the Reverse Order
 */
package com.bridgelabz.datastructure;

import java.util.ArrayList;

import com.bridgelabz.utility.Util;

public class PrimeAnagrams 
{
	public static void main(String[] args) 
	{
		int[][] twodarr = new int[2][150];
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> an = new ArrayList<String>();
		int[] arr = Util.prime();
		String[] sarr = new String[170];
		
		for(int i=0; i<arr.length; i++)
		{
			sarr[i] = Integer.toString(arr[i]);	
		}
		for(int i =0; i<sarr.length; i++)
		{
			for(int j=i+1;j<sarr.length;j++)
			{
			  an = Util.anagram1(sarr[i], sarr[j]);
			}
		}
		System.out.print(an);
		
		
	}
}
