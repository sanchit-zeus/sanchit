package sorting;

public class InsertionSortPart2 
{
	static void insertionSort2(int n, int[] arr) 
	{
		for(int k = 0;k < arr.length - 1; k++)
		{
	         for(int i = 0; i < arr.length - 1; i++)
	         {
	        	 int key = arr[k + 1];
	             if(i == k + 1)
	                 break;           
	             if(arr[i] > key)
	             {
	                 arr[k + 1] = arr[i];
	                 arr[i]=key;
	             }
	         }
	         for(int i=0;i<arr.length;i++)
	        	 System.out.print(arr[i]+" ");
	         System.out.println();
	     }
    }

	public static void main(String[] args) 
	{
		int n = 8;
		int arr[] = {8,7,6,5,4,3,2,1};
		
		insertionSort2(n, arr);	
	}
}
