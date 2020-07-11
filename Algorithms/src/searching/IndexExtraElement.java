package searching;

import java.util.Scanner;

//Done

public class IndexExtraElement {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int arr2[] = new int[n];
		
		System.out.println("Enter the array: ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Enter the second array: ");
		for (int i = 0; i < n-1; i++)
			arr2[i] = sc.nextInt();
		
		sc.close();
		
		for (int i = 0; i < n; i++) 
		{
			if(arr[i] != arr2[i]) 
			{
				System.out.println(i);
				break;
			}
			else if(arr[i] == arr2[i])
				continue;
		}
	}
}
