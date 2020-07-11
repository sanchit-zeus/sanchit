package searching;

import java.util.Scanner;

//Done

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the array: ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			if(i == 0) 
			{
				if(arr[i]>arr[i+1])
				{
					System.out.println("1");
					break;
				}
				else
					continue;
			}
			
			else if(i==n-1) 
			{
				if(arr[i]>arr[i-1])
				{
					System.out.println("1");
					break;
				}
				else
					continue;
			}
			
			else
				if(arr[i]>arr[i+1] && arr[i]>arr[i-1]) 
				{
					System.out.println("1");
					break;
				}
					
				else
					continue;
		}
	}
}
