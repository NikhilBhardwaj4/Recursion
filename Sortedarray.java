package Recursion;

public class Sortedarray {
    public static void main(String[] args) {
        int[] arr ={1,24,6,8};
        System.out.println(sorted(arr,0));

    }
    static boolean sorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
       if(arr[index]<arr[index+1]){
           return sorted(arr,index+1);
       }
       return false;
    }
}
