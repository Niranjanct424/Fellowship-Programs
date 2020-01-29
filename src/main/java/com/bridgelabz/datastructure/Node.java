package com.bridgelabz.datastructure;


/**
 * This class has a Generic class type variable and a reference type variable.
 *
 * @param <G> Generic type accepts any Class type
 */
public class Node<G> {
	protected Node<G> next;
	protected G data;

	/**
	 * constructor to initialize the class variables during object creation.
	 * 
	 * @param class type data is passed as a parameter to the constructor.
	 */

	public Node(G data) {
		this.data = data;
		this.next = null;
	}

	public G getData() {
		return data;
	}

}
