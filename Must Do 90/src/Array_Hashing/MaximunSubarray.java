package Array_Hashing;

public class MaximunSubarray {

    public int maxSubArrayBrute(int[] nums) {
        int maxSum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + nums[k];
                }
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        MaximunSubarray obj = new MaximunSubarray();

        System.out.println(obj.maxSubArray(arr));
    }
}
