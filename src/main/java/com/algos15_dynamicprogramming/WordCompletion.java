package com.algos15_dynamicprogramming;

public class WordCompletion {
    public static void main(String[] args) {
        System.out.println(canComplete("butl","beautiful"));
    }

    private static boolean canComplete(String str1, String str2) {
        return str1.length()==getLCSCount(str1,str1.length(),str2,str2.length());
    }

    public static int getLCSCount(String str1,int m, String str2,int n) {
        int [] [] dp = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i-1)==str2.charAt(j-1))
                    dp[i][j] = 1+dp[i-1][j-1];
                else  dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[m][n];
    }
}
