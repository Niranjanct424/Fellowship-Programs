package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.junitprograms.NoteReturnedByWendingMachine;

class CurrencyCount 
{
	@Test
	void test() 
	{
		NoteReturnedByWendingMachine changers = new NoteReturnedByWendingMachine();
		int[] expected = {0,0,0,0,1,1,0,1,0};
		int[] actual = changers.countCurrency(75);
		
		assertArrayEquals(expected, actual," checking number of currency count is equal");
	}
}
