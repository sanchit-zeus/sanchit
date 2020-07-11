package array;

public class SubarraySum 
{
	static void sum(int n, int s, int arr[])
	{
		int i = 0, j = 0;
		int sum = 0;
		for (i = 0; i < arr.length; i++) 
		{
			sum = 0;
			for (j = i; j < arr.length; j++) 
			{
				sum = sum + arr[j];
			}
			System.out.println(sum);
			if(sum == s) 
			{
				System.out.println(i);
				System.out.println(j-1);
			}
		}
		
	}

	public static void main(String[] args) 
	{
		int n = 10;
		int s = 15;
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		sum(n,s,arr);
	}
}
