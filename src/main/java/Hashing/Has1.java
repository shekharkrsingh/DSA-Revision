package Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class Has1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] hash=new int[27];
        int n=s.length();
        for(int i=0;i<n;i++){
            hash[s.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(hash));
    }
}
