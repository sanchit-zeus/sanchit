package sorting;

//Done

import java.util.ArrayList;

public class CountingSort2
{
	static int[] countingSort(int[] arr) 
	{
		int max = Integer.MIN_VALUE;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) 
			if(arr[i] > max)
				max = arr[i];
		
		int ret[] = new int[max + 1];
		
		for (int i = 0; i < arr.length; i++) 
			ret[arr[i]]++;
		
		for (int i = 0; i < ret.length; i++) 
			if(ret[i] != 0)
				for (int j = 0; j < ret[i]; j++) 
					list.add(i);		
		
		for (int i = 0; i < list.size(); i++) 
			arr[i] = list.get(i);
		
		return arr;
    }

	public static void main(String[] args) 
	{
		int arr[] = {1,1,3,2,1};
		
		countingSort(arr);
	}
}
