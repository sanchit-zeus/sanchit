package string;

import java.util.Scanner;

//Done

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String rev = "";
		
		Scanner src = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String str = src.nextLine();
		src.close();
		
		int length = str.length();
		
		for (int i = length-1; i >= 0; i--) 
			rev = rev + str.charAt(i);
				
		if(str.equals(rev))
			System.out.println("Yes");
		else
			System.out.println("No");
		
		

		
	}

}
