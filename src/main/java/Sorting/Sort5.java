package Sorting;

import java.util.Arrays;

public class Sort5 {
    public static void main(String[] args) {
        int[] arr={1,2,5,4,8,2,5,4,7,8,5,2,6,5,8,4,9,5,8,7,5,2,1,3,0,2,5,4};
        System.out.println(Arrays.toString(quickSort(arr)));
    }

    private static int[] quickSort(int[] arr){
        int n=arr.length;
        sort(arr, 0, n-1);
        return arr;
    }

    private static void sort(int[] arr, int low, int high){
        int pivot=arr[low];
        if(low>=high){
            return;
        }
        int i=low;
        int j=high;
        while(i<j){
            while(i<=high &&arr[i]<pivot){
                i++;
            }
            while(j>=low && arr[j]>=pivot){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }else if(j>low){
                int temp=arr[low];
                arr[low]=arr[j];
                arr[j]=temp;
            }
        }
        sort(arr, low, i-1);
        sort(arr, i+1, high);
    }
}
