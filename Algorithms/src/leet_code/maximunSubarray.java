package leet_code;

public class maximunSubarray {
	
	public static int maxSubArray(int[] nums) {
		
		if(nums.length == 1)
			return nums[0];
		
		int curSum = 0, maxSum = Integer.MIN_VALUE;;
		
		for (int i = 0; i < nums.length; i++) {
			curSum = curSum + nums[i];
			maxSum = Math.max(curSum, maxSum);
			if(curSum < 0)
				curSum = 0;
		}

		return maxSum;
    }

	public static void main(String[] args) {
		int [] nums = {-2,-1,-5};
		System.out.println(maxSubArray(nums));
	}
}
