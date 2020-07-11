package string;

//Done

public class PalindromeIndex 
{	
	static boolean isPalindrome(String s, int index)
	{
		for(int i = index + 1, j = s.length() - 1 - index; i < j; i++, j--)
	   		if(s.charAt(i) != s.charAt(j))
	   			return false;
			
		return true;
	}
	
	static int palindromeIndex(String s)
	{
    	for(int i = 0, j = s.length() - 1; i < j; i++, j--)
    	{
    		if(s.charAt(i) != s.charAt(j))
    		{
    			if(isPalindrome(s, i))
    				return i;
    			else if(isPalindrome(s, j))
    					return j;
    		}
    	}
    	
    	return -1;
    }
	 
	public static void main(String[] args) 
	{
		String s = "aaab";
		
		System.out.println(palindromeIndex(s));
	}
}
