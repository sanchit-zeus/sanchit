
public class Odd 
{
	public static int func(int n, int i)
	{
		 if (n == 2) 
			 System.out.println(2); 
	     if (n % i != 0) 
	    	 System.out.println(i); 
	    
	    	 		
	     return func(n, i + 1); 
	}
	
	public static void main(String[] args) 
	{
		int n = 100;
		
		func(n, 2);
	}
}
