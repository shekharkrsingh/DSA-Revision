package Array;

import java.util.*;

public class Arr7 {
    public static void main(String[] args) {
        int[] arr={3,4,53,4,4,0,5,4,3,5,6,0};
        System.out.println(twoSum(arr, 10));
        System.out.println(twoSum2(arr, 10));
        System.out.println(twoSum3(arr, 10));
    }

    private static boolean twoSum(int[] arr, int target){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean twoSum2(int[] arr, int target){
        int n=arr.length;
        Set<Integer> set= new HashSet<>();
        for (int j : arr) {
            if (set.contains(target - j)) {
                return true;
            } else {
                set.add(j);
            }
        }
        return false;
    }
    private static boolean twoSum3(int[] arr, int target){
        int n=arr.length;
        Arrays.sort(arr);
        int start=0;
        int end=n-1;
        while(start<end){
            if(arr[start]+arr[end]==target){
                return true;
            }
            if(arr[start]+arr[end]<target){
                start++;
            }else{
                end--;
            }
        }
        return false;
    }
}
