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
}
