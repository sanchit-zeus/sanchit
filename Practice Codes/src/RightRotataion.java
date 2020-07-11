import java.util.Scanner;

public class RightRotataion 
{
	static final Scanner src = new Scanner(System.in); 
	
	public static void main(String args[])
	{
		int n = src.nextInt();
		int k = src.nextInt();
		int q = src.nextInt();
		
		int arr[] = new int[n + 2];
		
		for (int i = 0; i < n; i++) 
		{
			arr[i] = src.nextInt();
		}
		
		int m[] = new int[n];
		
		for (int i = 0; i < q; i++) 
		{
			m[i] = src.nextInt();
		}

		for (int j = 0; j < k; j++) 
		{
			int temp = 0;
			for (int i = 0; i < n; i++) 
			{
				temp       = arr[i+1];
				arr[i + 1] = arr[i];
				arr[i]     = temp;
				temp       = arr[i + 2];
				arr[i + 2] = arr[i];
				arr[i]     = temp;
			}
		}
		
		for (int i = 0; i < n; i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
