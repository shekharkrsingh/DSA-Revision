package Array;

import java.util.Arrays;

public class Arr5 {
    public static void main(String[] args) {
        int[] arr={3,0,53,4,4,0,5,4,3,3,3,4,5,6,0};
        int n=arr.length;
        int i=0;
        int j=0;
        while(j<n){
            if(arr[j]!=0){
                arr[i]=arr[j];
                i++;
            }
            j++;
        }
        while(i<n){
            arr[i]=0;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
