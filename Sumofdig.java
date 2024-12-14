package Recursion;

public class Sumofdig {
    public static void main(String[] args) {
        int n = 1234;
        int ans = sum(n);
        System.out.println(ans);
    }
    public static int sum(int n){
        if(n%10==n){
            return n ;
        }
        return (n%10)+sum(n/10);
    }
}
