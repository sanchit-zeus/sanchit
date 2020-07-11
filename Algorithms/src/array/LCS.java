package array;
import java.util.Scanner;

public class LCS 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of first array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the first array: ");
		for (int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextInt();
		}
		

		System.out.println("Enter the size of second array: ");
		int m = sc.nextInt();
		int arr2[] = new int[m];
		System.out.println("Enter the second array: ");
		for (int i = 0; i < m; i++) 
		{
			arr2[i] = sc.nextInt();
		}
	}
	
	public static int lcs( char[] X, char[] Y, int m, int n ) 
	  { 
		
	    int L[][] = new int[m+1][n+1]; 
	 
	    for (int i=0; i<=m; i++) 
	    { 
	      for (int j=0; j<=n; j++) 
	      { 
	        if (i == 0 || j == 0) 
	            L[i][j] = 0; 
	        else if (X[i-1] == Y[j-1]) 
	            L[i][j] = L[i-1][j-1] + 1; 
	        else
	            L[i][j] = Math.max(L[i-1][j], L[i][j-1]); 
	      } 
	    } 
	  return L[m][n]; 
	  }
}
