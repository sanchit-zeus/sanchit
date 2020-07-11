package algorithms;

//Done

public class BeautifulTriplets 
{
	static int beautifulTriplets(int d, int[] arr) 
	{
		int count = 0;
		
		for (int i = 0; i < arr.length; i++)
		for (int j = i + 1; j < arr.length; j++)
			if(arr[j] - arr[i] == d)
				for (int k = j + 1; k < arr.length; k++) 
					if(arr[k] - arr[j] == d)
							count ++;
		
		return (count);
    }

	public static void main(String[] args) 
	{
		int arr[] = {1,2,4,5,7,8,10}, d = 3;
		
		System.out.println(beautifulTriplets(d, arr));
	}
}
