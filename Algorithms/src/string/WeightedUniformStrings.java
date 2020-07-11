package string;

import java.util.HashSet;

//Done

public class WeightedUniformStrings 
{
	static String[] weightedUniformStrings(String s, int[] queries) 
	{
		int l = s.length();
        HashSet<Integer> weight = new HashSet<Integer>(l);

        int count = 1;
        int w = 0;
        int last = '-';
        
        for (int i = 0; i < l; i++) 
        {
        	w = s.charAt(i) - 96;
            if (w == last) 
            {
            	count++;
                w = w * count;          
            }
            else 
            {
            	count = 1;
                last = w;
            } 
            System.out.println(w);
            weight.add(w);
        }
        
        String subs[] = new String[queries.length];
         
        for (int i = 0; i < queries.length; i++) 
        {
        	if (weight.contains(queries[i])) 
        		subs[i] = "YES";
        	else 
        		subs[i] = "NO";
        }
         
        for (int i = 0; i < subs.length; i++) 
			System.out.println(subs[i]);
         
         return subs;
    }

	public static void main(String[] args) 
	{
		String s = "aaabbbbcccddd";
		int queries[] = {5,9,7,8,12,5}; 

		weightedUniformStrings(s, queries);
	}
}
