package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Util;

class MonthlyPayment 
{
	@Test
	void test() 
	{
		double expected = 85.83678457234862;
		double actual =  Util.monthlyPayment(1000, 1, 5.5);
		assertEquals(expected, actual);
	}
	@Test
	void test1() 
	{
		double expected = 103.00414148681834;
		double actual =  Util.monthlyPayment(1200, 1, 5.5);
		assertEquals(expected, actual);
	}
	@Test
	void test2() 
	{
		double expected = 154.0934672192414;
		double actual =  Util.monthlyPayment(1800, 1, 5);
		assertEquals(expected, actual);
	}
	@Test
	void test3() 
	{
		double expected = 429.18392286174316;
		double actual =  Util.monthlyPayment(5000, 1, 5.5);
		assertEquals(expected, actual);
	}
}
