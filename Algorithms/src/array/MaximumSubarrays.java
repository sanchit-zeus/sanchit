package array;
import java.util.Scanner;

public class MaximumSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		
		int temp[]=new int[n];
		int max=0;
		
		System.out.println("Enter the size of sub-array: ");
		int k=sc.nextInt();
		
		System.out.println("Enter the array: ");
		int arr[]=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int temp2=(n/k)+1;
		for (int i = 0; i < temp2; i++) {
			max=arr[i+k];
			for (int j = i+1; j+k-1 < n; j++) {
				if(max<arr[j+k-1]) {
					max=arr[j+k-1];
				}	
			}
			System.out.println(max);
		}	
	}
}
