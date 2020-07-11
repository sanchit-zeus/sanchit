package searching;

//Done

public class IceCreamParlor 
{
	static int[] icecreamParlor(int m, int[] arr) 
	{
		int ans[] = new int[2];
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i + 1; j < arr.length; j++) 
			{
				if(arr[i] + arr[j] == m)
				{
					System.out.println((i)+" "+(j));
					arr[0] = i + 1;
					arr[1] = j + 1;
					return ans;
				}
				else break;
			}
		}
		return ans;
    }

	public static void main(String[] args) 
	{
		int arr[] = {2,2,4,3};
		int m = 4;
			
		icecreamParlor(m, arr);
	}
}
