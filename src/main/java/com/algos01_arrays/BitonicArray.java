package com.algos01_arrays;

public class BitonicArray {
    public static void main(String[] args) {
        int arr [] = {6, 7, 8, 11, 9, 5, 2, 1};
        bitonicPointInArray(arr);
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

    public static void bitonicPointInArray(int[] A) {
        int N = A.length;
        int i = 0;
        while (i+1 < N && A[i] <= A[i+1])
            i++;
        if (i == 0 || i == N-1)
            System.out.println("No bitonic point");
        else System.out.println("Bitonic point "+A[i]+" at "+i+"th Location");
    }
}
