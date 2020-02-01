package com.bridgelabz.controller;

public class DeckOfCards 
{

	public static void main(String[] args) 
	{
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		String[] deck = new String[52];
		String[][] twod = new String[4][13];
		for(int i=0; i<deck.length; i++)
		{
			deck[i] = ranks[i%13] + suits[i/13];
		}
		for(int i=0; i<deck.length; i++)
		{
			int index = (int)(Math.random()*deck.length);
			String temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		for(int i=0; i<1; i++)
		{
			for(int j=0;j<13; j++)
			{
				twod[i][j] = deck[j];
			}
		}
		int l=13;
		for(int i=1; i<2; i++)
		{
			for(int j=0;j<13; j++)
			{
				twod[i][j] = deck[l];
				l++;
			}
		}
		int h=26;
		for(int i=2; i<3; i++)
		{
			for(int j=0;j<13; j++)
			{
				twod[i][j] = deck[h];
				h++;
			}
		}
		int z=39;
		for(int i=3; i<4; i++)
		{
			for(int j=0;j<13; j++)
			{
				twod[i][j] = deck[z];
				h++;
			}
		}
		for(int i=0; i<4; i++)
		{
			for(int j=0;j<13; j++)
			{
				System.out.print(twod[i][j]+"    "); 
			}
			System.out.println();
		}
	}
	
}
