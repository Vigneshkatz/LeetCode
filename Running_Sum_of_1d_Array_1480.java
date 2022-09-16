package leetCode;

public class Running_Sum_of_1d_Array_1480 {
	public static int[] runningSum(int[] arr) {
        int[] runningSum=new int[arr.length];
        int end=0;
        int k=0;
        while(k<runningSum.length)
        {
            int start=0;
            int sum=0;
            while(start<=end)
            {
                sum+=arr[start];
                start++;
            }
            runningSum[k]=sum;
            k++;
            end++;
        }
        return runningSum;
        
    }
	public static void main(String[] args) {
		int[] arr= {1,1,1,1,1};
		runningSum(arr);

	}

}
