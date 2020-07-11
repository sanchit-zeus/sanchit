package array;
import java.util.Scanner;

//Done

public class ArrayLeaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int n=sc.nextInt();
		int a[]=new int[n+1];
		
		System.out.println("Enter the Array: ");
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		
		int temp=0;
		for (int i = 0; i < n; i++) {
			temp=a[i];
			for (int j = i+1; j < n; j++) {
			if(a[i]>=a[j])
				temp=a[i];
			else {
				temp=0;
				break;
				}
			}
			if(temp!=0)
				System.out.println(temp+" ");
			}
		}
	}
