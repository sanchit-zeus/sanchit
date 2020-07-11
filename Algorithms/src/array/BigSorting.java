package array;

import java.util.Arrays;
import java.util.Scanner;

public class BigSorting 
{
	static void bigSorting(String[] str) 
    { 
        Arrays.sort(str, (left, right) -> 
        { 
            if (left.length() != right.length()) 
                return left.length() - right.length(); 
             return left.compareTo(right); 
        }); 
    }

    public static void main(String[] args) 
    {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        String[] unsorted = new String [n];

        for(int i = 0; i < n; i++)
            unsorted[i] = src.nextLine();
        src.close();

        bigSorting(unsorted);
        
        for (String s : unsorted) 
            System.out.print(s + " "); 
    }
}
