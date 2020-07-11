package algorithms;

//Done

import java.util.TreeMap;

public class DesignerPDF 
{
	static int designerPdfViewer(int[] h, String word) 
	{
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		
		for (int i = 0; i < word.length(); i++) 
		{
			for (int j = 0; j < alpha.length(); j++) 
			{
				if(word.charAt(i) == alpha.charAt(j)) 
					map.put(word.charAt(i), h[j]);
			}
		}
		
		int max = Integer.MIN_VALUE;
		for(char i:map.keySet()) 
		{
			if(map.get(i) > max)
				max = map.get(i);
		}
		
		return max*word.length();
	}

	public static void main(String[] args) 
	{
		int h[] = {1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7};
		String word = "zaba";
		
		System.out.println(designerPdfViewer(h, word));
	}
}
