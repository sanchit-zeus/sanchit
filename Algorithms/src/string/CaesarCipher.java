package string;

//Done

public class CaesarCipher 
{
	 static String caesarCipher(String s, int k) 
	    {
	        k %=  26;
	        String str = "";
	        
	        for (int i = 0; i < s.length(); i++)
	        {
	        	int num = s.charAt(i);
	        	
	        	if((num >= 65 && num <= 90))
	            {
	               if (num + k > 90)
	            	   str += (char) (k - Math.abs(num - 90) + 64);
	               else
	                   str += (char) (num + k);
	            }
	            else if ((num >= 97 && num <= 122))
	            {
	               if (num + k > 122)
	                   str += (char) (k - Math.abs(num - 122) + 96);
	               else
	                   str += (char) (num + k);
	            }
	            else
	            	str += (char) num;
	        }
	        
	        System.out.println(str);
	        return str;


	    }
	public static void main(String[] args)
	{
		String s = "DNFjxo?b5h*5<LWbgs6?V5{3M].1hG)pv1VWq4(!][DZ3G)riSJ.CmUj9]7Gzl?VyeJ2dIPEW4GYW*scT8(vhu9wCr]q!7eyaoy.";
		int k = 45;
		
		caesarCipher(s, k);
	}
}
