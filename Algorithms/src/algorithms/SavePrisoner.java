package algorithms;

//done

public class SavePrisoner 
{
	static int saveThePrisoner(int n, int m, int s) 
	{
		int a = s + m - 1;
		
        if(a > n)
        {
            if(a % n == 0)
                return n;
            
            return a % n;
        }
      
         return a;
    }

	public static void main(String[] args) 
	{
		int n = 3, m = 7, s = 3;
		
		saveThePrisoner(n, m, s);
	}	
}
