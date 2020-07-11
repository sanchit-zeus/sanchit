package array;
import java.util.Arrays;
import java.util.Scanner;

//Done

public class PendulumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		int temp[]=new int[n];
		System.out.println("Enter the array: ");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		int mid=0,count=0;
		mid=(n-1)/2;
		
		while(count<n) {
			if(count%2==0) {
				temp[mid-count]=arr[count];
				mid=mid-count;
			}
			else {
				temp[mid+count]=arr[count];
				mid=mid+count;
			}
			count++;			
		}

		for (int i = 0; i < n; i++) {
		System.out.print(temp[i]+" ");
		}
		}
	}
