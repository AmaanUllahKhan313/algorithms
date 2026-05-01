package com.algos01_arrays;

public class Largest01SubArray {
    public static void main(String[] args) {
        int[]  a = {1,1,0,0,1,1,1,1,1,0,0,0,0,1};
        printLargestSubarray(a);
    }

    private static void printLargestSubarray(int[] arr) {
        int sum = 0;
        int maxsize = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            sum = (arr[i] == 0) ? -1 : 1;
            for (int j = i + 1; j < arr.length; j++) {
                sum = arr[j] == 0?sum-1:sum+1;
                if (sum == 0){
                    maxsize = Math.max(maxsize, j - i + 1);
                }
            }
        }
        System.out.println(maxsize);
    }
}
