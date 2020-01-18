/*
 * prime anagrams in Queue
 * Storing all prime anagrams numbers in Queue 
 */
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Util;

public class QueueAnagram 
{
	Node head;
	int size=0;
	
	 /* Linked list Node*/
	 class Node 
	 { 
	     String data; 
	     Node next; 
	     Node(String primeNumbers) 
	     { 
	    	 data = primeNumbers; 
	    	 next = null;
	     } 
	 } 
	 
		//add data at the front of the Linked list
		public void addFront(String primeNumbers)
		{
			Node n = new Node(primeNumbers);
			//n.data = data1;
			n.next = null;
			if(head == null)
			{
				head = n;
			}
			else
			{
				n.next = head;
				head = n;
			}
			size++;
		}
		//Display list data
		public void show()
		{
			System.out.print("LinkedList elements : ");
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
		
	public static void main(String[] args) 
	{
		QueueAnagram q1 = new QueueAnagram();

		String[] primeNumbers = Util.prime(1000);

		// prints prime numbers that are anagrams
		for (int i = 0; i < primeNumbers.length; i++) 
		{
			for (int j = i + 1; j < primeNumbers.length; j++)
			{
				if (Util.anagram2(primeNumbers[i], primeNumbers[j])) 
				{
					q1.addFront(primeNumbers[i]);
				}
			}
		}
		q1.show();
		System.out.println();
		System.out.println(28%11);
	}
	
}
