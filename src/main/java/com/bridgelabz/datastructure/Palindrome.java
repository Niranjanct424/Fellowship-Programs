package com.bridgelabz.datastructure;

public class Palindrome 
{
	int front,rear,size;
	static final int capacity = 100;
	String[] queue = new String[capacity];
	
	//initializing the values
	public Palindrome()
	{
		front = 0;
		rear = -1;
		size = 0;
	}
	//checking queue is empty ?
	public boolean isEmpty()
	{
		return (size==0);
	}
	//checking is queue is full?
	public boolean isFull()
	{
		return (size==capacity);
	}
	//adding element form rear end
	public void addRear(String str)
	{
		if(!isFull())
		{
			rear = (rear+1)%capacity;
			queue[rear] = str;
			System.out.println("element enqueued at or addRearend "+queue[rear]);
			size++;
			//System.out.println("size = "+size);
		}
		else
		{
			System.out.println("Queue is ful");
		}
	}
	//Removing element from front end
	public String removeFront()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty cant remove anything");
			return null;
		}
		else
		{
			String dequeued = queue[front];
			System.out.println("dequeued or removeFront = "+dequeued);
			front = (front+1)%capacity;
			size--;
			System.out.println("size = "+size);
			return dequeued;
		}
	}
	//displays the elements of queue 
	public void printQueue()
	{
		if(isEmpty())
		{
			System.out.println("Can't print queue is empty");
		}
		else
		{
			System.out.println("Queue elements : ");
			for(int i=front; i<(front+size); i++)
			{
				System.out.print(queue[i]+" ,");
			}
		}
	}
	//checking list of string elements in queue are palindrome or not
	public void isStringsPalindrome()
	{
		for(int i=front; i<(front+size); i++)
		{
			String rev = "";
			for(int j=queue[i].length()-1; j>=0 ;j--)
			{
				rev = rev+queue[i].charAt(j);
			}
			if(queue[i].equals(rev))
			{
				System.out.println(queue[i]+" and "+rev+" -> is palindrome");
			}
			else
			{
				System.out.println(queue[i]+" and "+rev+" -> Not a palindrome");
			}
		}
	}
	public static void main(String[] args)
	{
		Palindrome p  = new Palindrome();
		p.addRear("dad");
		p.addRear("catch");
		p.addRear("run");
		p.addRear("abba");
		p.addRear("madam");
		p.printQueue();
		p.removeFront();
		p.printQueue();
		System.out.println();
		p.isStringsPalindrome();
	}
}
