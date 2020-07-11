package algorithms;

//Done

public class DrawingBook 
{
	static int pageCount(int n, int p) 
	{
		int total = n/2;
		int right = p/2;
		int left = total - right;
		
		if(left < right)
			return left;
		else
			return right;		
    }

	public static void main(String[] args) 
	{
		int n = 6; 
		int p = 2;
		
		System.out.println(pageCount(n, p));
	}
}
