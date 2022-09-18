package leetCode;

public class binarySearch_704 {
	public static int search(int[] arr, int x) {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(x<arr[mid])
            {
                end=mid-1;
            }else if(x>arr[mid])
            {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int x=3;
		System.out.println(search(arr,x));

	}

}
