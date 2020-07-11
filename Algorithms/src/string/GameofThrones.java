package string;

import java.util.HashMap;

//Done

public class GameofThrones 
{
	static String gameOfThrones(String s) 
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) 
		{
			if(map.containsKey(s.charAt(i)))
				map.put(s.charAt(i),map.get(s.charAt(i)) + 1);
			else
				map.put(s.charAt(i), 1);
		}
		
		if(s.length() % 2 == 0)
		{
			for(char c:map.keySet())
				if(map.get(c) % 2 != 0)
					return "No";
			return "Yes";
		}
		
		else 
		{
			int odd = 0;
			for(char c:map.keySet())
				if(map.get(c) % 2 == 0)
					odd++;
			if(odd > 1)
				return "No";
			else
				return "Yes";
		}
    }

	public static void main(String[] args) 
	{
		String s = "cdcdcdcdeeeef";
		
		System.out.println(gameOfThrones(s));
	}
}
