package array;

//Done

import java.util.Arrays;

public class MajorityElement 
{
	static int findElement(int arr[])
	{
		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i] == arr[j])
					count++;
				else
					count = 0;
			}
			
//			System.out.println(arr[i]+" "+count);
			
			if(count == arr.length/2+1)
				return(arr[i]);
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		int arr[] = {1,2,3};			
		System.out.println(findElement(arr));

	}
}
