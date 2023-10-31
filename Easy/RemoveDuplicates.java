//26. Remove Duplicates from Sorted Array
//0 1 1 1 2 3
class RmD
{
	public int removeDuplicates(int[] nums) {
		int []copyArr = nums;
		copyArr[0] = 999;
		System.out.println(copyArr[0]);	
		for (int i =1; i<nums.length;i++ ) {
			if(nums[i-1] == nums[i]){
				
				copyArr[i-1] = nums[i-1];
				nums[i-1]=999;

			}			
		}
		for (int i =0 ; i<copyArr.length; i++) {
			System.out.print(copyArr[i]+"x");
		}

		return 0;
    }
}

public class RemoveDuplicates
{public static void main(String[] args) {
	RmD o = new RmD();
	int [] ar ={1,2,3,4,4,3};
	o.removeDuplicates(ar);
}
	
}