package algorithms;

//Done

import java.util.TreeMap;

public class MinimumDistances 
{
	static int minimumDistances(int[] a) 
	{
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for (int i = 0; i < a.length - 1; i++) 
		for (int j = i + 1; j < a.length; j++) 
			if(a[i] == a[j])
				map.put(a[i],j - i);
		
		int dis = Integer.MAX_VALUE;
		
		for(int i:map.keySet())
		{
			if(map.get(i) < dis)
				dis = map.get(i);
		}
		
		if(map.isEmpty() == false)
			return dis;
		
		return -1;
    }

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,10};
		
		System.out.println(minimumDistances(a));
	}
}
