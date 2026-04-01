package leet_code;

public class LongestCommonPrefix {
	
	public static String commonPrefix(String s1, String s2) {
		
		String prefix = "";
		
		for (int i = 0, j = 0; 
			     i < s1.length() && 
			     j < s2.length(); 
				 i++, j++) {
			if(s1.charAt(i)!=s2.charAt(j))
				break;
			else
				prefix += s1.charAt(i);
		}
		return prefix;
	}
	
	public static String longestCommonPrefix(String[] strs) {
		
		
		String longestPrefix = strs[0];
				
		for (int i = 0; i < strs.length - 1; i++) 
			longestPrefix = commonPrefix(longestPrefix, strs[i + 1]);
		
		return longestPrefix;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strs = {"flower","flow","flight"}; 
		
		System.out.println(longestCommonPrefix(strs));
	}
}
