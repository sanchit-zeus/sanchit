package Array_Hashing;

public class MovingZeros {

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void moveZeroes(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;
                count++;
            }
            printArray(nums);
        }
    }

    public static void main(String[] args) {

        int arr[] = {0,1,0,3,12};

        MovingZeros obj = new MovingZeros();
        obj.moveZeroes(arr);
    }
}
