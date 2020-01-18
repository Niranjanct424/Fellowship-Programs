package com.bridgelabz.datastructure;

import java.util.ArrayList;

import com.bridgelabz.utility.Util;

public class PrimeAngramsjava 
{
	static final int TEN = 10; 
    
    // Function to update the frequency array 
    // such that freq[i] stores the 
    // frequency of digit i in n 
    static void updateFreq(int n, int [] freq) 
    { 
      
        // While there are digits 
        // left to process 
        while (n > 0) 
        { 
            int digit = n % TEN; 
      
            // Update the frequency of 
            // the current digit 
            freq[digit]++; 
      
            // Remove the last digit 
            n /= TEN; 
        } 
    } 
      
    // Function that returns true if a and b 
    // are anagarams of each other 
    static boolean areAnagrams(int a, int b) 
    { 
      
        // To store the frequencies of 
        // the digits in a and b 
        int [] freqA = new int[TEN]; 
        int [] freqB = new int[TEN]; 
      
        // Update the frequency of 
        // the digits in a 
        updateFreq(a, freqA); 
      
        // Update the frequency of 
        // the digits in b 
        updateFreq(b, freqB); 
      
        // Match the frequencies of 
        // the common digits 
        for (int i = 0; i < TEN; i++)  
        { 
      
            // If frequency differs for any digit 
            // then the numbers are not 
            // anagrams of each other 
            if (freqA[i] != freqB[i]) 
                return false; 
        } 
        return true; 
    } 
	public static void main(String[] args) 
	{
		int a=0,b=0,c=1,d=0;
		int[][] twodarr = new int[2][250];
		ArrayList<Integer> an = new ArrayList<Integer>();
		int[] array = Util.prime();
		for(int i=0; i< array.length; i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				  if(areAnagrams(array[i], array[j])) 
				  {
						an.add(array[i]);
						b++;
				  }	  
				  else
				  {
					  d++;
				  }
			}
		}
		System.out.println(an);
		
	}
}
