package greedyAlgorithms;

import java.util.Arrays;

//Done

public class MarcCakewalk 
{
	static long marcsCakewalk(int[] calorie) 
	{
		Arrays.sort(calorie);
		int count = 0;
		int j = 0;
		
		for (int i = calorie.length - 1; i >= 0 ; i--) 
		{
			count += Math.pow(2,j)*calorie[i]; 
			j++;
		}
		
		System.out.println(count);
		return count;
    }
	
	public static void main(String[] args) 
	{
		int calorie[] = {7,4,9,6};
		
		marcsCakewalk(calorie);
	}
}
