package leet_code;

public class strStr {
	
	public static int strStrInt(String haystack, String needle) {
		
		if(haystack.length() < needle.length()) return -1;
        if(needle.length()==0 || needle.equals(haystack)) return 0;
		
		String comp = "";
		
		for (int i = 0; i < haystack.length() - needle.length(); i++) {
			if(haystack.charAt(i) == needle.charAt(0))
				comp = haystack.substring(i, i + needle.length());
			if(comp.equals(needle))
				return i;
			
			System.out.println(comp);
		}
		
		return -1;
    }

	public static void main(String[] args) {
		String haystack = "abc";
		String needle = "c";
		
		System.out.println(strStrInt(haystack, needle));
	}
}
