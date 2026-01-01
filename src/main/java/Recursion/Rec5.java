package Recursion;

import java.util.Scanner;

public class Rec5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n=s.length();
        System.out.println(isPalindrome(s, n-1, 0));
    }

    private static boolean isPalindrome(String s, int n, int i){
        if(i>n/2){
            return true;
        }else
        if(s.charAt(i)!=s.charAt(n-i)){
            return false;
        }
        return isPalindrome(s,i+1,n-1);
    }
}
