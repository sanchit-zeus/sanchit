package string;

//Done

public class StrongPassword 
{	
	static int minimumNumber(int n, String password) 
	{
		int count = 0;
		
	    if(!password.matches(".*[a-z].*"))
	        count++;

	    if(!password.matches(".*[A-Z].*")) 
	        count++;

	    if(!password.matches(".*[0-9].*")) 
	        count++;

	    if(password.matches("[a-zA-Z0-9]*")) 
	        count++;

	    int lengthDifference = 6 - password.length();

	    if(lengthDifference > 0 && count <= lengthDifference)
	        return lengthDifference;

	    return count;
    }

	public static void main(String[] args) 
	{
		String password = "Ab1";
		int n = password.length();
		
		System.out.println(minimumNumber(n, password));
	}
}
