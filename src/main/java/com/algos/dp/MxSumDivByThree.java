package com.algos.dp;

import java.util.Arrays;

public class MxSumDivByThree {
    public static void main(String[] args) {
        System.out.println(maxSumDivThree(new int [] {3,6,5,1,8}));
    }
    public static int maxSumDivThree(int[] A) {

        int[] dp = new int[3];
        for (int a : A)
            for (int i: Arrays.copyOf(dp, dp.length))
                dp[(i + a) % 3] = Math.max(dp[(i + a) % 3], i + a);
        return dp[0];
    }
}
