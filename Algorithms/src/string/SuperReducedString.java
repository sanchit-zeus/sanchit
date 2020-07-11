package string;

//Done

public class SuperReducedString 
{
	static String superReducedString(String s) 
	{
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		
//		for (int i = 0; i < s.length(); i++) 
//		{
//			if(map.containsKey(s.charAt(i)))
//				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
//			else
//				map.put(s.charAt(i), 1);
//		}
//		
//		String str = "";
//		
//		for(char i:map.keySet())
//		{
//			if(map.get(i) % 2 != 0)
//				str = str + i;
//		}
//		
//		System.out.println(map);
//		
//		if(str.isEmpty())
//			return "Empty String";
//		else
//			return str;
		
		for (int i = 1; i < s.length(); i++) 
		{
			if(s.charAt(i) == s.charAt(i - 1))
			{
				 s = s.substring(0, i-1) + s.substring(i+1);
	                i = 0;
			}
		}
		
		if(s.isEmpty())
			return "Empty String";
		else
			return s;
		
    }

	public static void main(String[] args) 
	{
		String s = "tqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh";
		
		System.out.println(superReducedString(s));
	}
}
