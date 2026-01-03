package Array;

import java.util.Arrays;

public class Arr9 {
    public static void main(String[] args) {
        int[] arr= {1,1,0,2,1,-1, 1};
        System.out.println(majorityElement(arr));
    }

    private static int majorityElement(int[] arr){
        int n=arr.length;
        int count=0;
        int num=arr[0];
        for (int j : arr) {
            if (count == 0) {
                num = j;
            }
            if (j == num) {
                count++;
            }
            if (j != num) {
                count--;
            }
        }
        return num;
    }
}
