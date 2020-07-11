
public class Arrow 
{
	public void arrow(int n, int m)
	{
		int i = 0;
		
		while(n != 0)
		{
			n -= i;
			n += m;
			i++;
		}
		System.out.println(i);
	}
	
	public static void main(String args)
	{
		Arrow obj = new Arrow ();
		int n = 32;
		int m = 5;
		
		obj.arrow(n,m);
	}

}
