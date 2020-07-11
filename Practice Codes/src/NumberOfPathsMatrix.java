//done

public class NumberOfPathsMatrix 
{
	int countPath(int m, int n)
	{
		if(n == 1 || m == 1)
			return 1;
		
		
		return countPath(m - 1, n)
			  +countPath(m, n - 1);	
	}
	
	public static void main(String[] args) 
	{
		int m = 2, n = 8;
		
		NumberOfPathsMatrix obj = new NumberOfPathsMatrix();
		System.out.println(obj.countPath(m, n));
	}
}
