package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Arr14 {
    public static void main(String[] args) {
        int[] arr= {5,3,2,4,1};
        System.out.println(countInversion(arr));
        System.out.println(Arrays.toString(arr));
    }
    private static int countInversion(int[] arr){
        int n=arr.length;
        return dac(arr, 0, arr.length-1);
    }
    private static int dac(int[] arr, int low, int high){
        if(low==high)
            return 0;
        int mid=(low+high)/2;
        int[] temp=new int[high-low+1];
        int count=0;
        count+=dac(arr, low, mid);
        count+=dac(arr, mid+1, high);
        int i=low;
        int j=mid+1;
        int idx=0;
        while(i<=mid && j<=high){
            if(arr[i]>arr[j]){
                temp[idx]=arr[j];
                count += (mid - i + 1);
                j++;
            }else{
                temp[idx]=arr[i];
                i++;
            }
            idx++;
        }
        while(j<=high){
            temp[idx]=arr[j];
            idx++;
            j++;
        }
        while(i<=mid){
            temp[idx]=arr[i];
            i++;
            idx++;
        }
        for (int l = 0; l < temp.length; l++) {
            arr[low + l] = temp[l];
        }
        return count;

    }

}
