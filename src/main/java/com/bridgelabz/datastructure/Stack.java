package com.bridgelabz.datastructure;

//stack implements LIFO
public class Stack 
{
	Character[] stack = new Character[12];
	int top = 0;
	
	//push function add elements into top of the stack
	public void push(Character data)
	{
		stack[top] = data;
		top++;
	}
	
	//removes the element from from a stack
	public void pop()
	{
		top--;
		stack[top] = null;
	}
	
	//This function displays the stack elements
	public void stack()
	{
		for(Character c: stack)
		{
			System.out.println(c);
		}
	}
	
	//number of elements exist in the stack
	public void size()
	{
		System.out.println("size = "+top);
	}
	
	//checks stack is empty or having elements
	public boolean isEmpty()
	{
		return top<=0;
	}
	
	//top of the element in the stack
	public Character peek()
	{
		return stack[top-1];
	}
	
	public static void main(String[] args) 
	{
		Stack s = new Stack();
		/*System.out.println(s.isEmpty());
		s.push('a');
		s.push('b');
		s.push('c');
		s.push('d');
		s.pop();
		System.out.println(s.isEmpty());
		s.size();
		s.stack();
		System.out.println("peek = "+s.peek());*/
		String str = "[{}]()}";
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[' )
			{
				//if match found push into the stack
				s.push(str.charAt(i));
			}
			else if(!s.isEmpty() && (str.charAt(i) == '}' && s.peek() == '{') ||
					 (str.charAt(i) == ')' && s.peek() == '(') ||
					 (str.charAt(i) == ']' && s.peek() == '['))
			        {  
					//pop up if match found
				       s.pop();
			        }
			  else
			  {
						s.push(str.charAt(i));
			  }
		}
		//if stack empty it's like balanced
		if(s.isEmpty())
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not balanced");
		}
		
	}
}
