package com.algos15_dynamicprogramming;

public class ShortestCommonSuperSequence {
    public static void main(String[] args) {
        //        String s1 = "AGGTAB";
        //        String s2 = "GXTXAYB";
        String s1 = "acbcf";
        String s2 = "abcdaf";
        int count = getShortestCommonSuperSequence(s1,s1.length(),s2,s2.length());
        System.out.println("Shortest Common Super Sequence:"+count);
    }

    private static int getShortestCommonSuperSequence
            (String s1, int m, String s2, int n) {
        return m+n-LongestCommonSubsequence.getLongestCommonSubsequenceCount(s1,
                s1.length(),s2,s2.length());
    }

    public static String printShortestCommonSupersequence(String s1,int m,String s2, int n) {
        int[][] t = LongestCommonSubsequence.getLongestCommonSubsequenceMatrix(s1,  m,  s2,  n);
        String ret_str = "";
        int i=m,j=n;
        while(i>0 ||j>0){
            if(t[i-1][j]==t[i][j-1] ){
                ret_str = ret_str + s1.charAt(i-1);
                i--;
                j--;
            }else {
                if(t[i-1][j]>t[i][j-1]){
                    ret_str = ret_str + s1.charAt(i-1);
                    i--;
                }
                else {
                    ret_str = ret_str + s2.charAt(j-1);
                    j--;
                }
            }
        }
        return new StringBuilder(ret_str).reverse().toString();
    }
}
