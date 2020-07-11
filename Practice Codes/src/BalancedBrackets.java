import java.util.Stack;

public class BalancedBrackets {
	
	static Stack<Character> s = new Stack<Character>();

	 static boolean isMatchingPair(char character1, char character2) 
	    { 
	       if (character1 == '(' && character2 == ')') 
	         return true; 
	       else if (character1 == '{' && character2 == '}') 
	         return true; 
	       else if (character1 == '[' && character2 == ']') 
	         return true; 
	       else
	         return false; 
	    } 
	
	boolean checker(String str)
	{
		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i) == '{' || 
			   str.charAt(i) == '[' || 
			   str.charAt(i) == '(')
			{
				s.push(str.charAt(i));
			}
			if(str.charAt(i) == '}' || 
			   str.charAt(i) == ']' || 
			   str.charAt(i) == ')')
			{
				if(s.isEmpty())
					return false;
				else if(!isMatchingPair(s.pop(), str.charAt(i)))
					return false;
			}
		}

		if(s.isEmpty())
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) 
	{
		String str = "{{[[(())]]}}";
		BalancedBrackets obj = new BalancedBrackets();

		if(obj.checker(str) == true)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
