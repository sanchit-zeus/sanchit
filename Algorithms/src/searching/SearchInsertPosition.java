package searching;

//Done

public class SearchInsertPosition
{
	public int searchInsert(int[] nums, int target)
    {
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
                return i;
            
            else if(nums[i] > target)
                return i;               
        }
        
		return nums.length;
    }

	public static void main(String[] args) 
	{
		int nums[] = {1,3,5,6};
		int target = 0;
		
		SearchInsertPosition obj = new SearchInsertPosition();
		System.out.println(obj.searchInsert(nums, target));
	}
}
