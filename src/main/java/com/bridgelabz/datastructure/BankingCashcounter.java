package com.bridgelabz.datastructure;

import java.util.HashMap;
import java.util.Map;

import com.bridgelabz.oopsutility.Util;

public class BankingCashcounter {
	int rear;
	int front;
	int size;
	double[] darr = new double[20];

	/**
	 * Using map we are holding the name and deposit amount of the user
	 */
	Map<String, Double> account = new HashMap<String, Double>();

	/**
	 * enqueue takes name and deposit amount
	 * 
	 * @param data
	 * @param name
	 */
	public void enqueue(double data, String name) {
		/**
		 * if name not exist which is going to create person account
		 */
		if (!isFull()) {
			/**
			 * money added to user account
			 */
			if (!(account.containsKey(name))) {
				darr[rear] = data;
				rear = (rear + 1) % 20;
				size = size + 1;
				account.put(name, data);
				System.out.println(name + " deposited first cash is to Account is " + account.get(name));
			} else {
				/**
				 * if user exist then it will add money to user account
				 */
				System.out.println(name + " got deposited " + data + "  acoount");
				/**
				 * charCountMap.put(c, charCountMap.get(c) + 1);
				 */
				account.put(name, account.get(name) + data);
			}
			/**
			 * System.out.println(name+" Your total balance is "+account.get(name));
			 */
		} else {
			System.out.println("Stack is full cant deposit today");
		}
	}

	/**
	 * user must provide the name of account & withdraw money
	 */
	public void withdraw(String name, double money) {
		if (account.containsKey(name)) {
			if ((money < account.get(name)) && (account.get(name) >= 0)) {
				// account.put(name,account.get(name)+data);
				account.put(name, account.get(name) - money);
				System.out.println(name + " You just withdraw " + money);
				System.out.println(name + " Remaining balance after Withdraw " + account.get(name));
			} else {
				System.out.println("You enter higher amout or try to withdraw min balance");
			}
		} else {
			System.out.println("User does not exist ");
		}
	}

	/**
	 * Using dequeue user need to withdraw amount
	 * 
	 * @param name
	 * @param money
	 */

	public double dequeue(String name, double money) {
		withdraw(name, money);
		double data = 0;
		if (!isEmpty()) {
			data = darr[front];
			front++;
			size = (size - 1) % 5;
		} else {
			System.out.println("Queue is empty");
		}
		return data;
	}

	/**
	 * This provides the user balance in the account
	 * 
	 * @param name
	 */
	public void balance(String name) {
		System.out.println(name + " Your total balance is " + account.get(name));
	}

	/**
	 * checks queue having elements or not
	 * 
	 * @return isEmpty if size is 0
	 */
	public boolean isEmpty() {
		return size() == 0;
	}

	/**
	 * size of the queue
	 * 
	 * @return integer size
	 */
	public int size() {
		return size;
	}

	/**
	 * this function display the list of elements
	 */
	public void Queue() {
		for (int i = 0; i < size; i++) {
			System.out.print(darr[front + i] + " ");
		}
	}

	/**
	 * check if queue is full?
	 * 
	 * @return boolean value
	 */
	public boolean isFull() {
		return size == 20;
	}

	public static void main(String[] args) {
		BankingCashcounter b = new BankingCashcounter();
		int ch = 0;
		while (ch != 4) {
			System.out.println("Enter 1 to Deposit");
			System.out.println("Enter 2 to Withdraw");
			System.out.println("Enter 3 to CheckBalance");
			System.out.println("Enter 4 to Exit");
			ch = Util.inputInteger();
			switch (ch) {
			case 1:

				System.out.println("Enter the Account holder name of BankAccount");
				String s = Util.inputString();
				System.out.println("Enter money you want deposit");
				double d = Util.inputDouble();
				b.enqueue(d, s);
				break;
			case 2:
				System.out.println("Plese enter your Account number and Amount to Withdraw");
				System.out.println("Enter AccountName of person to Withdraw");
				String wn = Util.inputString();
				System.out.println("Enter amout you want to Withdraw");
				double wd = Util.inputDouble();
				b.dequeue(wn, wd);
				break;
			case 3:
				System.out.println("Enter the Account holder name of Bank to check the Balance");
				String name = Util.inputString();
				b.balance(name);
				break;
			case 4:
				System.out.println("exit");
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}
		}

	}
}
