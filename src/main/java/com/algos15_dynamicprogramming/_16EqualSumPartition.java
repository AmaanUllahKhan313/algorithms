package com.algos15_dynamicprogramming;

public class _16EqualSumPartition {
    public static void main(String[] args) {
        System.out.println(getEqualSumPartition(new int []{1,5,11,5}));
    }

    private static boolean getEqualSumPartition(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum+=ints[i];
        }
        return sum%2==0
                ? _19IsSubsetPresentOfGivenSum.getSubset(ints,sum/2)
                :false;
    }
}
