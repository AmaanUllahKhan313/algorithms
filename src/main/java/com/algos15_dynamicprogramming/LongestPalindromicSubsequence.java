package com.algos15_dynamicprogramming;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        String s = "agbcbfea"; //lcs : abcba
        int length = getLongestPalindromicSubsequence(s);
        System.out.println("Length is :"+length);
    }

    public static int getLongestPalindromicSubsequence(String s) {
        return LongestCommonSubsequence.getLongestCommonSubsequenceCount(s,s.length(),new StringBuilder(s).reverse()
                .toString(),s.length());
    }
}
