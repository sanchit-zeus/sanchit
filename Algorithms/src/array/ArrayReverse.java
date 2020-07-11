package array;
import java.util.Scanner;
 
//Done

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		
		System.out.println("Enter the array: ");
		for (int i = 1; i <= n; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Reversed Array: ");
		for (int j = n; j > 0; j--) {
			System.out.print(arr[j]+" ");
		}
	}
}
