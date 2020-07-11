package searching;

import java.util.Scanner;

public class SuperPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int temp[]=new int[n];

		
		 for(i=2;i<=n;i++)
		 {
			 for(j=2;j<i;j++)
			 {
				 if(i%j==0)
					 break;
			 }
			 
			 if(i==j) 
				 temp[i]=i;
         }
//		 
//		 for (int k = 0; k < n; k++) {
//			 System.out.print(temp[k]);
//		 }
//		 System.out.println(" ");
		 
		 int add = 0;
		 for (int k = 0; k < n; k++)
		 {
			
			 if(temp[k]!=0) 
			 {
				 add = temp[k]+2;
//				 System.out.print(add);
				 
				 
				 
				 for(i=2;i<=add/2;i++) 
				 {
					 if((add%i!=0) && (add<=temp[n-1]) ) 
					 {
						 System.out.println(add);
						 break;
					 }
				 }
			 }
		 }
	}
}
