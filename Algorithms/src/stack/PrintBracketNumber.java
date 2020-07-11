package stack;

//Done

import java.util.Stack;

public class PrintBracketNumber {
	
	void bracketNumber(String s, int n) 
	{
		Stack <Integer> st = new Stack <Integer> ();
		
		int in = 0;
		for (int i = 0; i < n; i++) 
		{
			if(s.charAt(i) == '(') 
			{
				in++;
				st.push(in);
				System.out.print(in+" ");
			}
			
			if(s.charAt(i) == ')') 
			{
				System.out.print(st.peek()+" ");
				st.pop();
			}	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "(a+(b*c))+(d/e)​";
		int n = s.length();
		
		PrintBracketNumber obj = new PrintBracketNumber();
		obj.bracketNumber(s,n);
	}
}
