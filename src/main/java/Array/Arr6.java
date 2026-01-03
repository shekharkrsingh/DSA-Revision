package Array;

import java.util.Arrays;

public class Arr6 {
    public static void main(String[] args) {
        int[] arr={3,4,53,4,4,0,5,4,3,3,3,4,5,6,0};
        System.out.println(logSub1(arr, 18));
    }

    private static int logSub1(int[] arr, int target){
        int n=arr.length;
        int max=-1;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==target){
                    max=Integer.max(max, j-i+1);
                    break;
                }
                if(sum>target){
                    break;
                }
            }
        }
        return max;
    }

    private static int logSub2(int[] arr, int target){
        int n=arr.length;
        int max=-1;
        int sum=0;
        int i=0;
        int j=0;
        while(j<n){
            if(sum<target){
                sum+=arr[j];
                j++;
            }
            if(sum==target){
                max=Integer.max(j-i+1, max);
            }
            if(sum>target && i<j){
                sum-=arr[i];
                i++;
            }
        }

        return max;
    }
}
