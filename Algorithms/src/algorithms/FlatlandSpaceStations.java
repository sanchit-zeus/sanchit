package algorithms;

//Done

import java.util.Arrays;

public class FlatlandSpaceStations
{
	static int flatlandSpaceStations(int n, int[] c) 
	{
		int arr[] = new int[n];
		
		Arrays.fill(arr,Integer.MAX_VALUE);
		
		 for(int i = 0; i < c.length; i++)
		 {
			 int x = c[i];
	         for(int j = 0; j < n; j++)
	         {
	        	 if(j == x)
	        		 arr[j]=0;
	             else if(arr[j] > Math.abs(j - x))
	                 arr[j] = Math.abs(j - x);
	            }
	        }
		 
		 Arrays.sort(arr);
		 	 
		return arr[n - 1];
	}

	public static void main(String[] args) 
	{
		int n = 5;
		int c[] = {0,4};
		
		System.out.println(flatlandSpaceStations(n, c));
	}
}
