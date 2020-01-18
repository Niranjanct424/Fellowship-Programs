package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.Iterator;

import com.bridgelabz.datastructure.PalindromeChecker.Node;
import com.bridgelabz.utility.Util;

public class QueuePrimeAnagrams 
{
	Node head;
	int size=0;
	
	 /* Linked list Node*/
	 class Node 
	 { 
	     int data; 
	     Node next; 
	     Node(int d) 
	     { 
	    	 data = d; 
	    	 next = null;
	     } 
	 } 
	 
		//add data at the front of the Linked list
		public void addFront(int data1)
		{
			Node n = new Node(data1);
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
		
		//remove last node of the list
			public Node removeRear()
			{
				if(head == null)
				return null;
				
				if(head.next == null)
					return null;
				
				Node secondlast = head;
				while(secondlast.next.next != null)
					secondlast = secondlast.next;
				
				secondlast.next = null;
					
				return head;
			}
			
			//function to check is list is empty
			public boolean isEmpty()
			{
				if(head == null)
				return true;
				
				else
				return false;
			}
			public void size()
			{
				System.out.println("size = "+size);
			}
	 
	 
		static final int TEN = 10; 
	    
	    // Function to update the frequency array 
	    // such that freq[i] stores the 
	    // frequency of digit i in n 
	    static void updateFreq(int n, int [] freq) 
	    { 
	      
	        // While there are digits 
	        // left to process 
	        while (n > 0) 
	        { 
	            int digit = n % TEN; 
	      
	            // Update the frequency of 
	            // the current digit 
	            freq[digit]++; 
	      
	            // Remove the last digit 
	            n /= TEN; 
	        } 
	    } 
	      
	    // Function that returns true if a and b 
	    // are anagarams of each other 
	    static boolean areAnagrams(int a, int b) 
	    { 
	      
	        // To store the frequencies of 
	        // the digits in a and b 
	        int [] freqA = new int[TEN]; 
	        int [] freqB = new int[TEN]; 
	      
	        // Update the frequency of 
	        // the digits in a 
	        updateFreq(a, freqA); 
	      
	        // Update the frequency of 
	        // the digits in b 
	        updateFreq(b, freqB); 
	      
	        // Match the frequencies of 
	        // the common digits 
	        for (int i = 0; i < TEN; i++)  
	        { 
	      
	            // If frequency differs for any digit 
	            // then the numbers are not 
	            // anagrams of each other 
	            if (freqA[i] != freqB[i]) 
	                return false; 
	        } 
	        return true;
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
		QueuePrimeAnagrams q1 = new QueuePrimeAnagrams();
	
		int a=0,b=0,c=1,d=0;
		int[][] twodarr = new int[2][250];
		ArrayList<Integer> an = new ArrayList<Integer>();
		int[] array = Util.prime();
		for(int i=0; i< array.length; i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				  if(areAnagrams(array[i], array[j])) 
				  {
						an.add(array[i]);
						b++;
				  }	  
				  else
				  {
					  d++;
				  }
			}
		}
		System.out.println(an);
	
		//q1.addFront();
//		q1.addFront("1");
//		q1.addFront("2");
//		q1.addFront("3");
//		q1.addFront("4");
//		q1.show();
//		q1.size();
	}

}
