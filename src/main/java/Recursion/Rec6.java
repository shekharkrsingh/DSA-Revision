package Recursion;

import java.util.Scanner;

public class Rec6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(fib(n));
    }

    private static int fib(int n){
        if(n==1)
            return 0;
        if(n==2)
            return 1;
        return fib(n-1)+fib(n-2);
    }
}
