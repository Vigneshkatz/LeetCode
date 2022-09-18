package binarySearchLeetcode;

import java.util.ArrayList;
import java.util.List;

public class searchIndex {
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
    public static List<Integer> targetIndices(int[] arr, int x) {
        quickSort(arr,0,arr.length-1);
        //Arrays.sort(arr);
        List<Integer> index=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                index.add(i);
            }
        }
        return index;
    }
	public static void main(String[] args) {
		int[] arr= {2,2,4,5,1,5};
		int target=2;
		System.out.println(targetIndices(arr,target));

	}

}
