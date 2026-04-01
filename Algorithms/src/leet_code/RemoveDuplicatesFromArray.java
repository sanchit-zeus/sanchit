package leet_code;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
	
	public static int removeDuplicates(int[] nums) {
		
		int arr[] = new int[nums.length];
		int j = 0;
		arr[j] = nums[0];
		
		for (int i = 0; i < nums.length - 1; i++) {
			if(nums[j] != nums[i + 1]) {
				nums[j + 1] = nums[i + 1];
				j++;
			}
		}
		
		return j + 1;
    }

	public static void main(String[] args) {
		int nums[] = {0,0,1,1,1,2,2,3,3,4};
		removeDuplicates(nums);
	}
}
