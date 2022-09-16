package leetCode;

public class Find_Pivot_Index_724 {
    public static int pivotIndex(int[] arr) {
        int totalSum=0;
        for(int i=0;i<arr.length;i++)
        {
            totalSum+=arr[i];
        }
        int pivot=0;
        int startSum=0;
        while(pivot<arr.length)
        {
            totalSum-=arr[pivot];
            if(totalSum==startSum)
                return pivot;
            startSum+=arr[pivot];
            pivot++;
        }
        return -1;
    }
	public static void main(String[] args) {
		int[] arr= {1,5,3,6};
		System.out.println(pivotIndex(arr));
	}

}
