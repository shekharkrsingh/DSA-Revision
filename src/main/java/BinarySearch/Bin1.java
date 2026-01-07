package BinarySearch;

public class Bin1 {
    public static void main(String[] args) {
        int[] arr= {6, 8, 9, 1, 6, 3, 4, 5, 6};
        int target=9;
        System.out.println(rotateSortedArray(arr, 0, arr.length-1, target));
        System.out.println(rotateSortedArrayWithDuplicates(arr, 0, arr.length-1, target));
    }
    private static int rotateSortedArray(int[] arr, int low, int high, int target){
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        //finding the sorted part and then adding the condition based on that
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
    private static boolean rotateSortedArrayWithDuplicates(int[] arr, int low, int high, int target){
        if(low>high){
            return false;
        }
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            return true;
        }
        //shrinking the search boundary
        if(arr[low]==arr[mid] && arr[mid]==arr[high]){
            low++;
            high--;
        }
        if(arr[mid]<=arr[high]){
            if(target>arr[mid] && target<=arr[high]) {
                return rotateSortedArrayWithDuplicates(arr, mid + 1, high, target);
            }else{
                return rotateSortedArrayWithDuplicates(arr, low, mid-1, target);
            }
        }else{
            if(target>arr[low] && target<=arr[mid]) {
                return rotateSortedArrayWithDuplicates(arr, low, mid-1, target);
            }else{
                return rotateSortedArrayWithDuplicates(arr, mid+1, high, target);
            }
        }
    }
}
