package array;

//Done

public class LeftArrayRotation 
{
	void rotation(int size, int r, int arr[])
	{
		for (int j = 0; j < r; j++) 
		{
			int i;
			int temp = arr[0];
		
			for (i = 0; i < size - 1; i++) 
			{
				arr[i] = arr[i + 1];
			}
			arr[i] = temp;
		}
		
		print(arr, size);
	}
	
	void print(int arr[], int size)
	{
		for (int i = 0; i < size; i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args)
	{
		int size = 5;
		int r = 4;
		int arr[] = {1,2,3,4,5};
		
		LeftArrayRotation obj = new LeftArrayRotation();
		obj.rotation(size, r, arr);
	}
}
