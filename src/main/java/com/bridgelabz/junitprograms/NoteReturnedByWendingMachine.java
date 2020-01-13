package com.bridgelabz.junitprograms;

public class NoteReturnedByWendingMachine 
{
	public static void countCurrency(int amount) 
    { 
        int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 }; 
        int[] noteCounter = new int[9]; 
       
        // count notes using Greedy approach 
        for (int i = 0; i < 9; i++) 
        { 
            if (amount >= notes[i]) 
            { 
                noteCounter[i] = amount / notes[i]; 
                System.out.println("noteCounter[i]  = "+noteCounter[i] );
                amount = amount - noteCounter[i] * notes[i]; 
                System.out.println("amount "+amount);
            } 
        } 
       
        // Print notes 
        System.out.println("Currency Count ->"); 
        for (int i = 0; i < 9; i++) 
        { 
            if (noteCounter[i] != 0) 
            { 
                System.out.println(notes[i] + " : "
                    + noteCounter[i]); 
            } 
        } 
    } 
        public static void main(String argc[])
        { 
            int amount = 75; 
            countCurrency(amount); 
        }
}
