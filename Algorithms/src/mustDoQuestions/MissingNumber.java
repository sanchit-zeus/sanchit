package mustDoQuestions;

import java.util.Arrays;

public class MissingNumber {
	
	static int MissingNumberInArray(int array[], int n) {
		Arrays.sort(array);

		int sum = array[(n - 1) - 1] * (array[(n - 1) - 1] - 1)/2;
		
		for (int i = 0; i < n - 1; i++) {
			if(sum - (i + 1) == sum - array[i]) {
				sum = sum - array[i];
			}
			else
				return i + 1;	
		}
		
		return -1;
    }
	
	public static void main(String[] args) {
		int n = 10;
		int array[] = {6,1,2,8,3,4,7,10,5};
		System.out.println(MissingNumberInArray(array, n));	
	}
}