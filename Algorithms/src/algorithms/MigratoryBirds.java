package algorithms;

//Done

import java.util.ArrayList;
import java.util.TreeMap;

public class MigratoryBirds 
{
	static int migratoryBirds(ArrayList<Integer> arr) 
    {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for (int i = 0; i < arr.size(); i++) 
		{
			if(map.containsKey(arr.get(i)))
				map.put(arr.get(i),map.get(arr.get(i)) + 1);				
			else
				map.put(arr.get(i),1);
		}
		
		System.out.println(map);
		return 0;
		
//		int ans = 0, freq = Integer.MIN_VALUE;
		
//		for(int i:map.keySet()) 
//		{
//			if(map.get(i) > freq)
//			{
//				ans = i;
//				freq = map.get(i);
//			}	
//		}
		
//		return ans;
    }

	public static void main(String[] args) 
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		arr.add(3);
		arr.add(4);
		
		System.out.println(migratoryBirds(arr));
	}
}
