import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr={1,2,5,4,8,2,5,4,7,8,5,2,6,5,8,4,9,5,8,7,5,2,1,3,0,2,5,4};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    private static int[] selectionSort(int[] arr){
        int n=arr.length;
        int idx;
        for(int i=0;i<n;i++) {
            idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
