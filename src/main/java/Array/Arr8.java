package Array;

import java.util.Arrays;

public class Arr8 {
    public static void main(String[] args) {
        int[] arr= {1,1,0,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr){
        int n=arr.length;
         int start=0;
         int mid=0;
         int end=n-1;
         while(mid<end){
             if(start<=mid &&arr[mid]==0){
                 int temp=arr[mid];
                 arr[mid]=arr[start];
                 arr[start]=temp;
                 start++;
                 continue;
             }
             if(arr[mid]==2){
                 int temp=arr[mid];
                 arr[mid]=arr[end];
                 arr[end]=temp;
                 end--;
                 continue;
             }
             mid++;
         }
    }
}
