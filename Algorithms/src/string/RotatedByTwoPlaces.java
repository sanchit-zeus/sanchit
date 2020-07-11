package string;

//Done

public class RotatedByTwoPlaces 
{
	static boolean rotate(String str, String str2) 
	{
		String clock_rot = ""; 
        String anticlock_rot = ""; 
        
		if(str.length() != str2.length())
			return false;
		else
		{
	        int len = str2.length(); 

	        anticlock_rot = anticlock_rot +
	        				str2.substring(len-2, len) + 
	        				str2.substring(0, len-2);
	        
	        clock_rot = clock_rot + 
                    	str2.substring(2) + 
                    	str2.substring(0, 2);
	        
		}
		return (str.equals(clock_rot) || 
                str.equals(anticlock_rot)); 		
	}

	public static void main(String[] args) 
	{
		String str  = "amazon";
		String str2 = "azonam";
		
		System.out.println(rotate(str,str2));
	}
}
