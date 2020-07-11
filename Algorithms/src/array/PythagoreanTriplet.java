package array;
import java.util.Scanner;

//DONE

public class PythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the array: ");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		int temp=0;
		int flag=0;
		for (int i = 0; i < n; i++) 
		{ 
	        for (int j = i + 1; j < n; j++) 
	        { 
	            for (int k = j + 1; k < n; k++) 
	            {     
	                int x = arr[i] * arr[i], y = arr[j] * arr[j], z = arr[k] * arr[k]; 
	  
	                if (x == y + z || y == x + z || z == x + y) 
	                	flag++;
	                else
	        			break;
	            } 
	        } 
	    }
		
		if(flag >= 1) 
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}