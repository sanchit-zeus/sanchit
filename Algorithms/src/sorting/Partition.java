package sorting;

//Done

public class Partition 
{
	static int[] quickSort(int[] arr) 
	{
		int []ret = new int [arr.length];
		int p = arr[0];
		int j = 0;
		
		for (int i = 0; i < arr.length; i++) 
			if(p > arr[i])
			{
				ret[j] = arr[i];
				j++;
			}
		
		ret[j] = p;
		j++;
		
		for (int i = 0; i < arr.length; i++) 
			if(p < arr[i])
			{
				ret[j] = arr[i];
				j++;
			}

		return ret;
    }
	
	public static void main(String[] args) 
	{
		int arr[] = {4,5,3,7,2};
		
		quickSort(arr);
	}
}
