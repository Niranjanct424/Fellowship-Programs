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
	@Test
	void test2() 
	{
		double actual = Util.temperaturConversion(70);
		double expected = 21.0;
		assertEquals(expected, actual);
	}
	@Test
	void test3() 
	{
		double actual = Util.temperaturConversion1(70);
		double expected = 158.0;
		assertEquals(expected, actual);
	}
	@Test
	void test4() 
	{
		double actual = Util.temperaturConversion(41);
		double expected = 5.0;
		assertEquals(expected, actual);
	}
	@Test
	void test5() 
	{
		double actual = Util.temperaturConversion1(41);
		double expected = 105.0;
		assertEquals(expected, actual);
	}
}
