package algorithms;

//Done

public class HalloweenSale 
{
	static int howManyGames(int p, int d, int m, int s) 
	{
		int count  = 0;
		int cost = p;
		int sum = 0;
			
		while(cost > m && (sum + cost) <= s)
		{
			sum += cost;
			count++;
			cost -= d;
		}
		
		while((sum + m) <= s && (sum + cost) <= s)
		{	
			sum += m;
			count++;	
		}
				
		System.out.println(sum+" "+cost+" "+count);

		return count;
    }

	public static void main(String[] args) 
	{
		int p = 1,d = 100,m = 1,s = 9777;
		
		howManyGames(p, d, m, s);		
	}
}
