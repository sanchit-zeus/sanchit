package recursion;

public class Fibonacci 
{
	static int fib(int n)
	{
		if(n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}
	
	public static void main(String[] args) 
	{
		int n = 9;
		System.out.println(fib(n));
	}
}

//int a = 0, b = 1;
//int sum = a + b;
//
//System.out.println(a);
//System.out.println(b);
//
//for (int i = 0; i < n - 2; i++) 
//{
//	System.out.println(sum);
//	a = b;
//	b = sum;
//	sum = a + b;
//}
//System.out.println(sum);

