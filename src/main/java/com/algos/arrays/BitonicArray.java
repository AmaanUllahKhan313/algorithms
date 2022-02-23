package com.algos.arrays;

public class BitonicArray {
    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 4, 3, 1, 0};
        System.out.println(validBitonicArray(arr));
    }
    public static boolean validBitonicArray(int[] A) {
        int N = A.length;
        int i = 0;
        while (i+1 < N && A[i] <= A[i+1])
            i++;
        if (i == 0 || i == N-1)
            return false;
        while (i+1 < N && A[i] >= A[i+1])
            i++;
        return i == N-1;
    }
}
