package algorithms;

//Done

public class BeautifulDays 
{
	static int beautifulDays(int i, int j, int k) 
    {
		int rev;
		int count = 0;
		
		while(i <= j)
		{
			int num = i;
			rev = 0;
			while(num > 0) 
			{ 
				rev = rev * 10 + num % 10; 
				num = num / 10; 
		    } 
			
			if((i - rev) % k == 0)
				count++;
			else
				count += 0;
			i++;
		}

		return count;
    }

	public static void main(String[] args) 
	{
		int i = 20, j = 23;
		int k = 6;
		System.out.println(beautifulDays(i, j, k));
	}
}
