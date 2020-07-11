package greedyAlgorithms;

import java.util.Arrays;

public class MaximumPerimeterTriangle 
{
	static int[] maximumPerimeterTriangle(int[] sticks) 
    {
		Arrays.sort(sticks);
		
		int i = sticks.length - 3;
		while(i >= 0 && sticks[i] + sticks[i + 1] <= sticks[i + 2])
		{
			i--;
		}
		
		if(i >= 0)
		{
			int ans[] = new int[3];
			ans[0] = sticks[i];
			ans[1] = sticks[i + 1];
			ans[2] = sticks[i + 2];
			return ans;
		}
		else 
		{
			int ans[] = new int[1];
			ans[0] = -1;
			return ans;
		}
    }

	public static void main(String[] args) 
	{
		int []sticks = {1,1,1,3,3};
		
		maximumPerimeterTriangle(sticks);
	}
}
