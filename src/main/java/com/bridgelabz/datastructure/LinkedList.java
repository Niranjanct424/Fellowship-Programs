package com.bridgelabz.datastructure;


import java.util.NoSuchElementException;

public class LinkedList<G> {
	private Node<G> head;
	private int length;

	public LinkedList() {
		this.length = 0;
		this.head = null;
	}

	/**
	 * it check the length of the List. returns integer value.
	 */
	public int length() {
		return length;
	}

	/**
	 * it checks whether the List is empty or not .
	 * 
	 * return boolean value.
	 */
	public boolean isEmpty() {
		return length == 0;
	}

	/**
	 * Fetch the data of the node.
	 * 
	 * return <G> type data of list index.
	 */
	public G getData() {
		Node<G> current = head;
		return current.getData();
	}

	/**
	 * keeps on concatenating String value and at the end of the loop 
	 * and it returns the data in String.
	 */
	public String printString() {
		Node<G> current = head;
		String data = "";
		while (current != null) {
			data = data + current.data + ",";
			current = current.next;
		}
		return data;
	}

	/**
	 * if list is not empty then a temporary reference variable points to top of
	 * list and print all the data and then i am simply printing null to list printed 
	 * till last element.
	 */
	public void print() {
		Node<G> current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	/**
	 * This method will print the data in particular file location .
	 * parameter storingLocation as input
	 */
	public void print(String storingLocation) {
		Node<G> current = head;
		while (current != null) {
			Util.writeToFile((String) current.data, storingLocation);
			current = current.next;
		}
		System.out.println("File updated successfully...");
	}

	/**
	 * It takes the generic data as input and creates a new Node and checks if list
	 * is empty or not, if not empty then newNode to head and
	 * head points to newNode. After Successfully insertion length is incremented.
	 * returns boolean value.
	 */
	public boolean insertAtStart(G data) {
		Node<G> newNode = new Node<G>(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
		return true;
	}

	/**
	 * It takes the generic data inputed by user and creates a new Node and checks
	 * if list is empty or not, adds data at the End of Node or lastNode.
	 * data of generic Class type as input.
	 * return boolean value.
	 */
	public boolean insert(G data) {
		Node<G> newNode = new Node<G>(data);
		if (isEmpty()) {
			head = newNode;
		} else {
			Node<G> current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		length++;
		return true;
	}

	/**
	 * Accepts generic data type. NewNode object is created and traversed to get
	 * insertion position's next node address. Randomly created node's address
	 * points to position's next node address. previous points to the random node.
	 */
	
	public boolean insert(G data, int position) {
		Node<G> newNode = new Node<G>(data);
		// as this condition applies for insertion at beginning and zero position
		if (isEmpty() || position == 0) {
			insertAtStart(data);
			return true;
			// inserting at the position greater than length of the list and negative index
		} else if (position > length || position < 0) {
			System.out.println(
					"Insertion at position " + position + " is not possible..." + "\nlist length : " + length());
			return false;
			// inserting at the index position.
		} else {
			Node<G> current = head;
			/**
			 * Iterates till lastNode of given position
			 */
			for (int i = 0; i < position - 1; i++) {
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
			length++;
			return true;
		}
	}

	/**
	 * simply the head's next pointer is pointed to its next element and first node
	 * returns deleted node
	 */
	public G deleteFirst() {
		Node<G> current = head;
		if (isEmpty()) {
			throw new NoSuchElementException("\nEmpty List! Deletion not possible...");
		} else {
			head = head.next;
			length--;
			return current.data;
		}

	}

	/**
	 * Making second last node is points to null to delete the Last element.
	 *  After successfully deletion length is decremented
	 */
	public G delete() {
		Node<G> current = head;
		if (isEmpty()) {
			throw new NoSuchElementException("\nEmpty List! Deletion not possible...");
		} else if (length == 1) {
			head = null;
			length--;
			return current.data;
		} else {

			while (current.next.next != null) {
				current = current.next;
			}
			G removedData = current.next.data;
			current.next = null;
			length--;
			return removedData;
		}

	}

	/**
	 * 0 is the Starting index
	 * Traverse till the lastNode of given position
	 */
	
	public G delete(int position) {
		Node<G> current = head;
		// if deletion position is negative number and greater than list length.
		if (position < 0 || position >= length()) {
			throw new NoSuchElementException(
					"Deletion at position " + position + " is not possible..." + "\nlist length : " + length());
			// if position is last index.
		} else if (position == length - 1) {
			return delete();
			// if position is first index.
		} else if (position == 0) {
			return deleteFirst();
			// position is in required range.
		} else {
			Node<G> previous = null;
			for (int i = 0; i < position; i++) {
				previous = current;
				current = current.next;
			}
			G removedData = current.data;
			previous.next = current.next;
			length--;
			return removedData;
		}
	}

	/**
	 * Takes data of generic type as input and search the valid index position if
	 * found then delete the data based on index position.
	 * @param data of generic Class type as input.
	 */
	public void deleteData(G data) {
		if (getIndex(data) < 0) {
			System.out.println("Opps! Data not found...");
		} else {
			delete(getIndex(data));
		}
	}

	/**
	 * Takes data of generic type and iterate in the loop checks all data if found
	 * it returns boolean value.
	 * @param data of generic Class type as input.
	 * @return boolean value
	 */
	public boolean search(G data) {
		if (isEmpty()) {
			return false;
		} else {
			Node<G> current = head;
			while (current != null) {
				if (current.data.equals(data)) {
					return true;
				}
				current = current.next;
			}
		}
		return false;
	}

	/**if index position is found then it returns a positive index value 
	 * else returns negative value. 
	 * @param data of generic Class type as input.
	 * @return index Number as integer value.
	 */
	public int getIndex(G data) {
		if (isEmpty()) {
			return -1;
		} else {
			int dataIndexPosition = 0;
			Node<G> current = head;
			while (current != null) {
				if (current.data.equals(data)) {
					return dataIndexPosition;
				}
				dataIndexPosition++;
				current = current.next;
			}
		}
		return -1;
	}

	/**
	 * takes index position as input and returns generic type data of that index.
	 */
	public G getDataFromIndex(int index) {
		int counter = 0;
		G getData = null;
		if (isEmpty()) {
			throw new NoSuchElementException();
		} else {
			Node<G> current = head;
			while (current != null) {
				if (index == counter) {
					getData = current.data;
				}
				counter++;
				current = current.next;
			}
		}
		return getData;
	}

	/**
	 * takes data and index number as input parameter and set data at that index
	 * position. 
	 *  data  as generic type input
	 * index position as input parameter
	 */
	public void setDataFrom(G data, int index) {
		G dataFromIndex = getDataFromIndex(index);
		if (isEmpty()) {
			throw new NoSuchElementException();
		} else {
			Node<G> current = head;
			while (current.next != null) {
				if (dataFromIndex == current.data) {
					current.data = data;
				}
				current = current.next;
			}
		}
	}
}