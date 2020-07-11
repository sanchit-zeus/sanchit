package stack;

import java.util.Stack;

public class ParenthesisChecker {
	
	static Stack<Character> s = new Stack<Character>();

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
				else if(str.charAt(i) == s.pop())
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
		String str = "{[(])}";
		ParenthesisChecker obj = new ParenthesisChecker();

		if(obj.checker(str) == true)
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}
}
