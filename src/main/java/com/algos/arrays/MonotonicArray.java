package com.algos.arrays;

public class MonotonicArray {
    public static void main(String[] args) {
        int arr [] = {1,2,2,3};
        System.out.println(getMono(arr));
    }

    private static boolean getMono(int[] arr) {
        int store = 0 ;
        for (int i=0;i< arr.length-1;i++) {
            int c = Integer.compare(arr[i],arr[i+1]);
            if (c!=0){
                if (c!=store && store!=0)
                    return false;
                store=c;
            }
        }
        return true;
    }
}
