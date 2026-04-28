package Array_Hashing;

public class MaximunSubarray {

    public int maxSubArray(int[] nums) {
        int maxSum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k]+",");
                }
                System.out.println();
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        MaximunSubarray obj = new MaximunSubarray();

        obj.maxSubArray(arr);
    }
}
