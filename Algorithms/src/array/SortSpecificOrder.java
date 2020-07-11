package array;
import java.util.Arrays;
import java.util.Scanner;

//Done

public class SortSpecificOrder
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		
		int e=0,o=0;
		int arr[]=new int[n];
		int even[]=new int[n];
		int odd[]=new int[n];
		
		
		System.out.println("Enter array: ");
		for (int i = 0; i < n; i++) 
		{
			arr[i]=sc.nextInt();
			if(arr[i]%2==0) 
			{
				even[e]=arr[i];
				e++;
			}
			else 
			{
				odd[o]=arr[i];
				o++;
			}
		}
		
		Arrays.sort(even);
		Arrays.sort(odd);

		for (int i = odd.length-1; i >= e; i--) {
			System.out.print(odd[i]+" ");
		}
		
		for (int i = n-e; i < n; i++) {
			System.out.print(even[i]+" ");
		}

	}

}
