package algorithms;

//DOne

public class ElectronicsShop 
{
	static int getMoneySpent(int[] keyboards, int[] drives, int b) 
	{		
		int max = -1;
		
		for (int i = 0; i < keyboards.length; i++) 
		{
			for (int j = 0; j < drives.length; j++) 
			{
//				System.out.println(keyboards[i]+" "+drives[j]);
				
				if(keyboards[i] + drives[j] < b && 
				   keyboards[i] + drives[j] > max)
				{
//					System.out.println(keyboards[i]+" "+drives[j]);
					max = keyboards[i] + drives[j];
				}	
			}
		}
		
		
		return max;
    }

	public static void main(String[] args) 
	{
		int[] keyboards = {4};
		int[] drives = {5};
		int b = 5;
		
		System.out.println(getMoneySpent(keyboards, drives, b));
	}
}
