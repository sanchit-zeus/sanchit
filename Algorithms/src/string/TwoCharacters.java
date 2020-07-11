package string;

import java.util.HashMap;

public class TwoCharacters 
{
	static int alternate(String s) 
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) 
		{
			System.out.println(s.charAt(i));
			if(map.containsKey(s.charAt(i)))
					map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			else
				map.put(s.charAt(i), 1);
		}
		
		System.out.println(map);
		
		return 0;
    }

	public static void main(String[] args) 
	{
		String s = "beabeefeab";
		
		alternate(s);
	}
}
