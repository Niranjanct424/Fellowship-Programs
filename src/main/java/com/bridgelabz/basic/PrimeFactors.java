package com.bridgelabz.basic;

import java.util.Scanner;

public class PrimeFactors 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number to find the prime factors of number");
		int no = s1.nextInt();
		int[] arr = new int[100];
		for (int i = 2; i*i<=no; i++) 
		{
			while (no % i == 0 ) 
			{
				System.out.print(" "+i);//2,3
				 no = no/i;
			}
		}
		if(no > 2)
		{
			System.out.print(" "+no);
		}
	}
}
