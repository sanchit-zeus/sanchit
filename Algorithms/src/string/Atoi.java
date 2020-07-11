package string;

//Done

public class Atoi {
	
	static int convert(String str)
	{
		int n = 0;
		
		for (int i = 0; i < str.length(); i++) 
		{
			if((str.charAt(i) - '0') >= 10)
				return -1;
			else 
				n = n * 10 + str.charAt(i) - '0';
		}
		
		return n;
	}

	public static void main(String[] args) 
	{
		String str  = "1";
		String str2 = "21a";
		
		System.out.println(convert(str));
		System.out.println(convert(str2));
		
//		char y ='9';
//		int n = Character.getNumericValue(y);
//		System.out.println(n);
	}
}
