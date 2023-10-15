public class RemoveElement {
	// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
	public static void main(String[] args) {
		RemoveElementService obj = new RemoveElementService();
		int[]  arr = {0,4,4,0,4,4,4,0,2};
		System.out.println("count is"+obj.removeElement(arr,4)+"len is "+arr.length);
		
	}
	 
}
class RemoveElementService{
	public  int removeElement(int[] nums, int val) {
	 	int k=0,j=nums.length-1,count=0;
	 	if(nums.length == 0){
	 		return 0;
	 	}
        for(int i =0;i<Math.ceil((float)nums.length/2) && i<j;i++){
        	
        	if(nums[i] == val ){
        		while(nums[j] == val )
        			{j--;
        		System.out.println("j"+j);
        			}     	
        				  		      		
        		if(nums[i] == val&& i<j){ 
        		System.out.println(j+"i="+i);       			
        			k=nums[i];
        			nums[i] = nums[j];
        			nums[j] = k;
        			j--;

        		}
       		}
       		
       		printArr(nums);       	
        }
        
       	   	// for (int x =0; x<nums.length; x++) {
       	   	// 	if(nums[x]!=val)
       	   	// 		count++;
       	   	// }
       	while(count<nums.length&&nums[count]!=val )
       		count++;
        
        return count;
    }
    public void printArr(int[] nums){
    	for(int u =0 ; u<nums.length;u++){
       	   	System.out.print(nums[u]+" x ");
       	}
       	System.out.println("end");
    }
}