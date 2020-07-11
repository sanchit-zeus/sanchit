package array;
import java.util.Arrays;
import java.util.Scanner;
  
//Done

public class ClosestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		
		int temp[]=new int[n];
		int temp2[]=new int[n];
		int arr[]=new int[n];

		System.out.println("Enter the sum: ");
		int sum=sc.nextInt();
		
		System.out.println("Enter the Array: ");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if(sum>arr[i]) {
				temp[i]=arr[i];
			}
			else
				temp2[i]=sum;
		}
		
		Arrays.sort(temp);
		Arrays.sort(temp2); 
		
		System.out.println("The closest element is: ");
		System.out.println(temp[n-1]);	
	}
}
