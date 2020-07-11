package array;
import java.util.Scanner;

//Done

public class FindTheFine 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of car numbers: ");
		int n = sc.nextInt();
		
		int a = 0, b = 0, temp = 0;
		int f[] = new int[n];
		int arr[] = new int[n];
		int even[] = new int[n];
		int odd[] = new int[n];
		int fo = 0, fe = 0;
		
		System.out.println("Enter the date: ");
		int d = sc.nextInt();
		if(d%2 == 0)
			a++;
		else
			b++;
		
		System.out.println("Enter the car numbers: ");
		for (int i = 0; i < n; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the fine for the corresponding car numbers: ");
		for (int i = 0; i < n; i++) {
			f[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) 
		{
			if(arr[i]%2 == 0) 
			{ 
				even[i] = arr[i];
				fe = fe + f[i];
			}
			else 
			{
				odd[i] = arr[i];
				fo = fo + f[i];
			}
		}
		
		if(a == 1) 
		{
			System.out.println("Fine for odd numbered Cars:");
			System.out.println(fo);
		}
		else if(b == 1) 
		{
			System.out.println("Fine for even numbered cars");
			System.out.println(fe);
		}
	}
}
