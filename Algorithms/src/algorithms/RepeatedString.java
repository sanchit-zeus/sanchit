package algorithms;

//done

public class RepeatedString 
{
	static long repeatedString(String s, long n) 
	{
		long numA = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i) == 'a')
				numA ++;
		}
		
		long rec = (n / s.length());
		numA = rec * numA;
		
		long left = (n % s.length());
		
		for (long i = 0; i < left; i++) 
		{
			if(s.charAt((int) i) == 'a')
				numA++;
		}
		System.out.println(numA);
		return numA;
    }

	public static void main(String[] args) 
	{
		String s = "kmretasscityylpdhuwjirnqimlkcgxubxms"
				 + "xpypgzxtenweirknjtasxtvxemtwxuarabssvq"
				 + "dnktqadhyktagjxoanknhgilnm";
		long n = 736778906400L;
		
		repeatedString(s, n);
	}
}
