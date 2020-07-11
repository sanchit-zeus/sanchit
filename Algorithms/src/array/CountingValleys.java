package array;

public class CountingValleys 
{
	static int countingValleys(int n, String s) 
    {
		int lvl = 0, v = 0;
		for (int i = 0; i < n; i++) 
		{
			
			if(s.charAt(i) == 'U')
				lvl += 1;
			else if(s.charAt(i) == 'D')
				lvl -= 1;
			
			System.out.println(lvl);
			if(lvl == 0 && s.charAt(i) == 'U')
				v++;
		}
		return v;
    }

	public static void main(String[] args) 
	{
		int n = 8;
		String s = "UDDDUDUU";
		
		System.out.println(countingValleys(n, s));

	}
}

//static int countingValleys(int n, String s) 
//{
//	  int sum = 0;
//	  int count = 0;
//	  for(int i = 0; i < n; i++)
//	  {
//	    if(s[i]=='U'){
//	      if(++sum==0)
//	        count++;
//	   }
//	    else sum--;
//	  }
//	  return count;
//}
