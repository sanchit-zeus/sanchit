import java.util.*;
import java.util.regex.*;

class Parser
{
	static Stack<Character> st = new Stack<Character>();

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
      
    static boolean isBalanced(String next)
    { 
    	char exp[] = next.toCharArray();
    	for(int i = 0; i < exp.length; i++) 
    	{ 
      
    		if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[') 
    			st.push(exp[i]); 
       
    		if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') 
    		{ 
    				if (st.isEmpty())
    					return false;
    				else if ( !isMatchingPair(st.pop(), exp[i]) ) 
    					return false; 
            }     
        } 
          
       if (st.isEmpty()) 
    	   return true;
       else
           return false;       
    }  
}

class Solution
{
	
	public static void main(String[] args) {
		Parser parser = new Parser();
        
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(parser.isBalanced(in.next()));
		}
        
		in.close();
	}
}
