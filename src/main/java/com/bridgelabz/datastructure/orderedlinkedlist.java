package com.bridgelabz.datastructure;

	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;

	public class orderedlinkedlist 
	{
		Node head; //head is the first node 
		
		class Node
		{
			int data;
			Node next; //holds the address of the next node
			
			Node(int d)
			{
				data = d;
				next = null;
			}
		}
		//adding elements in sorted way
		public void sortedinsert(Node newnode)
		{
			//special case for head
			Node current;
			if(head == null || head.data >= newnode.data)
			{
				newnode.next = head;
				head = newnode;
			}
			else
			{
				//insert at particular point
				current = head;
				while(current.next != null && current.next.data < newnode.data)
					current = current.next;
					
					newnode.next = current.next;
					current.next = newnode;
			}
		}
			// Function to create a node 
		    Node newNode(int data) 
		    { 
		       Node x = new Node(data); 
		       return x; 
		    }
		    
		    //Display the ordered elements of list
		    public void orderedlist()
		    {
		    	Node temp = head;
		    	while(temp != null)
		    	{
		    		System.out.print(temp.data+" ");
		    		temp = temp.next;
		    	}
		    }
		    
		    /*public void remove(int numb)
		    {
		    	Node temp = head;
		    	while(temp != null)
		    	{
		    		Node current = temp.next;
		    		if(temp.next.data ==  numb)
		    		{
		    			temp.next = current;
		    		}
		    		temp = temp.next;
		    	}
		    }*/
		    
		
		public static void main(String[] args) throws FileNotFoundException 
		{
			int[] arr = new int[1000];
			String[] sarr = null;
			String line;
			orderedlinkedlist ol = new orderedlinkedlist();
			Node newnode;
			/*newnode = ol.newNode(7);
			ol.sortedinsert(newnode);
			newnode = ol.newNode(28);
			ol.sortedinsert(newnode);*/
			
			try
			{
				BufferedReader br = new BufferedReader(new FileReader("D:\\textfiles\\one.txt"));
				int i;
				while((line = br.readLine())!= null)
				{
					sarr = line.split(",");
				}
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			//Adding numbers from a file 
			for(int i=0; i<sarr.length; i++)
			{
				arr[i] = Integer.parseInt(sarr[i]);
			}
			for(int i=0; i<sarr.length; i++)
			{
				newnode = ol.newNode(arr[i]);
				ol.sortedinsert(newnode);
			}
			ol.orderedlist();
		}	
}
