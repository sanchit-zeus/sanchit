package string;

import java.util.Arrays;

//Done

public class LongestCommonPrefix {
	
	static String longest(String arr[])
	{
		if(arr.length == 0)
			return "-1";
		
		if(arr.length == 1)
			return arr[0];
		
		Arrays.sort(arr);
		
		int end = Math.min(arr[0].length(),arr[arr.length - 1].length());
				
		int i = 0;
		while(i < end && arr[0].charAt(i) == arr[arr.length - 1].charAt(i))
		{
			i++;
		}
		
		return arr[0].substring(0,i);	
	}

	public static void main(String[] args) 
	{
		String arr[] = {"geeksforgeeks","geeks","geek","geezer"};
		System.out.println(longest(arr));
	}
}
