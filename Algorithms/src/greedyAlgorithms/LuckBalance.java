package greedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

//Done

public class LuckBalance 
{

	static int luckBalance(int k, int[][] contests) 
	{
		int luck_balance = 0;
		
		Arrays.sort(contests, new Comparator<int[]>()
		{
			public int compare(int[]a, int[]b)
			{
				return -1 * Integer.compare(a[0],b[0]);
			}
		});
		
		for (int i = 0; i < contests.length; i++) 
		{
			int luck = contests[i][0];
			int importance = contests[i][1];
			
			if(importance == 1 && k > 0)
			{
				k--;
				luck_balance += luck;	
			}
			else if(importance == 1 && k == 0)
			{
				luck_balance -= luck; 
			}
			
			if(importance == 0)
			{
				luck_balance +=luck;
			}
		}
				
		System.out.println(luck_balance);
		
		return luck_balance;
    }
	
	public static void main(String[] args) 
	{
		int contests[][] = {{5,1},
							{2,1},
							{1,1},	
							{8,1},
							{10,0},
							{5,0}};
		int k = 3;
		
		luckBalance(k, contests);
	} 	
}
