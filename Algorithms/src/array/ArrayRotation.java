package array;
import java.util.Scanner;

//Done

public class ArrayRotation 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int n = sc.nextInt();
		int a[] = new int[n + 1];
		int temp[] = new int[n + 1];
		
		System.out.println("Enter the Array: ");
		for (int i = 0; i < n; i++) 
		{
			a[i] = sc.nextInt();
			temp[i] = a[i];
		}
		
		System.out.println("Enter the rotation number:");
		int m = sc.nextInt();
			
		for (int k = 0; k < m; k++) 
		{
			for (int j = 0; j < n; j++) 
			{
				a[j] = a[j + 1];
			}
			a[n - 1] = temp[k];
		}
			
		System.out.println("The rotated array is: ");
			for (int i = 0; i < n; i++) 
			{
				System.out.print(" "+a[i]);
			}
	}
}
