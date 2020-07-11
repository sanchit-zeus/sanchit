package string;

import java.util.Arrays;

//Done

public class AnagramOfString 
{
	
	static void Anagram(String str, String str2)
	{
		int n1 = str.length();
		int n2 = str2.length();
		
		char []c1 = str.toCharArray();
		char []c2 = str2.toCharArray();
		
		if(n1 != n2)
			System.out.println("No");
		else
		{
			Arrays.sort(c1);
			Arrays.sort(c2);

			for (int i = 0; i < n1; ) 
			{
				if(c1[i] != c2[i]) 
				{
					System.out.println("No");
					break;
				}
				else
				{
					System.out.println("Yes");
					break;
				}
			}	
		}
	}

	public static void main(String[] args) 
	{	
		String str = "geeksforgeeks";
		String str2 = "forgeeksgeeks";
		
		Anagram(str,str2);
	}
}
