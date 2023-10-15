//26. Remove Duplicates from Sorted Array
//0 1 1 1 2 3
class RmD
{
	public int removeDuplicates(int[] nums) {
		int [] arr= new int[nums.length];

		for(int i =0;i<nums.length;i++)
		{
			for(int j=i+1;j<numLength;j++)
			{
				if(nums[i]==nums[j] && !arr.contains(nums[i]))
				{	arr[i]=nums[j];
					continue;
				}
				else
				{
					arr[i]=nums[i];
					break;
				}
			}
		}
        return 0;
    }
}

public class RemoveDuplicates
{public static void main(String[] args) {
	RmD o = new RmD();

}
	
}