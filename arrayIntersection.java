package leetCode;

import java.util.Arrays;

public class arrayIntersection {
    	public static int partition(int a[],int si,int ei){
        int pivotElement=a[si];
        int smallerNumCount=0;
        for(int i=si+1;i<=ei;i++){
            if(a[i]<pivotElement){
                smallerNumCount++;
            }
        }
        int temp=a[si+smallerNumCount];
        a[si+smallerNumCount]=pivotElement;
        a[si]=temp;
        int i=si;
        int j=ei;
        while(i<j){
            if(a[i]<pivotElement){
                i++;
            }else if(a[j]>=pivotElement){
                j--;
            }else{
                 temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
        return si+smallerNumCount;
    }
    public static void quickSort(int a[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pivotIndex=partition(a,si,ei);
        quickSort(a,si,pivotIndex-1);
        quickSort(a,pivotIndex+1,ei);
    }
    public static int[] intersect(int[] nums1, int[] nums2) {

        quickSort(nums1,0,nums1.length-1);
        quickSort(nums2,0,nums2.length-1);
        int idx1=0,idx2=0;
        int[] arr=new int[nums1.length*nums2.length];
        int i=0;
            while(idx1<nums1.length&&idx2<nums2.length)
            {
                if(nums1[idx1]<nums2[idx2])
                {
                    idx1++;
                }else if(nums1[idx1]>nums2[idx2])
                {
                    idx2++;
                }else{
                    arr[i++]=nums1[idx1];
                    idx1++;
                    idx2++;
                }
            }
            return Arrays.copyOfRange(arr, 0, i);
        
    }
    public static void main(String[] args)
    {
    	int[] arr1= {1,2,1,2};
    	int[] arr2= {2,2};
    	System.out.println(intersect(arr1,arr2));
    	int[] arr3=intersect(arr1,arr2);
    	for(int i=0;i<arr3.length;i++)
    	{
    		System.out.println(arr3[i]);
    	}
    }
}

