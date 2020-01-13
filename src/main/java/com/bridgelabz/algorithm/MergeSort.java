package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Util;

public class MergeSort 
{

	public static void main(String[] args) 
	{
		//merge sort for integers
		int[] arrele = {4,90,6,8,1,0,5,7,8,76,99,1,3,6,7,24,9,7};
		Util.sort(arrele);
		for(int i=0;i<arrele.length;i++)
		{
			System.out.print(arrele[i]+" , ");
		}
	}
}
