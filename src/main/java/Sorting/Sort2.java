package Sorting;

import java.util.Arrays;

public class Sort2 {
    public static void main(String[] args) {
        int[] arr={1,2,5,4,8,2,5,4,7,8,5,2,6,5,8,4,9,5,8,7,5,2,1,3,0,2,5,4};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    private static int[] bubbleSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
