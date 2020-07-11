package sorting;

import java.util.ArrayList;
import java.util.Arrays;

//Done

public class ClosestNumbers 
{
	static int[] closestNumbers(int[] arr) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length - 1; i++)
		{
			if(Math.abs(arr[i + 1] - arr[i]) < min)
				min = Math.abs(arr[i + 1] - arr[i]);
		}
		
		for (int i = 0; i < arr.length - 1; i++)
		{
			if(Math.abs(arr[i + 1] - arr[i]) == min)
			{
				list.add(arr[i]);
				list.add(arr[i+1]);
			}
		}
			
		int ret[] = new int[list.size()];
		
		for (int i = 0; i < ret.length; i++) 
			ret[i] = list.get(i);
		
		return ret;
	}
	
	public static void main(String[] args) 
	{
		int arr[] = {-20,-3916237,-357920,-3620601,7374819,-7330761,30,6246457,-6461594,266854};
		
		closestNumbers(arr);
	}
}
