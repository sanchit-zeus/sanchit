package leet_code;

import java.util.Stack;

public class ValidParantesis {
	
	public static boolean isValid(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == '(' || s.charAt(i) == '['|| s.charAt(i) == '{')
				stack.push(s.charAt(i));
			
			if(stack.isEmpty())
				return false;
			
			char check;
			
			switch(s.charAt(i)){
			case ')':
				check = stack.pop();
				if(check == '[' || check == '{')
					return false;
				break;
			case ']':
				check = stack.pop();
				if(check == '{' || check == '(')
					return false;
				break;
			case '}':
				check = stack.pop();
				if(check == '(' || check == '[')
					return false;
				break;	
			}
		}
		
		return stack.isEmpty();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("()[]]{}"));
	}
}
