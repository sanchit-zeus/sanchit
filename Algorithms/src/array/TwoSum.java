package array;

//Done

public class TwoSum 
{
	public int[] twoSum(int[] nums, int target) 
    {
        int temp = 0;
        int index[] = new int[2];
        
        for(int i = 0; i < nums.length; i++)
        {
        	temp = target - nums[i];
        	for (int j = i + 1; j < nums.length; j++) 
        		if(nums[j] == temp)
        		{
        			index[0] = j;
        			index[1] = i;
        		}
        }
        
        System.out.println(index[0]+" "+index[1]);
        
		return index;
    }
	public static void main(String[] args) 
	{
		int nums[] = {2,7,11,15};
		int target = 9;
		
		TwoSum obj = new TwoSum();
		obj.twoSum(nums,target);
	}
}
