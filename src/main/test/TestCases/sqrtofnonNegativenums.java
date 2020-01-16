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
}
