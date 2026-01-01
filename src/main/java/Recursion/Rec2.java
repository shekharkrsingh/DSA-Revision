package Recursion;

import java.util.Scanner;

public class Rec2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int sum=func(a);
        System.out.println(sum);
    }
    private static int func(int a) {
        if(a==1){
            return a;
        }
        return func(a-1)+a;
    }
}
