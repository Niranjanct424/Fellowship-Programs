package com.bridgelabz.datastructure;

public class PalindromeChecker 
{
	Node head;
	//Node last;
	
	//Display list data
	public void show()
	{
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
		Node n = new Node();
		n.data = data1;
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
	public void addRear(String data2)
	{
		Node n = new Node();
		n.data = data2;
		n.next = null;
		
		if(head == null)
		{
			Node head = n;
		}
		else
		{
			Node last = head;
			while(last.next != null)
			{
				last = last.next;
				last.next = n;
				
			}
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		PalindromeChecker p = new PalindromeChecker();
		p.addFront("one");
		p.addFront("two");
		p.addFront("three");
		p.addFront("four");
		p.addRear("ten");
		p.show();
	}
}
