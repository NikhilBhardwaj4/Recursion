package Recursion;

public class Bs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,58,66,78};
        int target = 88;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr , int target , int s , int e){
        if(s>e) return -1;
        int m = s + (e-s)/2;
        if(target==arr[m]) return m;
        if(target>arr[m]){
            return search(arr,target,m+1,e);
        }
        return search(arr,target,s,m-1);
    }
}
