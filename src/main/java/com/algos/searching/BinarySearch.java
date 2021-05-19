package com.algos.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        System.out.println("Found:"+binarySearch(a,2));
    }

    private static boolean binarySearch(int[] a,int number) {
        int l =0 , r = a.length-1, mid = (l+r)/2;
        for(int i = 0; i < a.length;i ++){
            if(a[mid]==number)return true;
            else if(a[mid]>number){
                r = mid;
                mid = (l + mid)/2;
            }
            else {
                l = mid;
                mid = (mid + r)/2;
            }
        }
        return false;
    }
}
