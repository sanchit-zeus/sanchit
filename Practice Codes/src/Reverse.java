

//done
public class Reverse
{
	
    static int[] reverseArray(int[] a)
    {
    	int rev[] = new int[a.length];
    	int j = a.length;
    	
    	for (int i = 0; i < a.length; i++) 
    	{
    		rev[j - 1] = a[i];
			j =j - 1;	
		}
    	
    	for(j = 0; j < rev.length; j++)
        {
            System.out.println(rev[j]);
        }
    	
		return a;
    }


	public static void main(String[] args) 
	{
		int a[] = {2,3,4,1};
		reverseArray(a);
	}
}
