package com.bridgelabz.datastructure;

//Palindrome checker using LinkedList
class PalindromeChecker 
{
	Node head;
	
	 /* Linked list Node*/
	 class Node 
	 { 
	     String data; 
	     Node next; 
	     Node(String d) 
	     {
	    	 data = d; 
	    	 next = null; 
	     } 
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
	
	//add data at the front of the Linked list
	public void addFront(String data1)
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
	}
	
	//add Node at the end of the linked List
	public void addRear(String newdata)
	{
		Node n = new Node(newdata);
		
		if(head == null)
		{
			head = new Node(newdata);
			return;
		}
			n.next = null;
			Node last = head;
			while(last.next != null)

				last = last.next;
				last.next = n;
				n.next = null;
				return;
	}
	
	//remove first node of the list
	public Node removeFront()
	{
		if(head == null)
		{
			return null;
		}
		Node temp = head;
		head = temp.next;
		return head;
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
	
	//method to check list elements are palindrome
	public void isStringsPalindrome()
	{
		System.out.println("LinkedList elements of checking isPalindrome : ");
		Node temp = head;
		while(temp != null)
		{
			String rev ="";
			for(int j=temp.data.length()-1; j>=0 ;j--)
			{
				rev = rev + temp.data.charAt(j);
			}
			if(temp.data.equals(rev))
			{
				System.out.println(temp.data+" is Palindrome reversed string-> "+rev);
			}	
			else
			{
				System.out.println(temp.data+" is Not a Palindrome reversed string-> "+rev);
			}
			temp = temp.next;
		}
	}
	
	
	public static void main(String[] args) 
	{
		PalindromeChecker p = new PalindromeChecker();
		p.addRear("one");
		p.addRear("madam");
		p.addRear("dad");
		p.addRear("lol");
		p.isStringsPalindrome();
//		System.out.println("Checking Linkedlist isEmpty : "+p.isEmpty());
//		p.addFront("one");
//		p.addFront("two");
//		p.addFront("three");
//		p.addFront("four");
//		p.addRear("addedattherear");
//		p.removeFront();
//		p.removeRear();
//		p.show();
//		System.out.println();
//		System.out.println("Checking Linkedlist isEmpty : "+p.isEmpty());
		
		
	}
}
