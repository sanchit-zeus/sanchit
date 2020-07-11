package algorithms;

//Done

public class AppendDelete
{
	static String appendAndDelete(String s, String t, int k) 
	{
		int common = 0;
		int diff = 0;
		int change = 0;
		int n = Math.min(s.length(),t.length());
		
		for (int i = 0; i < n; i++) 
		{
			if(s.charAt(i) == t.charAt(i))
				common++;
			else
				break;
		}
		
		diff = s.length() - common;
		change = t.length() - common;
		
		if(diff + change == k)
			return "Yes";
		else
			return "NO";
    }

	public static void main(String[] args) 
	{
		String s = "ashley";
		String t = "ash";
		int k = 2;
		
		System.out.println(appendAndDelete(s, t, k));
	}
}
