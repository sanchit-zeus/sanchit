package string;

//Done

public class Strstr
{
	static int find(String s, String x)
	{
		int i = 0,j = 0;
		
		for (i = 0; i <= s.length() - x.length(); i++) 
		{
			for (j = 0; j < x.length(); j++) 
			{
//				System.out.println(s.charAt(i + j)+" "+x.charAt(j));

				if(s.charAt(i + j) != x.charAt(j))
					break;
			}
			
			if(j == x.length())
				return i;
		}
		
		return -1;
	}
	
	public static void main(String[] args) 
	{
		String s = "GeeksForGeeks";
		String x = "For";
		
		System.out.println(find(s,x));
	}
}
