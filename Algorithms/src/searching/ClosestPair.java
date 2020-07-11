package searching;

import java.util.*;

//Done

public class ClosestPair 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the first array: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the size of the second array: ");
		int m = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the first array: ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int arr2[] = new int[n];
		System.out.println("Enter the second array: ");
		for (int i = 0; i < m; i++)
			arr2[i] = sc.nextInt();
		
		System.out.println("Enter the value of X: ");
		int x=sc.nextInt();
		
		int i, j, i1 = 0, j1 = 0, temp = 0, min = Integer.MAX_VALUE;;
		for (i = 0; i < n; i++) 
		{
			for (j = 0; j < m; j++) 
			{				
				if( (arr[i] + arr2[j]) >= x)
					temp = ( arr[i] + arr2[j] ) - x;
				
				else if( (arr [i] + arr2[j] ) <= x )
					temp = x - ( arr[i] + arr2 [j] );
				
				if (temp < min) 
				{
					min=temp;
					i1 = i;
					j1 = j;
				}
			}
		}
		
		System.out.println(arr[i1]+" "+arr2[j1]);
		
	}
}
