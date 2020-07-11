package array;
import java.util.Scanner;

//Done

public class ImmediateSmallElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		 
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		arr[n]=Integer.MAX_VALUE;
		
		for (int j = 0; j < n ; j++) {
			//System.out.print(arr[j]);
			if(arr[j]>arr[j+1])
				System.out.print(arr[j+1]+" ");
			else
				System.out.print("-1 ");
		}
	}
}

