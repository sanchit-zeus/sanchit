package string;

public class SeparateTheNumbers 
{
	static void separateNumbers(String s) 
	{
		String num = "";
		
		for (int i = 0; i < s.length(); i++) 
			num += s.charAt(i) - '0';
		
		System.out.println(num.charAt(0) - '0' + 1);
		


    }

	public static void main(String[] args) 
	{
		String s = "91011";
		
		separateNumbers(s);
	}
}
