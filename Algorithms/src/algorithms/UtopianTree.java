package algorithms;

//Done

public class UtopianTree 
{
	static int utopianTree(int n) 
	{
		int height = 1;
		
		for (int i = 0; i < n; i++) 
		{
			if(i % 2 == 0)
				height *= 2;
			else
				height += 1;
		}
		
		System.out.println(height);
		
		return height;
	}

	public static void main(String[] args)
	{
		int n = 10;
		
		utopianTree(n);
	}
}
