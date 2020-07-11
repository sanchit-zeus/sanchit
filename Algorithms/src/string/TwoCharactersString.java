package string;

//Done

public class TwoCharactersString 
{
	static int func(char a, char b, String s)
    {
        int count = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != a && s.charAt(i) == b)
                return 0;
            
            if(s.charAt(i) == a && s.charAt(i) != b)
            {
                count++;
                char temp = a;
                a = b ;
                b = temp;
            }
        }
        
        return count;
    }

    static int alternate(String s) 
    {
        int max = 0;
        
        for(int i = 97; i <= 122; i++)
        {
            for(int j = i + 1; j <= 122; j++)
            {
                max = Math.max(max, func((char)i, (char)j, s));
                max = Math.max(max, func((char)j, (char)i, s));
            }
        }
        
        return max;
    }

	public static void main(String[] args) 
	{
		String s = "beabeefeab";
		
		System.out.println(alternate(s));
	}
}
