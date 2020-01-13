package com.bridgelabz.logicalprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTocToe 
{
	static ArrayList<Integer> playerposion = new ArrayList<Integer>();
	static ArrayList<Integer> cpurposion = new ArrayList<Integer>();
	public static void main(String[] args) 
	{
	    
		char[][] gameboard = 
			   {{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '},
				{'-','+','-','+','-'},
				{' ','|',' ','|',' '}};
		printGameboard(gameboard);
		Scanner s = new Scanner(System.in);
		while (true) 
		{
			System.out.println("Enter the number between 0-9");
			int pos = s.nextInt();
			System.out.println(pos);
			while(playerposion.contains(pos) || cpurposion.contains(playerposion))
			{
				System.out.println("place alreay taken choice again different no");
				pos = s.nextInt();
			}
			
			placepeace(gameboard,pos,"player");
			Random rd = new Random();
			int cpuno = rd.nextInt(9)+1;
			while(playerposion.contains(cpurposion) || cpurposion.contains(cpurposion))
			{
				cpuno = rd.nextInt(9)+1;
			}
			placepeace(gameboard,cpuno,"cpu");
			printGameboard(gameboard);
			 String result = checkwinner();
			 if(result.length()>0)
			 {
				 System.out.println(result);
				 break;
			 }
		}
		
		}
		 

	public static void printGameboard(char[][] gameboard)
	{
		
		for(char[] c: gameboard)
		{
			System.out.print(c);
			System.out.println();
		}
	}
	public static void placepeace(char[][] gameboard,int pos, String user)
	{
		char symbol = ' ';
		if(user.equals("player"))
		{
			symbol ='x';
			playerposion.add(pos);
		}
		else if(user.equals("cpu"))
		{
			symbol ='0';
			cpurposion.add(pos);
		}
		switch (pos) {
		case 1:
			gameboard[0][0] = symbol;
			break;
		case 2:
			gameboard[0][2] = symbol;
			break;
		case 3:
			gameboard[0][4] = symbol;
			break;
		case 4:
			gameboard[2][0] = symbol;
			break;
		case 5:
			gameboard[2][2] = symbol;
			break;
		case 6:
			gameboard[2][4] = symbol;
			break;
		case 7:
			gameboard[4][0] = symbol;
			break;
		case 8:
			gameboard[4][2] = symbol;
			break;
		case 9:
			gameboard[4][4] = symbol;
			break;
		default:
				break;
	}
		
 }
	public static String checkwinner()
	{
		List toprow = Arrays.asList(1,2,3);
		List midrow = Arrays.asList(4,5,6);
		List botrow = Arrays.asList(7,8,9);
		List leftcol = Arrays.asList(1,4,7);
		List midcol = Arrays.asList(2,5,8);
		List rightcol = Arrays.asList(3,6,9);
		List cross1 = Arrays.asList(1,5,9);
		List cross2 = Arrays.asList(3,5,7);
		
		List<List> winning = new ArrayList<List>();
		winning.add(toprow );
		winning.add(midrow);
		winning.add(botrow);
		winning.add(leftcol);
		winning.add(midcol);
		winning.add(rightcol);
		winning.add(cross1);
		winning.add(cross2);
		
	   	
		for(List l : winning)
		{
			if(playerposion.containsAll(l))
			{
				return "congrats you won";
			}
			else if (cpurposion.containsAll(l)) 
			{
				return "sorry cpu won :(";
			}
			else if(playerposion.size() == 9)
			{
				return "cat!";
			}
			
		}
		return "";
	}
}
