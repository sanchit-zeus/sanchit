package string;

//Done

public class SubstringComparisons 
{
	public static String getSmallestAndLargest(String s, int k) 
	{
		String smallest = s.substring(0,k);
		String largest  = "";
		
		for(int i = 0;i < s.length() - k + 1; i++)
		{
			if(s.substring(i, i + k).compareTo(smallest) <0) 
				smallest = s.substring(i,i+k);
			if(s.substring(i, i + k).compareTo(largest) > 0) 
				largest = s.substring(i,i+k); 
        }
		
        return smallest+" "+largest;
    }

	public static void main(String[] args) 
	{
		String s = "welcometojava";
		int k = 3;

		System.out.println(getSmallestAndLargest(s, k));
	}
}

