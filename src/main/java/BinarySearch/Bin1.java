package BinarySearch;

public class Bin1 {
    public static void main(String[] args) {
        int[] arr= {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int target=-10;
        System.out.println(rotateSortedArray(arr, 0, arr.length-1, target));
    }
    private static int rotateSortedArray(int[] arr, int low, int high, int target){
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<=arr[high]){
            if(target>arr[mid] && target<=arr[high]) {
                return rotateSortedArray(arr, mid + 1, high, target);
            }else{
                return rotateSortedArray(arr, low, mid-1, target);
            }
        }else{
            if(target>arr[low] && target<=arr[mid]) {
                return rotateSortedArray(arr, low, mid-1, target);
            }else{
                return rotateSortedArray(arr, mid+1, high, target);
            }
        }
    }
}
