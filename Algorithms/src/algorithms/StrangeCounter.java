package algorithms;

//Done

public class StrangeCounter 
{
	static long strangeCounter(long t) 
	{
		long rem = 3;
				while(t > rem)
				{
				    t = t - rem;
				    rem *= 2;
				}

				System.out.println(rem - t + 1);
		
//		for (int i = 1; i <= t - 1; i++) 
//		{	
//			counter--;
//			time++;
//			
//			if(counter < 1)
//			{
//				counter = 2 * initial;
//				initial = counter;
//			}
//		}
		
		return 0;
    }

	public static void main(String[] args) 
	{
		long t = 21;
		
		strangeCounter(t);
	}
}
