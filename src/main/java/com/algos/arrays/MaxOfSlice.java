package com.algos.arrays;

public class MaxOfSlice {
    public static void main(String[] args) {
        int A [] = {3,4,2,6,4,0};
        int A1 [] = {-6,4,-2,3,-2,2};

        int maxEndingHere = A[0];
        int maxSoFar = A[0];
        for(int i = 1; i < A.length; i++){
            maxEndingHere = Math.max(A[i], maxEndingHere + A[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        System.out.println(maxSoFar);
    }
}