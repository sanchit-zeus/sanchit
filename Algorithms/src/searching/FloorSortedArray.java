package searching;

import java.util.Arrays;
import java.util.Scanner;

//Done

public class FloorSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the array: ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter the key: ");
		int k = sc.nextInt();
		
		int temp[]=new int[n];
		int j=0;
		for (int i = 0; i < n; i++) 
		{
			if(arr[i] <= k) 
			{
				temp[i] = arr[i];
				j=i;
			}
			else
				continue;	
		}
		
		Arrays.sort(temp);
		
		if(j!=0)
			System.out.println(temp[n-1]+" at "+j);
		else
			System.out.println("-1");

	}
}
