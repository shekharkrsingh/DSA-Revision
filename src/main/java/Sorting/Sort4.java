package Sorting;

import java.util.Arrays;

public class Sort4 {
    public static void main(String[] args) {
        int[] arr={1,2,5,4,8,2,5,4,7,8,5,2,6,5,8,4,9,5,8,7,5,2,1,3,0,2,5,4};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    private static int[] mergeSort(int[] arr) {
        int n=arr.length;
        sort(arr, 0, n-1);
        return arr;
    }
    private static void sort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int mid=(high+low)/2;
        sort(arr, low, mid);
        sort(arr, mid+1, high);
        int[] result=new int[high-low+1];
        int start1=low;
        int start2=mid+1;
        int end1=mid;
        int end2=high;
        int idx=0;
        while(start1<=end1 && start2<=end2){
            if(arr[start1]<arr[start2]){
                result[idx]=arr[start1];
                start1++;
            }else{
                result[idx]=arr[start2];
                start2++;
            }
            idx++;
        }
        while(start1<=end1){
            result[idx]=arr[start1];
            start1++;
            idx++;
        }
        while(start2<=end2){
            result[idx]=arr[start2];
            start2++;
            idx++;
        }
        idx=0;
        while(low<=high){
            arr[low]=result[idx];
            idx++;
            low++;
        }
    }
}
