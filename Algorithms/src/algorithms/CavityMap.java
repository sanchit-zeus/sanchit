package algorithms;

import java.util.ArrayList;

//done

public class CavityMap 
{
	static String numericValue(String strU, String str, String strD)
	{
		int a = 0,b = 0,c = 0,d = 0,e = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i < str.length() - 1; i++) 
		{
			a = a * 10 + str.charAt(i - 1) - '0';
			b = b * 10 + str.charAt(i) - '0';
			c = c * 10 + str.charAt(i + 1) - '0';
			d = d * 10 + strU.charAt(i) - '0';
			e = e * 10 + strD.charAt(i) - '0';
					
//			System.out.println(a+" "+b+" "+c+" "+d+" "+e);
			
			if(a < b && c < b && d < b && e < b)
				list.add(i);
			
			a = 0;b = 0;c = 0;d = 0;e = 0;
		}
				
		if(list.isEmpty())
			return str;
		else
		{
			for (int i = 0; i < list.size(); i++) 
				str = str.substring(0,list.get(i)) + 'X' 
				     +str.substring(list.get(i) + 1);
			
			System.out.println(str);
			
			return str;
		}
	}
	
	static String[] cavityMap(String[] grid) 
	{
		for (int i = 1; i < grid.length - 1; i++) 
			grid[i] = (numericValue(grid[i - 1], grid[i], grid[i + 1]));
		
		return grid;
    }

	public static void main(String[] args) 
	{
		String grid[] = {"179443854",
						 "961621369",
						 "164139922",
						 "968633951",
						 "812882578",
						 "257829163",
						 "812438597",
						 "176656233",
						 "485773814"};
		
		cavityMap(grid);
//		numericValue(grid[0]);  
//		numericValue(grid[1]);
//		numericValue(grid[2]);
//		numericValue(grid[3]);
	}
}
