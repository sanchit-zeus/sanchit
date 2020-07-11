package string;

//Done

public class LongestPalindrome 
{
	static String palindrome(String str)
	{
		char c[] = str.toCharArray();
		int max = 0;
		String str2 = "";
		
		for (int i = 0; i <= c.length; i++) 
		{
			for (int j = i + 1; j <= c.length; j++)
			{
				String st  = "";
				String st2 = "";
				
				st = str.substring(i,j);
				int n = st.length();
				
				for (int k = st.length() - 1; k >= 0; k--) 
				{
					st2 = st2 + st.charAt(k);
				}
				
				if(st.equals(st2) && st.length() != 1 && max < n)
				{
					str2 = st;
					max = n;
				}
			}
		}
		return(str2);
	}
	
	public static void main(String[] args) 
	{
		String str  = "AAAABBAA";
		
		System.out.println(palindrome(str));
	}	
}