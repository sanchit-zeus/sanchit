package recursion;

//Done

public class Factorial 
{
	public static int fact(int n)
	{
		int fact = 1;
		
		for (int i = 1; i <= n; i++) 
		{
			fact = fact * i;
		}
		
		System.out.println(fact);

		return 0;
	}

	public static void main(String[] args) 
	{
		int n = 5;
		
		fact(n);
	}
}
