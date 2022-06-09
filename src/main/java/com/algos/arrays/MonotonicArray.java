package com.algos.arrays;

public class MonotonicArray {
    public static void main(String[] args) {
        int arr [] = {1,2,2,3,1};
        System.out.println(getMono(arr));
    }

    private static boolean getMono(int[] A) {
        int N = A.length;
        int i = 0;
        while (i+1 < N && A[i] <= A[i+1])
            i++;
        return i == N-1;
    }
}
