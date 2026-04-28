package Array_Hashing;

public class ProductOfArray {

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public int[] optimal(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // Step 1: left products
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Step 2: right products
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right = right * nums[i];
        }

        return ans;
    }

    public int[] productExceptSelf(int[] nums) {

        int prod;
        int ans[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            prod = 1;
            for (int j = i + 1; j < nums.length; j++) {
                prod = prod * nums[j];
            }
            ans[i] = prod;
        }

        for (int i = 0; i < nums.length; i++) {
            prod = 1;
            for (int j = i - 1; j >= 0; j--) {
                prod = prod * nums[j];
            }
            ans[i] = ans[i] * prod;
        }

        return ans;
    }

    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 4 };

        ProductOfArray obj = new ProductOfArray();
        obj.productExceptSelf(nums);

    }
}
