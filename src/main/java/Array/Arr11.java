package Array;

import java.util.Arrays;

public class Arr11 {
    public static void main(String[] args) {
        int[] arr={1, 2, 4, 4, 5};
        nextPer(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void nextPer(int[] arr){
        int n=arr.length;
        int firstDisConnect=-1;
        for(int i=n-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                firstDisConnect=i-1;
                break;
            }
        }
        if(firstDisConnect==-1){
            Arrays.sort(arr);
            return;
        }
        int smallestBiggest=firstDisConnect;
        for(int i=firstDisConnect+1;i<n;i++){
            if(arr[i]>arr[firstDisConnect]){
                smallestBiggest=i;
            }
        }
        int tem=arr[firstDisConnect];
        arr[firstDisConnect]=arr[smallestBiggest];
        arr[smallestBiggest]=tem;
        for(int i=firstDisConnect+1; i<(firstDisConnect+n)/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i+firstDisConnect];
            arr[n-i+firstDisConnect]=temp;
        }
    }
}
