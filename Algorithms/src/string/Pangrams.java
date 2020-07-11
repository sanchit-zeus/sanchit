package string;

//Done

import java.util.HashSet;
import java.util.Set;

public class Pangrams 
{
	static String pangrams(String s) 
	{
		Set<Character> set = new HashSet<Character>(); 
		String str = s.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) 
			if(str.charAt(i) != ' ')
				set.add(str.charAt(i));
		
		System.out.println(set);
		
		return (set.size() == 26 ? "pangram":"not pangram");
    }

	public static void main(String[] args) 
	{
		String s = "We promptly judged antique ivory buckles for the prize"; 
		
		System.out.println(pangrams(s));
	}
}
