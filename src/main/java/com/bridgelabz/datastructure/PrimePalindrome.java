package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Util;

public class PrimePalindrome 
{
	public static void main(String[] args)
	{
		String[] arr = Util.primePalindromes();
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
