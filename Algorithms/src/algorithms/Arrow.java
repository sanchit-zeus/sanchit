package algorithms;

import java.util.TreeMap;

public class Arrow 
{
	public static void color(int arr[])
	{
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i]) + 1);
			else
				map.put(arr[i], 1);
		}
		
		int sum = 0;
		for(int n: map.keySet())
		{
			sum += map.get(n)*map.get(n);
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {1,3,2,2,2,3,4,3,1};
		
		color(arr);
	}
}


	

