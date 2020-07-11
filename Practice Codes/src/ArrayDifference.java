import java.util.ArrayList;

public class ArrayDifference 
{
	static int difference(int arr[])
	{
		int max = Integer.MIN_VALUE;
		int eleInd1 = 0;
		int eleInd2 = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length - 2; i++)
		{
			list.add(Math.abs(arr[i] - arr[i + 2]));
			
			for (int j = 0; j < list.size(); j++) 
			{
				if(list.get(j) > max)
				{
					eleInd1 = i + 1;
					eleInd2 = i;
					max = list.get(j);
				}
			}
		}
		
		if(eleInd1 > eleInd2)
			return eleInd2;
		else
			return eleInd2;
	}

	public static void main(String[] args)
	{
		int arr[] = {4,3,2,10,8,6};
		
		if(arr.length < 3)
			System.out.println("Invalid Array Size");
		else
			System.out.println(difference(arr));
	}
}
