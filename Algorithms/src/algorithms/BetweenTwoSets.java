package algorithms;

//done

import java.util.ArrayList;

public class BetweenTwoSets 
{
	public static int gcd(int a, int b)
	{
		if(a == 0)
			return b;
		
		return gcd(b % a, a);
	}
	
	private static int lcm(int a, int b) 
	{
		return (a*b)/gcd(a, b);
	}
	
	public static int gcd (int input[])
	{
		int result = input[0];
		
		for (int i = 0; i < input.length; i++) 
			result = gcd(result, input[i]);
		
		return result;
	}
	
	public static int lcm(int input[])
	{
		int result = input[0];
		
		for (int i = 0; i < input.length; i++) 
			result  = lcm(result, input[i]);
		
		return result;
	}

	public static int getTotalX(ArrayList<Integer> a, ArrayList<Integer> b) 
	{
		int arr[] = new int[a.size()];
		
		for (int i = 0; i < a.size(); i++) 
			arr[i] = a.get(i);
		
		int arr2[] = new int[b.size()];
		
		for (int i = 0; i < b.size(); i++) 
			arr2[i] = b.get(i);
		
		int f = lcm(arr);
		int l = gcd(arr2);
		
		int count = 0;
		 
	    for(int i = f, j = 2; i <= l; i = f * j, j++)
	            if(l % i == 0)
	            	count++;
	    
	    System.out.println(count);
		
		return count;
	}

	public static void main(String[] args) 
	{		
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		a.add(2);
		a.add(4);
		b.add(16);
		b.add(32);
		b.add(96);
		
		getTotalX(a, b);
	}
}
