package algorithms;

//Done

public class ViralAdvertising
{
	static int viralAdvertising(int n) 
	{
		int people = 5;
		int sum = 0;
		
		for (int i = 1; i <= n ; i++)
		{
			people = (people/2);
			sum += people;
			people *= 3;
		}	
		
		return sum;
    }
	
	public static void main(String[] args) 
	{
		int n = 4;
		
		System.out.println(viralAdvertising(n));
	}
}
