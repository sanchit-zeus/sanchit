package greedyAlgorithms;

import java.util.Arrays;

//Done

public class PermutingTwoArrays 
{
	static String twoArrays(int k, int[] A, int[] B) 
	{		
		Arrays.sort(A);
		for (int i = 0; i < B.length; i++) for (int j = 0; j < B.length; j++) 
				if(B[i] > B[j]){
					int temp = B[i];
					B[i] = B[j];
					B[j] = temp;}
		
		int count = 0;
		for (int i = A.length - 1; i >= 0; i--) 
			if(A[i] + B[i] >= k)
				count++;
		
		if(count == A.length)
			return "YES";
		else
			return "NO";
    }

	public static void main(String[] args) 
	{
		int k = 5;
		int A[] = {1,2,2,1};
		int B[] = {3,3,3,4};
		
		System.out.println(twoArrays(k, A, B));
	}
}
