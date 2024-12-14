package Recursion;

public class Noofsteps {
    public static void main(String[] args) {
        int n = 14;
        int ans = stp(n);
        System.out.println(ans);
    }
    static int steps =0;
    public static int stp(int n){
        if(n==0){
            return steps;
        }
        if(n%2==0){
            n= n/2;
            steps++;
        }
        else{
            n=n-1;
            steps++;
        }
        return stp(n);
    }

//    public int numberOfSteps(int num) {
//        return helper( num ,0);
//    }
//    private int helper(int num , int steps){
//        if(num==0){
//            return steps;
//        }
//        if(num%2==0){
//            return helper(num/2,steps+1);
//        }
//        return helper(num-1,steps+1);
//    }
}
