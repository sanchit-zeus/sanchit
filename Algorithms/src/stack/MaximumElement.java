package stack;

//done

import java.util.Scanner;

public class MaximumElement 
{
	static Scanner src = new Scanner(System.in);
	static long stack[] = new long[1000];
	static int top = -1;

	void push()
	{
		top++;
		long data = src.nextLong();
		stack[top] = data;
	}
	
	void pop()
	{
		if(top != -1)
		{
			stack[top] = 0;
			top--;	
		}
	}
	
	long maximumElement()
	{
		long count = 0;
		for (int i = 0; i <= top; i++) 
		{
			if(stack[i] > count)
			{
				count = stack[i];
			}
		}
		return count;
	}
	
	public static void main(String[] args) 
	{
		MaximumElement obj = new MaximumElement();
		
		int n = src.nextInt();
		
		for (int i = 0; i < n; i++) 
		{
			int inp = src.nextInt();
			if(inp == 1)
			{
				obj.push();
			}
			else if(inp == 2)
			{
				obj.pop();
			}
			else if(inp ==3)
			{
				System.out.println(obj.maximumElement());
			}
		}
	}
}
