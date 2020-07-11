package algorithms;

//done

public class ChocolateFeast 
{
	static int chocolateFeast(int n, int c, int m) 
	{
		int count = n/c;
		int wrapper = n/c;
		int temp = 0;
					
		while(wrapper >= m)
		{
			temp = wrapper/m;
			count += temp;
			wrapper -= m*(temp);
			wrapper += temp;
		}
		
		System.out.println(wrapper);
		System.out.println(count);
		
		return count;
    }
	
	public static void main(String[] args) 
	{
		int n = 6, c = 2, m = 2;
		
		chocolateFeast(n, c, m);
	}
}
