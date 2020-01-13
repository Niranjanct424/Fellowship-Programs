package com.bridgelabz.functionalprogramming;

import com.bridgelabz.utility.Util;

public class TwodArray 
{
	public static void main(String[] args) 
	{
		System.out.println("How many Rows you need to create in 2d array");
		int row = Util.inputInteger();
		System.out.println("How many Coloums you need to create in 2d array");
		int cols = Util.inputInteger();
		System.out.println("You enterd 2d array elements: ");
		int[][] arr = Util.TwoDarray(row, cols);
		System.out.println("You enterd 2d array elements: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<cols;j++)
			{
			    System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
