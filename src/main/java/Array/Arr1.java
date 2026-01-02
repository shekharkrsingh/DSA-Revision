package Array;

import java.util.Arrays;

public class Arr1 {
    public static void main(String[] args) {
        int[] arr={3,4,53,4,4,0,5,4,3,3,3,4,5,6,0};
        System.out.println(lar1(arr));
        System.out.println(lar2(arr));
    }
    private static int lar1(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    private static int lar2(int arr[]){
        int maxValue=Integer.MIN_VALUE;
        int n=arr.length;
        for (int j : arr) {
            if (j > maxValue) {
                maxValue = j;
            }
        }
        return maxValue;
    }
}
