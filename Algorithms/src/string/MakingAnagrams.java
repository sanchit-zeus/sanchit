package string;

//Done

public class MakingAnagrams 
{
	static int makingAnagrams(String s1, String s2) 
	{	
		char c1[] = new char[26];
		char c2[] = new char[26];
		
		for (int i = 0; i < s1.length(); i++) 
			c1[s1.charAt(i) - 97]++;	
		
		for (int i = 0; i < s2.length(); i++) 
			c2[s2.charAt(i) - 97]++;
		
		int count = 0;
	
		for (int i = 0; i < 26; i++) 
			count += Math.abs(c1[i] - c2[i]);
		
		return count;
    }
	 
	public static void main(String[] args) 
	{
		String s1 = "absdjkvuahdakejfnfauhdsaavasdlkj";
		String s2 = "djfladfhiawasdkjvalskufhafablsdkashlahdfa";
		
		System.out.println(makingAnagrams(s1, s2));
	}
}
