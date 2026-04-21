package Array_Hashing;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        int occ[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 1 };
        ContainsDuplicate obj = new ContainsDuplicate();

        obj.containsDuplicate(nums);
    }
}
