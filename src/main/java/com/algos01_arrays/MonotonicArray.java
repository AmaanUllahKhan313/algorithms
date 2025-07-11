package com.algos01_arrays;

public class MonotonicArray {
    public static void main(String[] args) {
        int arr [] = {1,2,2,3,1};
        System.out.println(getMono(arr));
    }

    private static boolean getMono(int[] A) {
        int i = 0;
        while (i+1 < A.length && A[i] <= A[i+1])
            i++;
        return i == A.length;
    }
}
