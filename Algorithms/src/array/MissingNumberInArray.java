package array;

//Done

public class MissingNumberInArray 
{
	static void misingNumber(int arr[], int n)
	{
		if(arr.length == n)
		{
			System.out.println("Array Full");
		}
		else
		{
			for (int i = 0; i < arr.length+1; i++) 
			{
				if(arr[i+1] != arr[i]+1) 
				{
					System.out.println(arr[i]+1);
					break;
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		int n = 5;
		int arr[] = {1,2,3,5};
		
		misingNumber(arr,n);
	}
}
