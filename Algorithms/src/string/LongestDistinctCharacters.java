package string;

//Done

public class LongestDistinctCharacters 
{
	static void distinctCharacters(String str)
	{
		char c[] = str.toCharArray();
	    int index = 0;
		
		for (int i = 0; i < c.length; i++) 
		{
			int j;
			for (j = 0; j < i; j++) 
			{
				if(c[i] == c[j])
				{
					break;
				}
			}
			if(j == i)
			{
				index++;
			}
		}
		System.out.print(index);
	}

	public static void main(String[] args) 
	{
		//abca
		String str = "geeksforgeeks";
		distinctCharacters(str);
	}
}
