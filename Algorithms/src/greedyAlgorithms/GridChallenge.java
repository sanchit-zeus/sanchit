package greedyAlgorithms;

//Done

import java.util.Arrays;

public class GridChallenge 
{
	static String gridChallenge(String[] grid) 
	{
		for (int i = 0; i < grid.length; i++) 
		{
			char ch[] = grid[i].toCharArray();
			Arrays.sort(ch);
			grid[i] = "";
			grid[i] = Arrays.toString(ch);
			System.out.println(grid[i]);
		}
		
		for (int i = 0; i < grid.length - 1; i++) 
		{
			for (int j = 0; j < grid[i].length() - 1; j++) 
			{
				if(grid[i].charAt(j) > grid[i].charAt(j + 1) &&
				   grid[i].charAt(j) > grid[i + 1].charAt(j))
					return "NO";
			}
		}
		
		return "YES";
    }

	public static void main(String[] args) 
	{
		String grid[] = {"ebacd",
						 "fghij",
						 "olmzn",
						 "trpqs",
						 "xywuv"};
	
		System.out.println(gridChallenge(grid));
	}
}
