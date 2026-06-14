package Array_Hashing;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {

    void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        

   

        printArray(nums1);
    }

    public static void main(String[] args) {

        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};

        MergeSortedArray obj =  new MergeSortedArray();

        obj.merge(nums1, nums1.length, nums2, nums2.length);
    }
}
