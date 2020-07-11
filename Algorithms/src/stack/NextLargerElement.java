package stack;

import java.util.Stack;

public class NextLargerElement 
{
	int n;
	Stack<Integer> s = new Stack<Integer>();

	NextLargerElement (int n, int arr[])
	{
		this.n = n;
		push(n,arr);
	}

	void push(int n, int arr[])
	{
		for (int i = 0; i < n; i++) 
		{
			s.push(arr[i]);
		}
	}
	
	void nextLarge()
	{
		for (int i = 0; i < n; i++) 
		{
			
		}
	}
	
	public static void main(String[] args) 
	{
		int n = 4;
		int arr[] = {1,2,3,4};
		
		NextLargerElement obj = new NextLargerElement(n,arr);
		
	}
}