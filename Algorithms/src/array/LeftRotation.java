package array;

//done

public class LeftRotation 
{
	static int[] rotLeft(int[] a, int d) 
    {
		int temp = 0;
		
		for (int j = 0; j < d; j++) 
		{
			temp = a[0];
			for (int i = 0; i < a.length - 1; i++) 
			{
				a[i] = a[i+1];
			}
			a[a.length - 1] = temp;
		}
		return a;
    }

	public static void main(String[] args) 
	{
		int n = 5,d = 4;
		int a[] = {1,2,3,4,5};
		
		rotLeft(a,d);
	}
}
