package com.algos.dp;

public class HitAndRun {
    public static void main(String[] args) {
        int runs [] = {1,2,4,6};
        int target = 4;
        System.out.println(getScore(runs,target));
    }

    private static int getScore(int[] runs, int target) {
        int [] dp  = new int[target+1];
        dp[0]=1;
        for (int i = 1; i < dp.length ; i++) {
            for (int j = 0; j < runs.length; j++) {
                if (i-runs[j]>=0)
                    dp[i]+=dp[i-runs[j]];
            }
        }
        return dp[target];
    }
}
