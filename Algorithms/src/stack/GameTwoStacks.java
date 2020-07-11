package stack;

import java.util.Stack;

public class GameTwoStacks 
{
	
    static int twoStacks(int x, int[] a, int[] b) 
    {
    	Stack<Integer> st1 = new Stack<Integer>();
    	Stack<Integer> st2 = new Stack<Integer>();
    	
    	long sum1 = 0, sum2 = 0;
    	int count = 0;
    	for (int i = 0; i < a.length; i++) 
    	{
    		st1.push(a[i]);	
		}
    	for (int i = 0; i < b.length; i++) 
    	{
    		st2.push(b[i]);
		}
    	
    	while(sum1 < x && sum2 < x)
    	{
    		sum1 += st1.pop();
    		if(sum1 < x)
    			count++;
    		
    		sum2 += st2.pop();
    		if(sum2 < x)
    			count++;
    	}
    	return count;
    }
	
	public static void main(String args [])
	{
		int x = 10;
		int a[] = {1,6,4,2,4};
		int b[] = {5,8,1,2};
		
		System.out.println(twoStacks(x,a,b));
		
	}
}
