package string;

import java.util.Scanner;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner src = new Scanner(System.in);
		
		System.out.println("Enter the string size M: ");
		int m = src.nextInt();
		
		System.out.println("Enter the string size N: ");
		int n = src.nextInt();
		
		System.out.println("Enter the string X: ");
		String x = src.nextLine();
		
		System.out.println("Enter the string Y: ");
		String y = src.nextLine();
		src.close();
		
		
		char str1[] = x.toCharArray();
		char str2[] = y.toCharArray();
		
		for (int i = 0; i < str1.length; i++) 
		{
			for (int j = 0; j < str2.length; j++) 
			{
				if(str1[i]==str2[j])
					for (int j2 = i; j2 < j; j2++) {
						System.out.println(str1[j]);
					}	
			}
		}
	}
}
