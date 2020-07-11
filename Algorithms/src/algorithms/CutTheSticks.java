package algorithms;

//Done

import java.util.ArrayList;
import java.util.Arrays;

public class CutTheSticks 
{
	static int minimum(int arr[])
	{
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i] < min && arr[i] != 0)
				min  = arr[i]; 
		}
		return min;
	}
	
	static int cut(int arr[])
	{
		int min = minimum(arr);
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i] != 0)
			{
				arr[i] -= min;
				count ++;
			}
		}
		return count;
	}
	
	static int[] cutTheSticks(int[] arr) 
	{
		ArrayList <Integer> list = new ArrayList<Integer>();
		Arrays.sort(arr);
		
		while(arr[arr.length - 1] != 0)
			list.add(cut(arr));
		
		int stick [] = new int[list.size()];
		
		for (int j = 0; j < stick.length; j++) 
			stick[j] = list.get(j);
	
		return stick;
    }

	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,3,3,2,1};
		
		cutTheSticks(arr);
	}
}
