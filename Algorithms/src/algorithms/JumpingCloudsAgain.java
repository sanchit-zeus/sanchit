package algorithms;

//Done

public class JumpingCloudsAgain 
{
	static int jumpingOnClouds(int[] c) 
	{
		int count = 0;
		int jump = 0;
		int i = 0;
		
		for (i = 0; i < c.length - 2; i += jump) 
		{
			jump = 0;
			if(c[i + 1] == 0 && c[i + 2] == 0)
			{
				jump += 2;
				count ++;
			}
			
			else if(c[i + 1] == 0 && c[i + 2] == 1)
			{
				jump += 1;
				count ++;
			}
			
			else if(c[i + 1] == 1 && c[i + 2] == 0)
			{
				jump += 2;
				count ++;
			}
		}
		
		if(i == c.length - 2)
			count++;
		
			return count;
    }

	public static void main(String[] args) 
	{
		int c[] = {0,0,0,1,0,0};
		
		System.out.println(jumpingOnClouds(c));
	}
}
