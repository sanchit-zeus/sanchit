import java.util.ArrayList;
import java.util.Arrays;

public class Numbers 
{
	static void alag(String str)
	{
		int n = 0;
		int count = 0;
		int arr[] = new int [100];
		ArrayList<Integer> list = new ArrayList<Integer>();

		
		for (int i = 0; i < str.length(); i++) 
		{
			if((str.charAt(i) - '0') >= 10)
			{
//				System.out.println(str.charAt(i));
			}
			else if(str.charAt(i) != ' ')
			{
				count ++;
//				n = n * 10 + str.charAt(i) - '0';
				arr[i] = str.charAt(i) - '0';
								
//				System.out.print(str.charAt(i));
			}
		}
		
		if(count == 10)
		{
			for (int i = 0; i < arr.length; i++) 
			{
				if(arr[i] != 0)
				System.out.print(arr[i]);
			}
		}	
	}
	
	public static void main(String args[])
	{
		String str = "Call on 918448969343";
		alag(str);
	}
}
