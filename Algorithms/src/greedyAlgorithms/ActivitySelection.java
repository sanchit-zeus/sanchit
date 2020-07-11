package greedyAlgorithms;

//Done

public class ActivitySelection 
{
	static int start[]  =  {5, 1, 3, 0, 5, 8};
    static int finish[] =  {9, 2, 4, 6, 7, 9};
    static int n = start.length;
	static int act[][] = new int[2][n];
	
	public static void sort()
	{
		for (int i = 0; i < n; i++) 
		{
			act[0][i] = start[i];
			act[1][i] = finish[i];
		}
		 
		for (int j = 0; j < n - 1; j++) 
			if (act[1][j] > act[1][j + 1]) 
			{                       
				int t = act[1][j];
				int t2 = act[0][j];
				act[1][j] = act[1][j + 1];
				act[0][j] = act[0][j + 1]; 
				act[1][j + 1] = t; 
				act[0][j + 1] = t2; 
			} 
	}
	
	public static void printMaxActivities() 
    { 
		sort();
		
		int i = 0;

		System.out.print(i+" ");
		
		for (int j = 1; j < n; j++) 
			if (act[0][j] >= act[1][i]) 
			{ 
				System.out.print(j+" ");
				i = j; 
			} 
    } 
    
	
	public static void main(String[] args) 
	{
	    printMaxActivities();
	}
}
