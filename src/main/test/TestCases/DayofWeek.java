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
		
		String actual = "Wednesday";
		String expected = Util.dayOfWeek(16, 01, 2020);
		assertEquals("Checking Day of week ", expected, actual);
	}
}
