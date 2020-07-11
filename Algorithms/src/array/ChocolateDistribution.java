package array;
import java.util.Arrays;
import java.util.Scanner;

//Done

public class ChocolateDistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of packets: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the number of packets: ");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number of students: ");
		int s=sc.nextInt();
		
		Arrays.sort(arr);
		
		int min_diff=Integer.MAX_VALUE;
		int first=0, last=0;
		for (int i = 0; i+s-1 < n; i++) {
			int diff = arr[i+s-1] - arr[i];
			if(diff < min_diff) {
				min_diff = diff;
				first = i;
				last = i + s - 1;
			}
		}
		
		System.out.println(arr[last]-arr[first]);
		
		
		
		

	}

}
