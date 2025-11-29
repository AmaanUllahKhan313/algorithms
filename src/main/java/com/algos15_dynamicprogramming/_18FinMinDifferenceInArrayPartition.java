package com.algos15_dynamicprogramming;

import java.util.IntSummaryStatistics;

import static com.algos15_dynamicprogramming._16IsSubsetPresentOfGivenSum.getSubsetMatrix;

public class _18FinMinDifferenceInArrayPartition {

    public static void main(String[] args) {
        int [] a = {5,12,0,1};
        int sum = 0;
        System.out.println(findMinimumDifferenceInArrayPartition(a, sum));
    }

    private static int findMinimumDifferenceInArrayPartition(int[] a, int sum) {
        for (int i = 0; i < a.length; i++)
            sum += a[i];
        int maxDiff = sum /2;
        int minDiff = 0;
        boolean [][] t = getSubsetMatrix(a, sum);
        for (int k = maxDiff; k >= 0; k--) {
            if (t[a.length][k] == true) {
                minDiff = sum - k - k;
                break;
            }
        }
        return minDiff;
    }
}
