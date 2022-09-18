package binarySearchLeetcode;

public class sqrt_69 {
	 public static int mySqrt(int x) {
	        // if(x==0||x==1)
	        //     return x;
	        long start=0;
	        long end=x;
	        // long mid=0;
	        while(start+1<end)
	        {
	           long mid=(start+end)/2;
	            if(mid*mid==x)
	                return (int)mid;
	            else if(mid*mid>x)
	            {
	                end=mid;
	            }else{
	                start=mid+1;
	            }
	        }
	        return (int)start;
	    }
	public static void main(String[] args) {
		int x=10;
		System.out.println(mySqrt(x));

	}

}
