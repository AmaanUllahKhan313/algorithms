package com.algos.dp;

public class ClimbingStaircase {
    public static void main(String[] args) {
        int stairCase  = 5;
        System.out.println(climbStairs(stairCase));
    }
    private static int countPossibleWaysToClimbStairCase(int stairCase) {
        if (stairCase==0)
            return 0;
        if (stairCase==1)
            return 1;
        if (stairCase==2)
            return 2;
        return countPossibleWaysToClimbStairCase(stairCase-1)
                + countPossibleWaysToClimbStairCase(stairCase-2);
    }
    public static int climbStairs(int n) {
        if (n <= 1)
            return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
