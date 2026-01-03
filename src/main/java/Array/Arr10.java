package Array;

public class Arr10 {
    public static void main(String[] args) {
        int[] arr={1,-2,5,-4,5,8,-2,7,-10};
        System.out.println(kadan(arr));
    }
    private static int kadan(int[] arr){
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for (int j : arr) {
            sum += j;
            maxSum = Integer.max(sum, maxSum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
