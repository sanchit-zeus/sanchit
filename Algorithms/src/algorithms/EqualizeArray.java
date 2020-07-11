package algorithms;

//Done

import java.util.HashMap;

public class EqualizeArray 
{
	static int equalizeArray(int[] arr) 
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(map.containsKey(arr[i]))
				map.put(arr[i],map.get(arr[i]) + 1);
			else
				map.put(arr[i],1);
		}
		
		int min = Integer.MIN_VALUE;
		int key = 0;
		
		for(int i:map.keySet())
		{
			if(map.get(i) > min)
			{
				key = i;
				min = map.get(i);
			}
		}
		
		int remove = 0;
		for(int i:map.keySet())
		{
			if(i != key)
				remove += map.get(i);
		}
		
		return remove;
    }

	public static void main(String[] args) 
	{
		int arr[] = {3,3,2,1,3};
		
		System.out.println(equalizeArray(arr));
	}
}
