package com.bridgelabz.datastructure;


/**
 * stack implements LIFO
 * @author Niranjan
 *
 */
public class SimpleBalancedParentheses 
{
	Character[] stack = new Character[10000];
	int top = 0;
	
	/**
	 * push function add elements into top of the stack
	 * @param data
	 */
	public void push(Character data)
	{
		stack[top] = data;
		top++;
	}
	
	/**
	 * removes the element from from a stack
	 */
	
	public void pop()
	{
		top--;
		stack[top] = null;
	}
	
	/**
	 * This function displays the stack elements
	 */
	public void stack()
	{
		for(Character c: stack)
		{
			System.out.println(c);
		}
	}
	
	/**
	 * number of elements exist in the stack
	 */
	public void size()
	{
		System.out.println("size = "+top);
	}
	
	/**
	 * checks stack is empty or having elements
	 * @return true or false depends on list
	 */
	public boolean isEmpty()
	{
		return top<=0;
	}
	
	/**
	 * top of the element in the stack
	 * @return top element
	 */
	public Character peek()
	{
		return stack[top-1];
	}
	
	public static void simpleBalancedParentheses(String strr)
	{
		SimpleBalancedParentheses s = new SimpleBalancedParentheses();
		String str = strr;
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[' )
			{
				/**
				 * if match found push into the stack
				 */
				s.push(str.charAt(i));
			}
			else if(!s.isEmpty() && (str.charAt(i) == '}' && s.peek() == '{') ||
					 (str.charAt(i) == ')' && s.peek() == '(') ||
					 (str.charAt(i) == ']' && s.peek() == '['))
			        {  
					/**
					 * pop up if match found
					 */
				       s.pop();
			        }
			  else
			  {
						s.push(str.charAt(i));
			  }
		}
		/**
		 * if stack empty it's like balanced
		 */
		if(s.isEmpty())
		{
			System.out.println("Balanced Parentheses");
		}
		else
		{
			System.out.println("Not a Balanced Parentheses");
		}
		
	
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter Parentheses to Check is it Balanced or Not");
		String str = Util.inputString();
		simpleBalancedParentheses(str);
	}
	
}
