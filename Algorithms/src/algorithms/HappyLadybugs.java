package algorithms;

//Done

import java.util.TreeMap;

public class HappyLadybugs 
{
	static String happyLadybugs(String b) 
	{
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		
		for (int i = 0; i < b.length(); i++)
		{
			if(map.containsKey(b.charAt(i)))
				map.put(b.charAt(i),map.get(b.charAt(i)) + 1);
			else
				map.put(b.charAt(i),1);
		}
				
		for(char i:map.keySet())
		{	
			if(i != '_' && map.get(i) == 1)
				return "NO";
			
			if(!map.containsKey('_'))
			{
				for (int j = 1; j < b.length() - 1; j++) 
				{
					if(b.charAt(j) != b.charAt(j + 1) && 
					   b.charAt(j) != b.charAt(j - 1))
						return "NO";
				}
			}
		}
		
		return "YES";
    }

	public static void main(String[] args) 
	{
		String b = "AABBC";
		
		System.out.println(happyLadybugs(b));
	}
}
