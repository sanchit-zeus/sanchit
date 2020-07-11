package algorithms;

//done

public class KaprekarNumbers 
{	
	static boolean kaprekar(long n)
	{
		long sqr = n * n;
		
		String str = String.valueOf(sqr);
		String left = str.substring(0, str.length() / 2);
		String right = str.substring(str.length() / 2);
		
		long numL = (left.isEmpty()) ? 0: Integer.parseInt(left);
		long numR = (right.isEmpty()) ? 0: Integer.parseInt(right);
				
		if(numL + numR == n)
			return true;
		else
			return false;
	}
	
	static void kaprekarNumbers(int p, int q) 
	{
		boolean flag = false;
		for (long i = p; i <= q; i++)
		{
			if(kaprekar(i)) 
			{
				flag = true;
				System.out.println(i+" ");
			}
		}
		if(!flag)
			System.out.println("INVALID RANGE");
    }

	public static void main(String[] args) 
	{
		int p = 1,q = 99999;
		
		kaprekarNumbers(p,q);
	}
}
