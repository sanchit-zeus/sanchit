package algorithms;

public class SherlockSquares 
{
	static int squares(int a, int b) 
	{
		int count = 0;
		double sr = Math.floor(Math.sqrt(a));
		double sr2 = Math.floor(Math.sqrt(b - 1));
		 
		count = (int) (sr2 - sr);
		System.out.println(count);
			
		return count;
    }

	public static void main(String[] args) 
	{
		int a = 11, b = 101;
		squares(a, b);
	}
}
