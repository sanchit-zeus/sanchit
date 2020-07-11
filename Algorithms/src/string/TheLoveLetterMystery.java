package string;

//done

public class TheLoveLetterMystery 
{
	static int theLoveLetterMystery(String s) 
	{	
		int change  = 0;
		int i = 0;
		int j = s.length() - 1;
		
		while(i <= j) 
		{
			int max = Math.max(s.charAt(i), s.charAt(j));
			int min = Math.min(s.charAt(i), s.charAt(j));		
			change += max - min;
			i++;
			j--;
		}
	
		return change;
    }

	public static void main(String[] args) 
	{
		String s = "cba";
				  //abc
		          //faehfab
			      //baahaab 
		
		theLoveLetterMystery(s);
	}
}