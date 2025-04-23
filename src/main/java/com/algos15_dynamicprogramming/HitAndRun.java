package com.algos15_dynamicprogramming;

public class HitAndRun {
    public static void main(String[] args) {
        int runs [] = {1,2,4,6};
        int target = 4;
        System.out.println(getScore(runs,target));
    }

    private static int getScore(int[] runs, int target) {
        int t [] = new int[target+1];
        t[0] = 1;
        for (int i = 1; i < t.length; i++) {
            for (int j = 0; j < runs.length; j++) {
                if (i-runs[j]>=0)
                t[i] = t[i] + t[i-runs[j]];
            }
        }
        return t[target];
    }
}
