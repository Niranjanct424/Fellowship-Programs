package com.bridgelabz.utility;

//Generic stack
public class Stack<T> {
	Node top;

	class Node {
		T data;
		Node next;

		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	/**
	 * define function push() to push the data into stack
	 * 
	 * @param data ==> T
	 */
	public void push(T data) {
		Node new_node = new Node(data);
		if (top == null)
			top = new_node;
		else {
			Node current = top;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new_node;
		}
	}

	/**
	 * Define the pop() for removing the elements from stack
	 * 
	 * @return T
	 */
	public T pop() {
		T data = null;
		Node temp = top;
		if (top == null) {
			System.out.println("Stack is Empty");
		} else if (top.next == null) {
			data = (T) top.data;
			top = null;

		} else {
			while (temp.next.next != null) {
				temp = temp.next;
			}
			data = temp.next.data;
			temp.next = null;
		}
		return data;
	}

	/**
	 * define the function peek() to peek the last element
	 * 
	 * @return T
	 */
	public T peek() {
		T data = null;
		if (top == null)
			return data;
		else {
			Node current = top;
			Node previous = null;
			while (current != null) {
				previous = current;
				current = current.next;
			}
			data = previous.data;
		}
		return data;
	}

	/**
	 * to get the size of the stack
	 * 
	 * @return int
	 */
	public int size() {
		int size = 0;
		Node current = top;
		while (current != null) {
			current = current.next;
			size++;
		}
		return size;
	}

	/**
	 * to check the stack is empty or not
	 * 
	 * @return boolean
	 */
	public boolean isEmpty() {
		if (top == null)
			return true;
		else
			return false;
	}

	// to print the elements of stack
	public void display() {
		Node current = top;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}