package array;
import java.util.Scanner;

public class TypeOfArray 
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the array: ");
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int i = 0;
		
		while (i < n-1 && arr[i] <= arr[i+1]) {
            i++; 
        if (i == n-1) 
            System.out.println("Ascending with maximum element = " +arr[n-1]);
		}
        
        if (i == 0) 
        { 
            while (i < n-1 && arr[i] >= arr[i+1]) { 
                i++;
            if (i == n - 1) 
                System.out.println("Descending with maximum element =  " + arr[0]);
            }
        }
        
        int i1,j1;
        int max=0;
        int min=Integer.MAX_VALUE;
        
        while(i<n) {
        	if(max<arr[i]) {
        		max=arr[i];
        		i1=i;
        	}
        	else if(min>arr[i]) {
        		min=arr[i];
            	j1=i;
        	}	
        }
        
        System.out.println(max+" "+min);
    }
}
