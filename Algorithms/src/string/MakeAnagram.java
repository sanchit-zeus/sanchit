package string;

//Done

public class MakeAnagram 
{
	static int anagram(String s) 
	{
		int count = 0;
		
		if(s.length() % 2 != 0)
			return -1;
		
		String s1 = s.substring(0, s.length() / 2);
		String s2 = s.substring(s.length() / 2, s.length());
		
		char c1[] = s1.toCharArray();
		
		for(char c:c1)
		{
			int index = s2.indexOf(c);
			if(index == -1)
				count++;
			else
				s2 = s2.substring(0, index) + s2.substring(index + 1);
		}
		
		return count;
    }

	public static void main(String[] args) 
	{
		String s = "xaxbbbxx";
		
		System.out.println(anagram(s));
	}
}
