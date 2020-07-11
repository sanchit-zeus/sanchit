package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Done

public class Gemstones 
{
	static HashMap<Character, Integer> gem = new HashMap<Character, Integer>();
	
	static void countGemStones(String str)
	{	
		Set<Character> mineral = new HashSet<Character>();
		String temp = "";
		
		for (int i = 0; i < str.length(); i++) 
			mineral.add(str.charAt(i));
		
		Iterator<Character> value = mineral.iterator();
		
		while (value.hasNext())  
            temp += value.next(); 
				
		for (int i = 0; i < temp.length(); i++) 
		{
			if(gem.containsKey(temp.charAt(i)))
				gem.put((Character) temp.charAt(i), gem.get(temp.charAt(i)) + 1);
			else
				gem.put((Character) temp.charAt(i), 1);
		}
	}
	
	static int gemstones(String[] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
			countGemStones(arr[i]);
		
		int gemstones = 0;
		
		for(char i:gem.keySet())
			if(gem.get(i) == arr.length)
				gemstones++;
		
		return gemstones;
    }
	
	public static void main(String[] args) 
	{
		String arr[] = {"abcdde","baccd","eeabg"};
		gemstones(arr);
	}
}
