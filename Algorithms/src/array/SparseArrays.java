package array;

//done

public class SparseArrays 
{
	int[] matchingStrings(String[] strings, String[] queries)
	{
		int count;
		int arr[] = new int[queries.length];
		for (int i = 0; i < queries.length; i++) 
		{
			count = 0;
			for (int j = 0; j < strings.length; j++) 
			{
				if(queries[i].equals(strings[j]))
				{
					count++;
				}
			}
			arr[i] = count;
		}
		return arr;	
	}

	public static void main(String[] args) 
	{
		String[] strings = {"aba", "baba", "aba", "xzxb"};
		String[] queries = {"aba" ,"xzxb", "ab"};
		
		SparseArrays obj = new SparseArrays();
		obj.matchingStrings(strings, queries);
	}
}
