package array;
import java.util.Scanner;

//Done

public class EquilibriumPoint 
{
	public static void main(String[] args) 
	{		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for (int i = 0; i < n; i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		int rightsum=0, leftsum=0;
		for (int i = 0; i < n; i++) 
		{	
			leftsum=0;
			for (int j = 0; j < i; j++) 
			{
			leftsum=leftsum+arr[j];
			}
			
			rightsum=0;
			for (int j = i+1; j < n; j++) 
			{
				rightsum=rightsum+arr[j];
			}
			
			if (leftsum==rightsum)
				System.out.println("The Equilibrium point is: "+i);
		}
	}
}
