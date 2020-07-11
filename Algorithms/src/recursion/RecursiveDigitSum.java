package recursion;

//Done

public class RecursiveDigitSum 
{
	static int sum(String str)
	{
		int add = 0;
		  
		  for (int i = 0; i < str.length(); i++) 
			  add += str.charAt(i) - '0';
		  
		  if(add / 10 == 0)
			  return add;
		 
		return sum(Integer.toString(add));
	}
	
	
	static int superDigit(String n, int k) 
	{
		StringBuffer sb = new StringBuffer(n);
		
		for (int i = 0; i < k - 1; i++)
			sb.append(n);
				
		return sum(sb.toString());
	}

	public static void main(String[] args) 
	{
		String n = "9875";
		int k = 4;
		
		System.out.println(superDigit(n,k));
	}
}
