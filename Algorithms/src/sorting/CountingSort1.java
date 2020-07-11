package sorting;

//Done

public class CountingSort1 
{
	static int[] countingSort(int[] arr) 
	{
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) 
			if(arr[i] > max)
				max = arr[i];
		
		int ret[] = new int[max + 1];
		
		for (int i = 0; i < arr.length; i++) 
			ret[arr[i]]++;
		
		return ret;
    }

	public static void main(String[] args) 
	{
		int arr[] = {1,1,1,2,3};
		
		countingSort(arr);
	}
}
