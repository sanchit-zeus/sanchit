package recursion;

import java.util.Arrays;

public class SubsetSums 
{
	int count = 0;
	int n = 3;
	static int arr[] = {5,2,1};
	
	void sum(int ss)
	{
		System.out.println(ss);
		if(count < n) 
		{
			sum(ss + arr[count]);
			count++;
		}
	}
	
	public static void main(String[] args)
	{
		Arrays.sort(arr);
		
		SubsetSums obj = new SubsetSums();
		obj.sum(0);

	}
}
