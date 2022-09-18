package leetCode;

import java.util.Arrays;

public class Squares_of_a_Sorted_Array_977 {
	
	 public static int[] sortedSquares(int[] nums) 
	 {
	        
//	        for(int i=0;i<nums.length;i++)
//	        {
//	            nums[i]=nums[i]*nums[i];
//	        }
//	        
//	        Arrays.sort(nums);
//	        
//	        //return nums;
		 int start=0;
	        int end=nums.length-1;
	        int pointer=end;
	        int[] result=new int[nums.length];
	        while(start<=end)
	        {
	            if(Math.abs(nums[start])>Math.abs(nums[end]))
	            {
	                result[pointer]=nums[start]*nums[start];
	                start++;
	            }else{
	                result[pointer]=nums[end]*nums[end];
	                end--;
	            }
	            pointer--;
	        }
	        return result;
	    }
	    
	public static void main(String[] args) {
		int[] nums= {-4,-1,0,3,10};
		int[] res=sortedSquares(nums);
		for(int i:res)
		{
			System.out.println(i);
		}
		

	}

}
