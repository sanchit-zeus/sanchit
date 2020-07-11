
//Done

public class PrintPattern 
{
	void pattern(int n, int m, boolean flag)
	{
		System.out.print(m+" ");
		
		if(flag == false && n == m)
			return;
		
		if(flag == true)
		{
			if(m - 5 > 0) 
				pattern(n, m - 5, true);
			else
				pattern(n, m - 5, false);
		}
		else
			pattern(n, m + 5, false);
		
	}
	
	public static void main(String args[])
	{
		int n = 16;
		PrintPattern obj = new PrintPattern();
		obj.pattern(n, n, true);
	}
}
