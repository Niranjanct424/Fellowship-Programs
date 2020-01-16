package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Util;

class Tempconversion 
{
	@Test
	void test() 
	{
		double actual = Util.temperaturConversion(100);
		double expected = 37.0;
		assertEquals(expected, actual);
	}
	@Test
	void test1() 
	{
		double actual = Util.temperaturConversion1(100);
		double expected = 212.0;
		assertEquals(expected, actual);
	}
}
