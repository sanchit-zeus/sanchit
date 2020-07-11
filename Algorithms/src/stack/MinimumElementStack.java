package stack;

import java.util.Stack;

public class MinimumElementStack 
{
	Stack<Integer> s = new Stack<Integer>();
	static int n = 100;
	static char st[] = new char [n];
	static int top = -1;
	
	int minimum()
	{
		int min = 100;
		
		for (int i = 0; i < top; i++) 
		{
			int a = (int) st[i];
			System.out.println(a);
			if(min > a)
				min = st[i];
		}
		return min;
	}
	
	void push(char data)
	{
		if(top < n) 
		{
			top++;
			st[top] = data;
		}
		else
			System.out.println("Stack Overflow");
	}
	
	char pop()
	{
		char remove = 0;
		if(top > -1)
		{
			remove = st[top];
			top--;
		}
		return remove;
	}
	
	void print()
	{
		for (int i = 0; i < top; i++) 
		{
			System.out.println(st[i]);
		}
	}
	
	void what(String str)
	{
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i) == '1')
			{
				push(str.charAt(i+1));
				i++;
			}
			else if(str.charAt(i) == '2')
			{
				System.out.println("Popped: "+pop());
			}
			else if(str.charAt(i) == '3')
			{
				System.out.println("Minimum: "+minimum());
			}
		}
	}
	
	public static void main(String[] args) 
	{
		String str = "121323113";
		
		MinimumElementStack obj = new MinimumElementStack();
		obj.what(str);
	}
}
