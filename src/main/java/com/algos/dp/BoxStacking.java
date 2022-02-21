package com.algos.dp;

import java.util.Arrays;
import java.util.Comparator;

public class BoxStacking {
    public static void main(String[] args) {
        int cuboids [] [] = {
                {7,11,17},
                {7,17,11},
                {11,7,17},
                {11,17,7},
                {17,7,11},
                {17,11,7}
        };
        System.out.println(maxHeight(cuboids));
    }

    public static int maxHeight(int[][] cuboids) {
        for(int[] cuboid : cuboids) {
            Arrays.sort(cuboid);
        }
        Arrays.sort(cuboids, (a, b) -> {
            if(a[0] != b[0]){
                return b[0] - a[0];
            }
            if(a[1] != b[1]) {
                return b[1] - a[1];
            }

            return b[2] - a[2];
        });
        int[] dp = new int[cuboids.length];
        int res = 0;
        for(int i = 0; i < cuboids.length; i++) {
            dp[i] = cuboids[i][2];
            for(int j = 0; j < i; j++) {
                if(cuboids[j][0] >= cuboids[i][0] && cuboids[j][1] >= cuboids[i][1] && cuboids[j][2] >= cuboids[i][2]) {
                    dp[i] = Math.max(dp[i], dp[j] + cuboids[i][2]);
                }
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
