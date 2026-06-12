package Array_Hashing;

public class MaximumProductSubarray {

    public int maxProductBrute2(int[] nums) {

        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int currProd = 1;
                for (int k = i; k <= j; k++) {
                    currProd = currProd * nums[k];
                }
                if (currProd > maxProduct) {
                    maxProduct = currProd;
                }
            }
        }

        return maxProduct;
    }

    public int maxProductBrute(int[] nums) {

        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int currProd = 1;
            for (int j = i; j < nums.length; j++) {
                currProd = currProd * nums[j];
                maxProduct = Math.max(maxProduct, currProd);
            }
        }

        return maxProduct;
    }

    public static void main(String[] args) {

        int arr[] = { -2, 0, -1 };

        MaximumProductSubarray obj = new MaximumProductSubarray();

        System.out.println(obj.maxProductBrute2(arr));
    }
}
