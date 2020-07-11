package algorithms;

//Done

import java.util.ArrayList;

public class ManasaAndStones 
{	
	static int[] stones(int n, int a, int b)
    {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int max = Math.max(a, b), min = Math.min(a, b), diff = max - min;
		int first = (n - 1)*min, last = (n - 1)*max;
		
		list.add(first);
		
		while(first < last)
		{
			first += diff;
			list.add(first);
		}

		int stones[] = new int[list.size()];
		
		for (int i = 0; i < stones.length; i++) 
			stones[i] = list.get(i);
		
		return stones;
    }
	
	public static void main(String[] args) 
	{
		int n = 4,a = 10,b = 100;
		
		stones(n, a, b);
	}
}
