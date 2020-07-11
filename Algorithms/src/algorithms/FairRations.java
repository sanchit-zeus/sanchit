package algorithms;

//Done

public class FairRations 
{
	static void fairRations(int[] B) 
	{
		 int count = 0;
		 int sum = 0;
		 
		 for (int i = 0; i < B.length; i++) 
			sum += B[i];
		 
		 if(sum % 2 == 1)
		        System.out.println("NO");
		    else
		    {
		        for(int i = 0; i < B.length; i++)
		        {
		            if(B[i] % 2 != 0)
		            {
		                B[i]++;
		                B[i+1]++;
		                count+=2;
		            }
                 }
				 System.out.println(count);
		     }
	}
    
	public static void main(String[] args) 
	{
		
		int B[] = {2,3,4,5,6};
		
		fairRations(B);
	}
}
