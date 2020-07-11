package algorithms;

//Done

import java.util.TreeMap;

public class ACMICPCTeam 
{
	static int[] acmTeam(String[] topic) 
	{
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for (int i = 0; i < topic.length - 1; i++) 
		{
			for (int j = i + 1; j < topic.length; j++) 
			{
				int count = 0;
				for (int k = 0; k < topic[i].length(); k++) 
				{	
					if(topic[i].charAt(k) == '1')
						count++;
					else if(topic[j].charAt(k) == '1')
						count++;
				}
				if(map.containsKey(count))
					map.put(count,map.get(count) + 1);
				else
					map.put(count,1);
			}
		}
		
		int team = -1;
		int subject = -1;
		
		for(Integer i:map.keySet())
		{
			if(i > subject) 
			{
				subject = i;
				team = map.get(i);				
			}
		}
		
		int ans[] = new int[2];
		
		ans[0] = subject;
		ans[1] = team;
	
		return ans;
    }

	public static void main(String[] args) 
	{
		String topic[] = {"10101","11100","11010","00101"};
		
		acmTeam(topic);
	}
}
