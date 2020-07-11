package string;

//done

import java.util.Arrays;

public class ReoccuringCharacters 
{
	static String count(String str)
	{
		int count = 0;
		char[] c = str.toCharArray();
		Arrays.sort(c);
		String a = "";
		
		for (int i = 0; i < c.length; i = i + count) 
		{
			count = 0;
			for (int j = i; j < c.length; j++) 
			{
				if(c[i] == c[j])
					count++;
			}
			a = a + c[i] + count;
		}
		return a;
	}

	public static void main(String[] args) 
	{
		String str = "bbddbbacca";
		System.out.println(count(str));
	}
}
