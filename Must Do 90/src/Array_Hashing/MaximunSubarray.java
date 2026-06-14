package Array_Hashing;

public class MaximunSubarray {

    public int maxSubArrayBrute(int[] nums) {
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
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + nums[k];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }

    public int maxSubArrayBrute2(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int currSum = 0;
            for (int j = i; j < nums.length; j++) {
                currSum += nums[j];
                maxSum = Math.max(currSum, maxSum);
            }
        }

        return maxSum;
    }

    public int kadane(int[] nums) {

        int maxSum = Integer.MIN_VALUE, currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxSum = Math.max(maxSum, currSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        MaximunSubarray obj = new MaximunSubarray();
<<<<<<< HEAD
        
        System.out.println(obj.maxSubArrayBrute(arr));
=======

        System.out.println(obj.kadane(arr));
>>>>>>> 04bd9d0f372921f2d82e1307695755df5b7334f8
    }
}
