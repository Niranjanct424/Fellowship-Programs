package com.bridgelabz.datastructure;

public class Calendar 
{
	public static int day(int month ,int day, int year)
	{
		int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31*m)/12) % 7;
		return d;
	}
	public static boolean isLeapYear(int year)
	{
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
		return true;
		
		return false;
	}
	
	public static void main(String[] args) 
	{
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		
		// leave empty so that months[1] = "January"
		  String[] months = 
			  {
		            "",
		            "January", "February", "March",
		            "April", "May", "June",
		            "July", "August", "September",
		            "October", "November", "December"
		        };
		  
		// days[i] = number of days in month i
	        int[] days = {
	            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	        };
	        
	        //if month is 2 check for leap year
	        if (month == 2 && isLeapYear(year)) 
	        {
	        	days[month] = 29;
	        }
	     // starting day
	        int d = day(month, 1, year);
	        
	     // print calendar header
	        System.out.println("% java Calender "+d+" "+year+"   \n"
	        		+ " "+ months[month] + " " + year);
	        System.out.println(" S  M Tu  W Th  F  S");
	        

	        // print the calendar
	        for (int i = 0; i < d; i++)
	        	   System.out.print("   ");
	        for (int i = 1; i <= days[month]; i++) 
	        {
	        	if(i < 10)
	        	{
	        		System.out.print("  "+i);
	        	}
	        	else
	        	{
	        		System.out.print(" "+i);
	        	}
	        	   
	            if (((i + d) % 7 == 0) || (i == days[month]))
	            	   System.out.println();
	        }
	}
}
