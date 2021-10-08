package com.algos.dp;

public class SequencePatternMatching {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "axbyc"; //abc
        boolean isPatterPresent = isSequencePatternPresent(s1,s2);
        System.out.println("Is Sequence present: "+isPatterPresent);
    }

    public static boolean isSequencePatternPresent(String s1, String s2) {
        String lcs = LongestCommonSubsequence.getLongestCommonSubsequenceString(s1,s1.length(),s2,s2.length());
        if(lcs.length()==s1.length())return true;
        return false;
    }
}
