package binarySearchLeetcode;

public class missingNUmber {
	  public static int singleNumber(int[] nums) {
	       // Arrays.sort(nums);
	        int leftSum=0;
	       for(int i:nums)
	       {
	           leftSum^=i;
	       }
	        return leftSum;
	}
	public static void main(String[] args) {
		int arr[]= {4,1,2,1,2,5,5};
		System.out.println(singleNumber(arr));

	}

}
