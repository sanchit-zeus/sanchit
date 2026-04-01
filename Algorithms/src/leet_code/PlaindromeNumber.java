package leet_code;

public class PlaindromeNumber {
	public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        
        for (int i = 0; i < str.length();) {
        	for (int j = str.length() - 1; j >= 0; j--) {
        		if(str.charAt(i) == str.charAt(j))
        		{
        			i++;
        			continue;
        		}
        		else 
        			return false;
			}
		}   
		return true;   
    }

	public static void main(String[] args) {
		System.out.println(isPalindrome(10));
	}
}
