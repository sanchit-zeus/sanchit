package queue;

import java.util.LinkedList; 
import java.util.Queue;
import java.util.Scanner; 


public class NonRepeatingCharacter 
{
	static Scanner src = new Scanner(System.in);
	static Queue<Character> q = new LinkedList<Character>();

//	static void repeat(char s)
//	{
//		for (int i = 0; i < q.size(); i++) 
//		{
//			if(q.contains(s)) 
//			{
//				System.out.println();
//				
//			}
//			
//		}	
//	}
	
	public static void main(String[] args) 
	{		
		int n = src.nextInt();
		int flag = 0;
		char arr[] = new char[n];
		
		for (int i = 0; i < n; i++) 
		{
			char s = src.next().charAt(0);
			q.add(s);
//			
//			if(q.contains(s)) 
//				flag++;
//			
//			if(flag != 0)
//				System.out.print("-1"+" ");
//			else
				System.out.print(s);
				
		}
	}
}
