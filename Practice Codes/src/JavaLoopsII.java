
public class JavaLoopsII
{
	static void sum(int a, int b, int n)
	{
		int sum = a;
		
		for (int i = 0; i < n; i++) 
		{
			sum += (int) Math.pow(2,i) * b;
			System.out.print(sum+" ");
		}
	}

	public static void main(String[] args) 
	{
		int a = 0, b = 2, n = 10;
		
		sum(a,b,n);
	}
}
