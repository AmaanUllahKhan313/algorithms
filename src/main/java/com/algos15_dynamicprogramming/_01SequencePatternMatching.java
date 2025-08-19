package com.algos15_dynamicprogramming;

public class _01SequencePatternMatching {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "axbyc"; //abc
        System.out.println("Is Sequence present: "+isSequencePatternPresent(s1,s2));
    }

    public static boolean isSequencePatternPresent(String s1, String s2) {
        return s1.length() == _01LongestCommonSubsequence
                .getLongestCommonSubsequenceCount(s1,s1
                        .length(),s2,s2.length());
    }
}
