package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

class HashMap<K,V>
{
	// A node of chains 
	K key;
	V value;
	
	//reference to the next node
	HashMap<K,V> next;

	//constructor
	public HashMap(K key, V value) 
	{
		super();
		this.key = key;
		this.value = value;
	}
	
}
public class Map<K,V>
{
	//bucket to store the array elements
	private LinkedList<HashMap<K,V>> linkedlist;
	//capacity of linked list
	private int capacity;
	//size of the linked list
	private int size;
	
	//constructor
	public Map() 
	{
		linkedlist = new LinkedList<HashMap<K,V>>();
		capacity = 11;
		size = 0;
		
		//created empty chains
		for(int i=0; i<capacity; i++)
		{
			linkedlist.add(null);
		}
	}
	
	public int size() 
	{ 
		return size; 
	} 
    public boolean isEmpty()
    { 
    	return size() == 0; 
    } 
    
    //hash function to find index
    private int getIndex(K key)
    {
    	int hashcode = key.hashCode();
    	int index = hashcode % capacity;
		return index;
    }
    


	public static void main(String[] args)
	{
		
	}

}
