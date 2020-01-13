package com.bridgelabz.functionalprogramming;

import com.bridgelabz.utility.Util;

public class Distance 
{
	public static void main(String[] args) 
	{
		int x = 10;
		int y = 10;
		System.out.println("Euclidean distance from the point (x, y) to the origin (0, 0)");
		double dist = Util.distance(x,y);
		System.out.println(dist);
	}
}
