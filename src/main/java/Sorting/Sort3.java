package Sorting;

import java.util.Arrays;

public class Sort3 {
    public static void main(String[] args) {
        int[] arr={1,2,5,4,8,2,5,4,7,8,5,2,6,5,8,4,9,5,8,7,5,2,1,3,0,2,5,4};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    private static int[] insertionSort(int[] arr) {
        int n=arr.length;
        for(int i=1;i<n;i++){
            int val=arr[i];
            for(int j=i-1;j>=0;j--){
                if (arr[j] <= val) {
                    break;
                } else {
                    arr[j + 1] = arr[j];
                }
            }
        }
        return arr;
    }
}
