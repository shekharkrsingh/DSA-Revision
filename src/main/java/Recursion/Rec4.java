package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Rec4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        reverser(arr, 0, 4);
        Arrays.stream(arr).forEach(i-> System.out.print(i+" "));
    }

    private static void reverser(int[] arr, int i, int j){
        if(i>=j){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        reverser(arr, i+1, j-1);
    }
}
