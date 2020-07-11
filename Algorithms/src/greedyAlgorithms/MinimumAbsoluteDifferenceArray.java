package greedyAlgorithms;

//Done

import java.util.Arrays;

public class MinimumAbsoluteDifferenceArray
{
	static int minimumAbsoluteDifference(int[] arr) 
	{
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length - 1; i++) 
			if(min > Math.abs(arr[i] - arr[i + 1]))
				min = Math.abs(arr[i] - arr[i + 1]);
		
		return min;
    }

	public static void main(String[] args) 
	{
		int arr [] = {-59,-36,-13,1,-53,-92,-2,-96,-54,75};
		
		minimumAbsoluteDifference(arr);
	}
}
