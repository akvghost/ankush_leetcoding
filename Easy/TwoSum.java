import java.util.*;

/*PROBLEM 1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
Constraints:

2 <= nums.length <= 10^4
-10^9 <= nums[i] <= 10^9
-10^9 <= target <= 10^9
Only one valid answer exists.*/
class TwoSumBL {
  

    public int[] twoSum(int[] nums, int target) {
        int []indices = new int[2];
        int numLength=nums.length;
        boolean indicesFound = false;
        for(int i = 0 ;i<numLength && indicesFound==false;i++)
        for(int j = i+1; j<numLength;j++)
        {

            if(nums[i]+nums[j] == target)
            {
                indices[0] = i;
                indices[1] = j;
                indicesFound = true;
                break;
            }

       }
       return indices;
    }
}
public class TwoSum
{
     public static void main(String[] args) {
       TwoSumBL obj = new TwoSumBL();
       System.out.println("Hello This is Two Sum");
       //nums = [2,7,11,15], target = 9,Input: nums = [3,2,4], target = 6;
       int[] nums = {1,2,3,4,5,6};
       int []indices = new int[2];
       // indices[0] = 12;
       // indices[1] = 21;
       int target=0;

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value of target :");
       target = sc.nextInt();
       System.out.println("Target is :"+target);
       indices = obj.twoSum(nums,target);
       System.out.println("This is array "+indices[0] + "&" +indices[1]);
       

   }

}