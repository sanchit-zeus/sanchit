package algorithms;

//Done

public class AppleOrange 
{
	static void countApplesAndOranges
	(int s, int t, int a, int b, int[] apples, int[] oranges) 
	{
		int countOrange = 0;
		int countApples = 0;
		
		for (int i = 0; i < apples.length; i++) 
			apples[i] += a;
		
		for (int i = 0; i < oranges.length; i++) 
			oranges[i] += b;	
		
		for (int i = 0; i < apples.length; i++)
		{
			if(apples[i] >= s && apples[i] <= t)
				countApples++;
		}
		
		for (int i = 0; i < oranges.length; i++) 
		{
			if(oranges[i] >= s && oranges[i] <= t) 
				countOrange++;
		}
		
		System.out.println(countApples);
		System.out.println(countOrange);
    }

	public static void main(String[] args) 
	{ 
		int s = 7, t = 11;
		int a = 5, b = 15;
//		int m = 3, n = 2;
		
		int apples[] = {-2,2,1};
		int oranges[] = {5,-6};
		
		countApplesAndOranges(s,t,a,b,apples,oranges);		

	}
}
