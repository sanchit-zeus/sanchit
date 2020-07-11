package string;

//Done

public class ReverseWordsGivenString 
{	
	static void reverse(String str)
	{
		int n1 = str.length();
		char c1[] = str.toCharArray();
		
		for (int i = n1 - 1; i >= 0; i--) 
		{
			if(c1[i] == '.' || c1[i] == ' ')
			{
				for (int j = i + 1; j < n1; j++) 
					System.out.print(c1[j]);
				n1 = i;
				System.out.print(".");
			}
		}
		for (int i = 0; i < n1; i++)
			System.out.print(c1[i]);
	}

	public static void main(String[] args) 
	{
		String str = "i.like.this.program.very.much";
		reverse(str);
	}
}
