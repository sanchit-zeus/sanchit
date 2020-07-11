package recursion;

//Done

public class ReverseDigits {
	
	static void reverseDigits(int n)
	{
		if(n > 0) 
		{
			int a = n % 10;
			int b = n / 10;
			System.out.print(a);
			reverseDigits(b);
		}
	}

	public static void main(String[] args) 
	{		
		int n = 2348;
		reverseDigits(n);
	}
}
