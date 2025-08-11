package warmup;

public class RemoveElementFromArray {
	/*
	 * Given an integer array nums and an integer val, remove all occurrences of val
	 * in nums in-place. The order of the elements may be changed. Then return the
	 * number of elements in nums which are not equal to val.
	 * 
	 * Consider the number of elements in nums which are not equal to val be k, to
	 * get accepted, you need to do the following things:
	 * 
	 * 1. Change the array nums such that the first k elements of nums contain the
	 * 	  elements which are not equal to val. The remaining elements of nums are not
	 *    important as well as the size of nums. 
	 * 2. Return k.
	 */
	
	public static void main(String[] args) {
		int[] nums= {3,2,2,3};
		int val=3;
		System.out.println(removeElement(nums, val));
		
	}
	
	public static int removeElement(int[] nums, int val)
	{
		int x=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=val)
			{
				nums[x]=nums[i];
				x++;
			}
		}
		return x;
		
	}

}
