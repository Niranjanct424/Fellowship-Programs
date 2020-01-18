/* Purpose: Determines  Palindrome prime numbers
 *
 *  @author  Niranjan.c.t
 *  @version 1.0
 *  @since   17-08-2017
 ******************************************************************************/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class PalindromePrimeNumbers 
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
