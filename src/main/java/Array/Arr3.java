package Array;

public class Arr3 {
    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,3,4,5,6,7,8};
        System.out.println(sorted1(arr));
        System.out.println(sorted2(arr));
    }
    private static boolean sorted1(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean sorted2(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
