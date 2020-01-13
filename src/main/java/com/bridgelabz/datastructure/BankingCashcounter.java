package com.bridgelabz.datastructure;

import java.util.HashMap;
import java.util.Map;

public class BankingCashcounter 
{
	int rear;
	int front;
	int size;
	double[] darr = new double[20];
	//Using map we are holding the name and deposit amount of the user 
	Map<String,Double> account = new HashMap<String,Double>();
	
	//enqueue takes name and deposit amout
	public void enqueue(double data,String name)
	{
		if(!isFull())
		{
			//if name not exist which is going to create person account 
			//money added to user account
			if(!(account.containsKey(name)))
			{
				darr[rear] = data;
				rear = (rear+1)%20;
				size = size +1;
				account.put(name, data);
				System.out.println(name+" deposited first cash is to Account is "+account.get(name));
			}
			else
			{
				//if user exist then it will add money to user account
				System.out.println(name+" got deposited "+data+"  acoount");
				// charCountMap.put(c, charCountMap.get(c) + 1); 
				account.put(name,account.get(name)+data);
			}
			//System.out.println(name+" Your total balance is "+account.get(name));
		}
		else
		{
			System.out.println("Stack is full cant deposit today");
		}
	}
	//user must provide the name of account & withdraw money 
	public void withdraw(String name,double money)
	{
		if(account.containsKey(name))
		{
			if((money < account.get(name)) && (account.get(name)>= 0))
			{
				//account.put(name,account.get(name)+data);
				account.put(name,account.get(name)-money);
				System.out.println(name+" You just withdraw "+money);
				System.out.println(name+" Remaining balance after Withdraw "+account.get(name));
			}
			else
			{
				System.out.println("You enter higher amout or try to withdraw min balance");
			}
		}
		else
		{
			System.out.println("User does not exist ");
		}
	}
	//Using dequeue user need to withdraw amount
	public double dequeue(String name,double money)
	{
		withdraw(name,money);
		double data = 0;
		if(!isEmpty())
		{
			data = darr[front];
			front++;
			size = (size-1)%5;
		}
		else
		{
			System.out.println("Queue is empty");
		}
		return data;
	}
	//This provides the user balance in the account
		public void balance(String name)
		{
			System.out.println(name+" Your total balance is "+account.get(name));
		}
	//checks queue having elements or not
	public boolean isEmpty()
	{
		return size()==0;
	}
	//size of the queue
	public int size()
	{
		return size;
	}
	//this function display the list of elements 
	public void Queue()
	{
		for(int i =0; i<size; i++)
		{
			System.out.print(darr[front+i]+" ");
		}
	}
	//check if queue is full?
	public boolean isFull()
	{
		return size == 20;
	}
	
	public static void main(String[] args) 
	{
		BankingCashcounter b = new BankingCashcounter();
		b.enqueue(59000,"Michal-Scofild");
		b.enqueue(59000,"fild");
		b.enqueue(500,"Linkon barrows");
		b.enqueue(1477,"Michal-Scofild");
		b.enqueue(1869,"Linkon barrows");
		b.balance("Michal-Scofild");
		b.balance("Linkon barrows");
		b.dequeue("Michal-Scofild",55000);
		b.dequeue("Broad",70578);

	}
}
