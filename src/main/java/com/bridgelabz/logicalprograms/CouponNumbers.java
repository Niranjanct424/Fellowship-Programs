package com.bridgelabz.logicalprograms;

import java.util.Iterator;
import java.util.Set;

import com.bridgelabz.utility.Util;

public class CouponNumbers 
{
	public static void main(String[] args) 
	{
		System.out.println("How many distinct coupon number you want to Geneaate? ");
		int no = Util.inputInteger();
		Set<String> s = Util.couponNumbers(no);
		Iterator<String> it = s.iterator();
		 while(it.hasNext()) 
		 {
			System.out.print(it.next()+" ");
		 }
	}
}
