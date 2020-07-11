package array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverseGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		
		System.out.println("Enter the seperating group number: ");
		int k=sc.nextInt();
		
		int temp[]=new int[k];
		int arr[]=new int[n];
		
		System.out.println("Enter array: ");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int l = 0; l < n; l+=k){
			for (int j = 0; j < k; j++) {
				temp[j]=arr[j];
				}
			Arrays.sort(temp);
			for (int i = temp.length-1; i >=0; i--) {
				System.out.println(temp[i]);
				}
			}		
		}
	}
