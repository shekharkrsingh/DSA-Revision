package Recursion;

public class Rec1 {
    public static void main(String[] args) {
        int a=10;
        func(a);
    }

    private static void func(int a){
        if(a<0)
            return;
        System.out.println(a);
        func(--a);
    }
}
