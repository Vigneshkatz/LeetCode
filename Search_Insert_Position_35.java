package leetCode;

public class Search_Insert_Position_35 {
	public static int searchInsert(int[] arr, int x) {
        if(x<arr[0])
            return 0;
        if(x>arr[arr.length-1])
            return arr.length;
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
    return end+1;
}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,7};
		int x=2;
		System.out.println(searchInsert(arr,x));
		x=2;
		System.out.println(searchInsert(arr,x));
		

	}

}
