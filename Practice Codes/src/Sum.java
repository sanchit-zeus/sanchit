import java.util.*;

class Sum
{	
    static Scanner src = new Scanner(System.in);

    public static void main(String args[])
    {
//    	try
//    	{
//    		Float f1 = new Float("3.0");
//    		int x = f1.intValue();
//    		byte b = f1.byteValue();
//    		double d = f1.doubleValue();
//    		System.out.println(x + b + d);
//    	}
//    	catch(NumberFormatException e)
//    	{
//    		System.out.println("Bad Number");
//    	}
        int sum  = 0;
        int count = 0;
        int n = src.nextInt();
        int k = src.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = src.nextInt();
        
        Arrays.sort(arr);
        
        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                sum = arr[i] + arr[j];
                if(sum % k == 0 && i < j)
                    count++;
            }
        }
        System.out.println(count);        
    }
}