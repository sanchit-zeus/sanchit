package Array_Hashing;

import java.util.ArrayList;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        
        for (int value : nums) {
            if (list.contains(value)) {
                return true;
            } else {
                list.add(value);
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 1 };
        ContainsDuplicate obj = new ContainsDuplicate();

        System.out.println(obj.containsDuplicate(nums));
    }
}
