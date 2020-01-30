package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Util;

class sqrtofnonNegativenums 
{
	@Test
	void test() 
	{
		double expected = 10.0;
		double actual = Util.sqrtofnonnegnumber(100);
		assertEquals(expected, actual);
	}
	@Test
	void test1() 
	{
		double expected = 12.0;
		double actual = Util.sqrtofnonnegnumber(144);
		assertEquals(expected, actual);
	}
	@Test
	void test2() 
	{
		double expected = 8.0;
		double actual = Util.sqrtofnonnegnumber(64);
		assertEquals(expected, actual);
	}
	@Test
	void test3() 
	{
		double expected = 9.0;
		double actual = Util.sqrtofnonnegnumber(81);
		assertEquals(expected, actual);
	}
	@Test
	void test4() 
	{
		double expected = 5.0;
		double actual = Util.sqrtofnonnegnumber(25);
		assertEquals(expected, actual);
	}
}
