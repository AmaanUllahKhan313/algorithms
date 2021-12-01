package com.algos.dp;

public class WordCompletion {
    public static void main(String[] args) {
        System.out.println(canComplete("tulb","beautiful"));
    }
    private static boolean canComplete(String s1,String s2) {
        return s1.length()==getLongestCommonSubsequenceCount(s1,s1.length(),s2,s2.length());
    }
    static int getLongestCommonSubsequenceCount(String str1, int m, String str2, int n) {
        int t[][]= new int [m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j = 1;j<=n;j++) {
                if((str1.charAt(i-1)+"").equals(str2.charAt(j-1)+"")){
                    t[i][j] = 1+t[i-1][j-1];
                }else{
                    t[i][j] = Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
        return t[m][n];
    }
}
