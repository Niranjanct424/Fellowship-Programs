package com.bridgelabz.datastructure;

//Java program to demonstrate implementation of our 
//own hash table with chaining for collision detection 
import java.util.ArrayList; 

//A node of chains 
class HashNode<K, V> 
{ 
	K key; 
	V value; 

 // Reference to next node 
 HashNode<K, V> next; 

 // Constructor 
 	public HashNode(K key, V value) 
 	{ 
 		this.key = key; 
 		this.value = value; 
 	} 
} 

//Class to represent entire hash table 
class HashingSearchNumberInSlot<K, V> 
{ 
 // bucketArray is used to store array of chains 
	private ArrayList<HashNode<K, V>> bucketArray; 

 // Current capacity of array list 
	private int numBuckets; 

 // Current size of array list 
	private int size; 

 // Constructor (Initializes capacity, size and 
 // empty chains. 
	public HashingSearchNumberInSlot() 
 { 
     bucketArray = new ArrayList<>(); 
     numBuckets = 10; 
     size = 0; 

     // Create empty chains 
     for (int i = 0; i < numBuckets; i++) 
         bucketArray.add(null); 
 } 

 public int size()
 {
 	{ 
	 	return size; 
	} 
 }
 public boolean isEmpty() 
 { 
	 return size() == 0; 
 } 
 

 // This implements hash function to find index 
 // for a key 
 private int getBucketIndex(K key) 
 { 
     int hashCode = key.hashCode(); 
     int index = hashCode % numBuckets; 
     return index; 
 } 

 // Adds a key value pair to hash 
 public void add(K key, V value) 
 { 
     // Find head of chain for given key 
     int bucketIndex = getBucketIndex(key); 
     HashNode<K, V> head = bucketArray.get(bucketIndex); 

     // Check if key is already present 
     while (head != null) 
     { 
         if (head.key.equals(key)) 
         { 
             head.value = value; 
             return; 
         } 
         head = head.next; 
     } 

     // Insert key in chain 
     size++; 
     head = bucketArray.get(bucketIndex); 
     HashNode<K, V> newNode = new HashNode<K, V>(key, value); 
     newNode.next = head; 
     bucketArray.set(bucketIndex, newNode); 

     // If load factor goes beyond threshold, then 
     // double hash table size 
     if ((1.0*size)/numBuckets >= 0.7) 
     { 
         ArrayList<HashNode<K, V>> temp = bucketArray; 
         bucketArray = new ArrayList<>(); 
         numBuckets = 2 * numBuckets; 
         size = 0; 
         for (int i = 0; i < numBuckets; i++) 
             bucketArray.add(null); 

         for (HashNode<K, V> headNode : temp) 
         { 
             while (headNode != null) 
             { 
                 add(headNode.key, headNode.value); 
                 headNode = headNode.next; 
             } 
         } 
     } 
 }
 public static void main(String[] args) 
 { 
     HashingSearchNumberInSlot<String, Integer>map = new HashingSearchNumberInSlot<>(); 
     map.add("this",1 ); 
     map.add("coder",2 ); 
     map.add("hi",4 ); 
     map.add("hi",4 ); 
     map.add("joy",5 ); 
     map.add("1",2 ); 
     map.add("1",2 ); 
     System.out.println("Size = "+map.size()); 
     System.out.println("isEmpty = "+map.isEmpty()); 
     System.out.println(map.getBucketIndex("this"));
     System.out.println(map.getBucketIndex("coder"));
     System.out.println(map.getBucketIndex("joy"));
     System.out.println(map.getBucketIndex("hoi"));
     System.out.println(map.getBucketIndex("hi"));
     System.out.println(map.getBucketIndex("1"));
     System.out.println(map.getBucketIndex("1"));
 }
 }
