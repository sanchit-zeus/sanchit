//done

public class ReverseDigits
{
	void reverse(int n)
	{
		System.out.print(n % 10);
		
		if(n/10 != 0) 
		{
			reverse(n/10);
		}
	}
	
	public static void main(String[] args) 
	{
		int n = 123456789;
		
		ReverseDigits obj = new ReverseDigits();
		obj.reverse(n);
	}
}
