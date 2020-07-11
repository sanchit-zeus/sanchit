package string;

//Done

public class BeautifulBinaryString 
{
	static int beautifulBinaryString(String b) 
	{
		return ((b.length() - b.replaceAll("010", "").length())/3);
    }
	
	public static void main(String[] args) 
	{
		String b = "0100101010";
		
		beautifulBinaryString(b);
	}
}
