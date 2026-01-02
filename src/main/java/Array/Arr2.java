package Array;

import java.util.Arrays;

public class Arr2 {
    public static void main(String[] args) {
        int[] arr={3,4,53,4,4,0,5,4,3,3,3,4,5,6,0};
        System.out.println(sec1(arr));
        System.out.println(sec2(arr));
    }
    private static int sec1(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        int num= arr[arr.length-1];
        for(int i=n-1; i>=0;i--){
            if(arr[i]!=num){
                return arr[i];
            }
        }
        return -1;
    }
    private static int sec2(int arr[]){
        int maxValue=Integer.MIN_VALUE;
        int secondMaxVal=Integer.MIN_VALUE;
        int n=arr.length;
        for (int j : arr) {
            if (j > maxValue) {
                secondMaxVal=maxValue;
                maxValue = j;
            }
        }
        return secondMaxVal;
    }
}
