package string;

import java.util.Scanner;

//Done

public class ReversingVowels {
	
	static boolean isVowel(char c) 
	{ 
        return (c == 'a' || c == 'A' || c == 'e' || c == 'E' || 
        		c == 'i' || c == 'I' || c == 'o' || c == 'O' || 
        		c == 'u' || c == 'U'); 
    } 
	

	public static void main(String[] args)
	{
			
		Scanner src = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String str = src.nextLine();
		src.close();
		
		 int i = 0; 
		 int j = str.length()-1; 
		 char[] str1 = str.toCharArray(); 
		 
		 while(i < j) 
		 {
			 if(!isVowel(str1[i])) 
			 {
				 i++;
				 continue;
			 }
			 if(!isVowel(str1[j])) 
			 {
				 j--;
				 continue;
			 }
			 
			 if(isVowel(str1[i]) && isVowel(str1[i])) 
			 {
				 char t = str1[i];
				 str1[i] = str1[j];
				 str1[j] = t;
			 }
			 
			 i++;
			 j++;	
		 }

		 String str2 = String.copyValueOf(str1); 

		 System.out.println(str2);		 
	
	}
}
