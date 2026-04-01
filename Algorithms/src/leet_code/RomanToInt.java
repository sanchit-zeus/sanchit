package leet_code;

//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000

public class RomanToInt {
	public static int value(char r) {
		if(r == 'M')
			return 1000;
		if(r == 'D')
			return 500;
		if(r == 'C')
			return 100;
		if(r == 'L')
			return 50;
		if(r == 'X')
			return 10;
		if(r == 'V')
			return 5;
		if(r == 'I')
			return 1;
		return -1;
	}
	
	
	public static int romanToInt(String s) {
		int res = 0;
		

        for (int i = 0; i < s.length(); i++)
        {
            int s1 = value(s.charAt(i));
 
            if (i + 1 < s.length())
            {
                int s2 = value(s.charAt(i + 1));
 
                if (s1 >= s2)
                    res = res + s1;
                else
                {
                    res = res + s2 - s1;
                    i++;
                }
            }
            else
                res = res + s1;
        }
		
		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println(romanToInt("MCMXCIV"));
	}
}
