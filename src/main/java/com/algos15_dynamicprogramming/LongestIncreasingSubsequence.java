package com.algos15_dynamicprogramming;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println(getLIS(new int [] {10, 22, 9, 33, 21, 50, 41, 60}));
    }
    private static int getLIS(int[] ints) {
        int n = ints.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (ints[i] > ints[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return IntStream.of(dp).max().getAsInt();
    }
}
