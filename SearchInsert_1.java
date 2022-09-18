package binarySearchLeetcode;
/*
 Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
*/
import java.util.Scanner;

public class SearchInsert_1 {
	public static int searchInsert(int[] arr, int x) {
        int start=0;
        int end=arr.length-1;
        if(x<=arr[start])
            return 0;
        else if(x>arr[end])
            return end+1;
        int mid=0;
        while(start<end)
        {
            mid=(start+end)/2;
            
            if(x<arr[mid]){
                end=mid;
            }else if(x>arr[mid])
            {
                start=mid+1;
            }else{
                return mid;
            }
            
        }
        return end;
        
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("enter target");
		int x=s.nextInt();
		System.out.println(searchInsert(arr,x));
	}

}
