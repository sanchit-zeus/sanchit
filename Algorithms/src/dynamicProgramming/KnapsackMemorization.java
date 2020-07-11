package dynamicProgramming;

public class KnapsackMemorization 
{
	//w = w weight of the knapsack
	//n = size of the arrays
	
    static int t[][] = new int[102][1002];
	
	int knapsack(int wt[], int val[], int w, int n)
	{
		if(n == 0 || w == 0)
			return 0;
		
		if(t[n][w] != -1)
			return t[n][w];
		
		else if(wt[n - 1] <= w)
			return t[n][w] = Math.max(val[n-1] + 
					                  knapsack(wt, val, w - wt[n-1], n-1),
					                  knapsack(wt, val, w, n-1));
		
		else if(wt[n - 1] > w)
			return t[n][w] = knapsack(wt, val, w, n - 1);
		
		return 0;
	}
	
	public static void main(String[] args) 
	{
		int val[] = new int[]{60, 100, 120}; 
		int wt[] = new int[]{10, 20, 30}; 
	    int w = 50; 
	    int n = val.length;
	   	    
	    for (int i = 0; i < 102; i++) 
	    	for (int j = 0; j < 1002; j++) 
	    		t[i][j] = -1;
	    
	    KnapsackMemorization  obj = new KnapsackMemorization();
	    System.out.println(obj.knapsack(wt, val, w, n));
	  
	}
}

