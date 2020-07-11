package string;

//Done

public class RemoveDuplicates 
{
	static void remove(String str)
	{
		char c1[] = str.toCharArray();
		int n = c1.length;
		int index = 0;
		
		for (int i = 0; i < n; i++) 
		{
			int j;
			for (j = 0; j < i; j++) 
			{
				if(c1[i] == c1[j])
				{
					break;
				}
			}
			if(j == i)
			{
				c1[index] = c1[i];
				index++;
			}
		}
		
		for (int i = 0; i < index; i++) 
		{
			System.out.print(c1[i]);
		}
	}

	public static void main(String[] args) 
	{
		String str = "geeksforgeeks";
		remove(str);
	}
}
