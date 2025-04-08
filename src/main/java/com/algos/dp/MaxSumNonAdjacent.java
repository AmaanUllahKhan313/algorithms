package com.algos.dp;

public class MaxSumNonAdjacent {
    public static void main(String args[]) {
        int arr[] = { 12, 9, 7, 33 };
        int n = arr.length;
        System.out.println( maxSum(arr, 0, n));
    }
    static int maxLen = 10;
    static int dp[] = new int[maxLen];
    static boolean v[] = new boolean[maxLen];
    static int maxSum(int arr[], int i, int n){
        if (i >= n) return 0;
        if (v[i]) return dp[i];
        v[i] = true;
        dp[i] = Math.max(maxSum(arr, i + 1, n),
                arr[i] + maxSum(arr, i + 2, n));
        return dp[i];
    }
}