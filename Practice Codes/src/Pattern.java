
public class Pattern 
{
	public static void main(String[] args) 
	{		
		int n = 5,count = 1,temp = 0,z = 0;
		
		for (int i = 1; i <= n; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(count);
				if(i != j)
					System.out.print("*");
				count++;		
			}
			System.out.println();
		}
		
		for (int i = 1; i <= n; i++) 
		{
			for (int j = n; j >= i; j--) 
			{
				temp = count - j;
				System.out.print(temp);
				if(i != j)
					System.out.print("*");
				temp++;
				z++;
			} 
			count = count - (z-1);
			System.out.println();
			z = 0;
		}
	}
}
