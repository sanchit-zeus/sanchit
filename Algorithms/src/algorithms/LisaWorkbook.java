package algorithms;

//Done

public class LisaWorkbook 
{	
	static int page = 0;
	
	static int onPage(int ques, int k)
	{
		int count = 0, start = 1,j = start, stop = k;
		
		if(ques % k == 0)
		{
			for (int i = 0; i < ques / k; i++)
			{
				page++;
				for (j = start; j <= stop; j++) 
					if(j == page)
						count++;
				start = j;
				stop += k;
			}
		}
		else if(ques % k != 0)
		{
			for (int i = 0; i < ques / k; i++) 
			{
				page++;
				for (j = start; j <= stop; j++) 
					if(j == page)
						count++;
				start = j;
				stop += k;
			}
			stop = ques;
			page++;
			for (j = start; j <= stop; j++) 
				if(j == page)
					count++;
		}
		
		return count;
	}
	
	static int workbook(int n, int k, int[] arr) 
	{
		int spl = 0;
		
		for (int i = 0; i < arr.length; i++) 
			spl += onPage(arr[i], k);			
		
		return spl;
	}

	public static void main(String[] args) 
	{
		int n = 5, k = 3,arr[] = {4,2,6,1,10};
		
		workbook(n, k, arr);
	}
}

//static int workbook(int n, int k, int[] arr) 
//{
//	int count = 0,j = 2,x = 0,y = 0;
//	
//	for (int i = 0; i < n; i++) 
//	{
//		 x = x + ((j - 2) / k) + 1;
//		 
//        for(j = 1; j <= arr[i]; j++)
//        {
//            y = x + (j - 1) / k;
//            if(j == y)
//                count++;
//	    }
//	}
//	
//	System.out.println(count);
//	
//	return count;
//}
