package string;

import java.util.ArrayList;

//Done

public class FunnyString 
{
	static String funnyString(String s) 
	{
		ArrayList<Integer> original = new ArrayList<Integer>();
		ArrayList<Integer> reverse = new ArrayList<Integer>();
		
		String rev  = "";
		
		for (int i = s.length() - 1; i >= 0; i--) 
			rev += s.charAt(i);
		
		for (int i = 0; i < s.length() - 1; i++) 
			original.add(Math.abs((int)s.charAt(i) - (int)s.charAt(i + 1)));
		
		for (int i = 0; i < rev.length() - 1; i++) 
			reverse.add(Math.abs((int)rev.charAt(i) - (int)rev.charAt(i + 1)));
		
		return(original.equals(reverse)) ? "Funny":"Not Funny";
    }

	public static void main(String[] args) 
	{
		String s = "bcxz";
		
		System.out.println(funnyString(s));
	}
}
