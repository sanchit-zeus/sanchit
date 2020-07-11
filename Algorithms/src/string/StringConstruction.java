package string;

import java.util.TreeMap;

//Done

public class StringConstruction 
{
	static int stringConstruction(String s) 
	{
		TreeMap<Character, Integer> str = new TreeMap <Character, Integer>();
 		
		for (int i = 0; i < s.length(); i++) 
		{
			if(str.containsKey(s.charAt(i)))
				str.put(s.charAt(i), str.get(s.charAt(i)) + 1);
			else
				str.put(s.charAt(i), 1);
		}
		
		int count = 0;
		for(char c:str.keySet())
		{
			if(str.get(c) == 1)
				count++;
			if(str.get(c) > 1) 
				count ++;
		}
		
		System.out.println(count);
		
		return count;
    }

	public static void main(String[] args) 
	{
		String s = "abcabcd";
		
		stringConstruction(s);
	}
}
