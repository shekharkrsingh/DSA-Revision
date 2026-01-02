package Array;

import java.util.Arrays;
import java.util.Collections;

public class Arr4 {
    public static void main(String[] args) {
        int[] arr={3,4,53,4,4,0,5,4,3,3,3,4,5,6,0};
        System.out.println(Arrays.toString(rotate(arr, 1)));
        System.out.println(Arrays.toString(rotate2(arr, 1)));
    }

    private static int[] rotate(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        int[] newArr=new int[n];
        int idx=0;
        for(int i=k; i<n;i++){
            newArr[idx]=arr[i];
            idx++;
        }
        for(int i=0;i<k;i++){
            newArr[idx]=arr[i];
            idx++;
        }
        return newArr;
    }

    private static int[] rotate2(int[] arr, int k){
        int n=arr.length;
        customeRotate(arr, 0, k-1);
        customeRotate(arr, k, n-1);
        customeRotate(arr, 0, n-1);
        return arr;
    }

    private static int[] customeRotate(int[] arr, int low, int high){
        int mid=high-(high-low)/2;
        for(int i=low; i<=mid; i++){
            int temp=arr[i];
            arr[i]=arr[high-i+low];
            arr[high-i+low]=temp;
        }
        return arr;
    }
}
