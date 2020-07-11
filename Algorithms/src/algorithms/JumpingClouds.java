package algorithms;

//Done

public class JumpingClouds 
{
	static int jumpingOnClouds(int[] c, int k) 
	{
		int energy  =  100;
		int i = 0;
		
		if(c[0] == 1)
			energy -= 2;
		
		if(k == c.length)
		{
			energy-= 1;
		}
		
		for (i = i + k; i < c.length; i = (i + k) % c.length) 
		{
			if(i == 0) 
			{
				energy -= 1;
				break;
			}
			else
			{
				if(c[i] == 0) 
				{
					energy -= 1;
					System.out.print(i+" "+c[i]+" "+energy);
					System.out.println();
					}
				else {
					energy -= 3;
					System.out.print(i+" "+c[i]+" "+energy);
					System.out.println();
					}
			}
		}
		System.out.println(energy);
		
		return energy;
	}
	
	public static void main(String[] args) 
	{
		int c[] = {1,1,0,1,0,1,0,1,0,1,0,1,1,0,1,1,1,1,1};
		int k = 19;
		
		jumpingOnClouds(c, k);
	}
}
