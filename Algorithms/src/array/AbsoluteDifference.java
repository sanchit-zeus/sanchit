package array;
import java.util.Scanner;

//Done

public class AbsoluteDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		
		System.out.println("Enter The Sum: ");
		int k=sc.nextInt();
		
		int arr[]=new int[n];
		int temp[]=new int[n];
		int div;
		int rem;
		System.out.println("Enter the array: ");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int j = 0; j < n; j++) {
			if(arr[j]<k)
				temp[j]=arr[j];
			else
				continue;
		}
		
		System.out.println("Numbers less than sum in the array: ");
		for (int l = 0; l < n; l++) {
			rem=temp[l]%10;
			div=temp[l]/10;
			if(rem-div==1||div-rem==1)
				System.out.println(div+""+rem);
		}
	}

}
