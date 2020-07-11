package string;

//Done

public class AlternatingCharacters 
{
	static int alternatingCharacters(String s) 
	{
		int count = 0;
		
		for (int i = 0; i < s.length() - 1; i++) 
			if(s.charAt(i) == s.charAt(i + 1))
				count++;
		
		System.out.println(count);
		return count;
    }

	public static void main(String[] args) 
	{
		String s = "AAABBB";
		
		alternatingCharacters(s);
	}
}
