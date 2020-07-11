package string;

//Done

public class MarsExploration 
{
	static int marsExploration(String s) 
	{
		String msgOr = "";
		int count = 0;
		
		for (int i = 0; i < s.length()/3; i++) 
			msgOr += "SOS";
		
		for (int i = 0; i < s.length(); i++) 
			if(s.charAt(i) != msgOr.charAt(i))
				count++;
		
		System.out.println(count);
		
		return count;
    }

	public static void main(String[] args) 
	{
		String s = "SOSSOT";
		
		marsExploration(s);
	}
}
