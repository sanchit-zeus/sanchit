package algorithms;

//Done

public class CamelCase 
{
	static int camelcase(String s) 
	{
		String capLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		boolean flag = false;
		int word = 0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = 0; j < capLetter.length(); j++) 
			{
				if(s.charAt(i) == capLetter.charAt(j) && flag == false)
				{
					word++;
					flag = true;					
				}
				else if(s.charAt(i) == capLetter.charAt(j) && flag == true)
				{
					word++;
					flag = false;
				}
			}
		}
		System.out.println(word+1);
		
		return word+1;
	}


	public static void main(String[] args) 
	{
		String str = "saveChangesInTheEditor";
		String str2 = "oneTwoThree";
		
		camelcase(str);
		camelcase(str2);
	}
}
