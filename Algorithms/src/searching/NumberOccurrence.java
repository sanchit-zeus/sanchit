package searching;

import java.util.Scanner;

//Done

public class NumberOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the array: ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter the Element: ");
		int x = sc.nextInt();
		
		int i,j=0;
		for (i = 0; i < n; i++) {
				if(x == arr[i])
					j++;
		}
		
		if(j==0)
			System.out.println("-1");
		else
			System.out.println(j);

	}

}
