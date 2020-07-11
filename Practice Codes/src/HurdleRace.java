import java.util.Arrays;

public class HurdleRace 
{	
    public static void main(String args[])
    {
    	int n = 5;
    	int k = 7;
    	
    	int arr[] = {2,5,4,5,2};
    	
    	Arrays.sort(arr);
    	
    	if(arr[n-1] < k)
    		System.out.println("0");
    	else
    		System.out.println(arr[n-1] - k);
    }
}
