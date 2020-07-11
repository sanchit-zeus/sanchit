package string;

import java.util.Scanner;

//Done

public class BinaryString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner src = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String str = src.nextLine();
		src.close();
		
		char str1[] = str.toCharArray();
		int count=0;
		
		for (int i = 0; i < str1.length; i++) 
		{
			if(str1[i]=='1') 
			{
				for (int j = i; j < str1.length; j++) 
				{
					if(str1[j]=='1' && i!=j) 
					{
						count++;
//						for (int j2 = i; j2 <=j; j2++) 
//						{
//							System.out.print(str1[j2]);
//						}
//						System.out.println();
					}
				}	
			}
		}
		System.out.println(count);
	}
}
