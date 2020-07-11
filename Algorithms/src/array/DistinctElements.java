package array;
import java.util.Arrays;
import java.util.Scanner;

public class DistinctElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		
		System.out.println("Enter the window size: ");
		int k=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the array: ");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
			}
			
		int i,x,j,flag=0;
		int temp[]=new int[n];
		
		 for (i = 0; i < n-k+1; i++) {
			 x=i;
			 for (j = 0; j < k; j++) {
				 temp[j]=arr[x];
				 
				 flag=1;
				 Arrays.sort(arr);
				 for (int l = 0; l < k-1; l++) {
					if(temp[j]<temp[j+1])
						flag++;
				}
				}
			 System.out.println(flag);
			 } 
		 } 
	}
