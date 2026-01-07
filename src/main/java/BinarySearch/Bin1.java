package BinarySearch;

public class Bin1 {
    public static void main(String[] args) {
        int[] arr={3,5,8,15,19};
        System.out.println(lowerBound(arr, 0, arr.length-1, 15));
    }
    private static int lowerBound(int[] arr, int low, int high, int target){
        int left;
        int right;
        if(low>high){
            left=Math.abs(target-arr[low]);
            right=Math.abs(target-arr[high]);
            return left<right?arr[low]:arr[high];
        }
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            left=Math.abs(target-arr[mid-1]);
            right=Math.abs(target-arr[mid+1]);
            return left<right?arr[mid-1]:arr[mid+1];
        }
        if(arr[mid]>target){
            return lowerBound(arr, low, mid-1, target);
        }else{
            return lowerBound(arr, mid+1, high, target);
        }
    }
}
