package com.bridgelabz.datastructure;

public class NumberofBST  
{  
    /**
     * factorial() will calculate the factorial of given number  
     * @param num
     * @return integer
     */
    public int factorial(int num) 
    {  
        int fact = 1;  
        if(num == 0)  
            return 1;  
        else 
        {  
            while(num > 1) 
            {  
                fact = fact * num;  
                num--;  
            }  
            return fact;  
        }  
    }  
      
    /**
     * numOfBST() will calculate the total number of possible BST by calculating Catalan Number for given key  
     * @param key
     * @return
     */
    public int numOfBST(int key) 
    {  
        int catalanNumber = factorial(2 * key)/(factorial(key + 1) * factorial(key));  
        return catalanNumber;  
    }  
      
    public static void main(String[] args) {  
          
    	NumberofBST  bt = new NumberofBST();  
    	 /**
         * 
         * Display total number of possible binary search tree with key 5  
         */
        System.out.println(bt.numOfBST(5)+"Total number of possible Binary Search Trees with given key: 5 => ");  
      }  
}  
