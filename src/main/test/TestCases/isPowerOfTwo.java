package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Util;

class isPowerOfTwo 
{
	@Test
	void test() 
	{
		assertTrue(Util.isPowerTwo(8),"isPowerOfTwo");
	}
	@Test
	void test1() 
	{
		assertTrue(Util.isPowerTwo(4),"isPowerOfTwo");
	}
	@Test
	void test2() 
	{
		assertTrue(Util.isPowerTwo(2),"isPowerOfTwo");
	}
	@Test
	void test3() 
	{
		assertTrue(Util.isPowerTwo(16),"isPowerOfTwo");
	}
}
