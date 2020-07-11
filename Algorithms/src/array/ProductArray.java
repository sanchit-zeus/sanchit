package array;

public class ProductArray {
	
	static void sum(int arr[]) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			int start = i+1;
			for (int j = i+1; j < arr.length; j++) 
			{
				if(j < 5 )
					arr[i] = arr[i]*arr[j];
				
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5};
		sum(arr);
	}
}
