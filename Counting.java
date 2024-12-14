package Recursion;

public class Counting {
    public static void main(String[] args) {
        int n = 5;
        count(n);

    }
    public static void count(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        count(n-1);
    }
}
