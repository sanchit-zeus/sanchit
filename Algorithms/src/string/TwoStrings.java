package string;

//Done

public class TwoStrings 
{
	static String twoStrings(String s1, String s2) 
	{
		char ch1[] = new char[26];
		char ch2[] = new char[26];
		
		for (int i = 0; i < s1.length(); i++) 
			ch1[s1.charAt(i) - 97]++;
		
		for (int i = 0; i < s2.length(); i++) 
			ch2[s2.charAt(i) - 97]++;
		
		for (int i = 0; i < 26; i++) 
			if(ch1[i] != '0' && ch2[i] != '0' && 
			   ch1[i] >= 1   && ch2[i] >= 1)
				return "YES";
		
		return "NO";
    }

	public static void main(String[] args) 
	{
		String s1 = "beetroot";
		String s2 = "sandals";
		
		System.out.println(twoStrings(s1, s2));
	}
}
