package Recursion;

import java.util.*;

//public class Linearsearch {
//    public static void main(String[] args) {
//       int[] arr = {1,4,6,10,2,4,56,78};
//       int target = 4;
//        System.out.println(find(arr,target,0));
//        System.out.println(findIndex(arr,target,0));
//        //findallIndex(arr,target,0);
//        //System.out.println(list);
//        System.out.println(LIST(arr,target,0,list));
//
//    }
//
//    static boolean find(int[] arr,int target, int index){
//        if(index==arr.length){
//            return false;
//        }
//        return arr[index]==target || find(arr,target,index+1);
//    }
//    static int findIndex(int[] arr , int target , int index){
//        if(index == arr.length){
//            return -1;
//        }
//        if(arr[index]==target){
//            return index;
//        }
//        return findIndex(arr,target,index+1);
//    }
//    static ArrayList<Integer> list = new ArrayList<>();
//    static void findallIndex(int[] arr , int target , int index){
//        if(index == arr.length){
//            return;
//        }
//        if(arr[index]==target){
//            list.add(index);
//        }
//        findallIndex(arr,target,index+1);
//    }
//    static ArrayList<Integer> LIST(int[] arr , int target , int index,ArrayList<Integer> list){
//        if(index == arr.length){
//            return list;
//        }
//        if(arr[index]==target){
//            list.add(index);
//        }
//        return LIST(arr,target,index+1,list);
//    }
//}
class Solution {
    public static void main(String[] args) {
        int[] arr = {12,4,5,7,89,9};
        System.out.println(search(arr,4));
    }

    static public int search(int[] nums, int target) {
        int start = nums[0];
        int end = nums.length - 1;
        if (start < end) {
            int m = start + (end - start) / 2;
            if (m == target) {
                return m;
            }
            if (nums[m] < target) {
                start = m + 1;
            } else {
                end = m - 1;
            }

        }
        return -1;
    }
}

