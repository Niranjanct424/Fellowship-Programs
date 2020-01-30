package TestCases;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.junitprograms.DayOfWeek;
import com.bridgelabz.utility.Util;

class DayofWeek 
{
	@Test
	void test()
	{
		String day ="Thursday";
		int length = day.length();
		int actual = length;
		String result = Util.dayOfWeek(30, 01, 2020);
		int expected = result.length();
		assertEquals("Checking Day of week ", expected, actual);
	}
	@Test
	void test1()
	{
		
		String actual = "Thursday";
		String expected = Util.dayOfWeek(30, 01, 2020);
		assertEquals("Checking Day of week ", expected, actual);
	}
}
