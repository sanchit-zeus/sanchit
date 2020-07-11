package algorithms;

import java.util.Scanner;

public class ServiceLane 
{

	static int width(int width[], int a ,int b)
	{
		int minWidth = Integer.MAX_VALUE;
		
		for (int i = a; i <= b; i++) 
		{
			if(width[i] < minWidth)
				minWidth = width[i];
		}
		
		return minWidth;
	}
	
    static void serviceLane(int width[], int[][] cases) 
    {
    	int minServiceLaneWidth[] = new int [cases.length];
    	
    	for (int i = 0; i < cases.length; i++) 
    		for (int j = 0; j < 2 - 1; j++)
    			minServiceLaneWidth[i] = 
    			width(width, cases[i][j], cases[i][j + 1]);
    	
    	for (int i = 0; i < minServiceLaneWidth.length; i++) 
    		System.out.println(minServiceLaneWidth[i]);
			
    }
    
	public static void main(String[] args) 
	{
		final Scanner src = new Scanner(System.in);
		
		int n = src.nextInt();
		int t = src.nextInt();
		int width[] = new int [n];
		
		for (int i = 0; i < n; i++) 
			width[i] = src.nextInt();
		
		int cases[][] = new int[t][2];
		
		int count = 0;
		
		while(count  < t)
		{
			for (int i = 0; i < 2; i++) 
				cases [count][i] = src.nextInt();
			
			count++;
		}
		src.close();
		
		serviceLane(width, cases);
	}
}
