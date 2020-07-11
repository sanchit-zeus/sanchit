package array;

//done

import java.util.Scanner;

public class FindDigits {
    
    static Scanner src = new Scanner(System.in);
    
    static int check(int n) 
    { 
        int q = n;
        int r = 0;
        int count = 0;
        
        while( q / 10 > 0 ) 
        {
            r = q % 10;
            
            if( r != 0 && n % r == 0 ) 
                count++;
            
            q = q/10;
        }
        if(n % q == 0)
            count++;
        return count;
    }

    public static void main(String[] args) 
    {
        int t = src.nextInt();
        int i =0;
        while(i < t)
        {
            int n = src.nextInt();
            System.out.println(check(n));
        }
    }
}
