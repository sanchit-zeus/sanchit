package basics;

public class ReverseNumber {
	
	public String is_palindrome(int X, int reverse)
    {
		if(X == reverse)
			return "Yes";
		else
			return "No";  
    }
	
	int reverse(int X) {
		int temp = X;
		int reverse = 0;
		int mul = 1;
		
		while(temp%10 != 0) {
			temp = temp/10;
			mul = mul*10;
		}
		mul = mul/10;
		temp = X;
		
		while(temp%10 != 0) {
			reverse += temp%10*mul;
			mul = mul/10;
			temp = temp/10;
		}
		
		System.out.println(is_palindrome(X, reverse));
		return reverse;
    }

	public static void main(String[] args) {
		int X = -121;
		ReverseNumber obj = new ReverseNumber();
		System.out.println(obj.reverse(X));
	}
}
