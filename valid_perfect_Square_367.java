package binarySearchLeetcode;

import java.util.Arrays;

public class vilid_perfect_Square_367 {
	public static boolean isPerfectSquare(int x) {
        if(x<=1)
            return true;
        long start=0;
        long end=x;
        while(start<end)
        {
            long mid=(start+end)/2;
            if(mid*mid==x)
                return true;
            else if(mid*mid>x)
            {
                end=mid;
                
            }
            else if(mid*mid<x)
                   {
                start=mid+1;
            }
        }
        return false;   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=16;
		//System.out.println(isPerfectSquare(x));
		int[] arr= new int[10];
		for(int i=0;i<=5;i++)
		{
			arr[i]=i;
		}
		System.out.println(Arrays.copyOfRange(arr, 0, arr.length-1));

	}

}
