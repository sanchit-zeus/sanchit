package string;

//Done

public class HackerRankInString 
{
	static String hackerrankInString(String s) 
	{
		String str = "hackerrank";
		
        if (s.length() < str.length()) 
            return "NO";
        
        int j = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) 
            {
                    j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");
    }

	public static void main(String[] args) 
	{
		String s[] = {"knarrekcah",
					  "hackerrank",
					  "hackeronek",
					  "abcdefghijklmnopqrstuvwxyz",
					  "rhackerank",
					  "ahankercka",
					  "hacakaeararanaka",
					  "hhhhaaaaackkkkerrrrrrrrank",
					  "crackerhackerknar",
					  "hhhackkerbanker"};
//		
//		String str = "rhackerank";
//		System.out.println(hackerrankInString(str));
		
		for (int i = 0; i < s.length; i++) 
			System.out.println(hackerrankInString(s[i]));
	}
}
