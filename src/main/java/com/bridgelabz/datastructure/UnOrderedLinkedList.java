package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.utility.Util;

public class UnOrderedLinkedList 
{
	Node head;
	Node last;
	int size = 0;
	
	
	//checking is there any elements in the list
	public boolean isEmpty()
	{
		if(size == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//this method displays number of elements in the list 
	public void size()
	{
		System.out.println("size of the list is = "+size);
	}
	
	//adding new Node into the linked list
	public void add(String data)
	{
		Node node = new Node();
		node.data = data;
		node.next =null;
		
		if(head == null)
		{
			head = last =  node;
		}
		else
		{
			
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = node;
			size++;
		}
	}
	
	//Displays the data present in the list
	public void list()
	{
		Node temp = head;
		while(temp.next != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	//Adding data into first 
	public void AddatFirst(String data)
	{
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
		size++;
	}
	
	//Insert data at particular position
	public void insert(String data,int pos)
	{
		Node node = new Node();
		node.data = data;
		
		if(pos == 0)
		{
			AddatFirst(data);
			size++;
		}
		else
		{
			Node temp = head;
			for(int i=0; i<pos-1;i++)
			{
				temp = temp.next;
			}
			node.next  = temp.next;
			temp.next = node;
			size++;
		}
	}
	//removes data from particular position in linkedlist
	public void pop(int pos)
	{
		if(pos == 0)
		{
			head = head.next;
		}
		else
		{
			Node temp = head;
			Node n1 = null;
			
			for(int i=0; i<pos-1; i++)
			{
				temp = temp.next;
			}
			n1 = temp.next;
			temp.next = n1.next;
		}
	}
	
	//Removes the last node from a list
	public Node pop()
	{
	 Node temp = head;
	 if(temp == null || temp.next == null)
		{
			head = null;
			return temp;
		}
		else
		{
			Node nextnode = temp.next;
			while(temp.next != null)
			{
				if(nextnode.next == null)
				{
					temp.next = null;
				}
				temp = nextnode;
				nextnode = nextnode.next;
				
			}
			System.out.println("poped "+temp.data);
		}
	return temp;
	}
	
	//element stored in which index if exist 
	public void indexof(String data2)
	{
		int index = 0;
		Node temp = head;
		while(temp != null)
		{
			if(temp.data.equals(data2))
			{
				System.out.println(data2+" is found at index "+index);
			}
			index++;
			temp = temp.next;
		}
		if(data2 == null )
		{
			System.out.println("list empty cant find");
		}
	}
	
	//returns true if data exist else  return false
	public boolean searchdata(String da)
	{
		Node temp = head;
		boolean flag =  false;
		int i = 1;
		
		if(head == null)
		{
			System.out.println("List is empty u cant search");
		}
		else
		{
			while(temp != null)
			{
				if(temp.data == da)
				{
					flag = true;
					break;
				}
				i++;
				temp = temp.next;
			}
		}
		if(flag)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/*public void deleteNode(Node n) {

		if(head ==null){
		System.out.println("List is Empty");
		}
		if(head.data == n.data){
		head=head.next;
		}
		if(head == null){ // Check if there was only one element in Original list
		return;
		}
		Node curr = head;
		while (curr.next != null) {
		if (curr.next.data == n.data) {
		curr.next= curr.next.next;
		} else {
		curr = curr.next;
		}
		}
		}*/

	public static void main(String[] args) throws IOException 
	{
		String[] sarr = null;
		try 
		{
			//reading from file
			BufferedReader br = new BufferedReader(new FileReader("/home/bridgelabz/Desktop/words.txt"));
			String line;
			String str;
			String String;
			while((line = br.readLine()) != null) 
			{
				sarr = line.split(" ");
			}
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		UnOrderedLinkedList ul = new UnOrderedLinkedList();
		for (int i = 0; i < sarr.length; i++) 
		{
			//adding file words into linked list from a File words.txt
			ul.add(sarr[i]);
		}
		System.out.println("isEmpty "+ul.isEmpty());
		ul.size();
		ul.pop(0);
		ul.pop();
		ul.indexof("*is");
		ul.add("*one");
		ul.AddatFirst("*InsertedTopof the list");
		ul.insert("*me",2);
		ul.searchdata("*one");
		System.out.println("isEmpty "+ul.isEmpty());
		Node n = new Node();
		n.data = "name";
		ul.list();
	}
}
