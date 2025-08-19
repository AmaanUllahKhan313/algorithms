package com.algos15_dynamicprogramming;

public class _07EditDistanceToMatchStrings {
    public static void main(String[] args) {
        String str1 = "Saturday";
        String str2 = "Sunday";
        System.out.println(getEditDistanceCount(str1,str2,str1.length(),str2.length()));
    }

    private static int getEditDistanceCount(String str1, String str2, int m, int n) {
        if(m==0) return n;
        if(n==0) return m;
        if(str1.charAt(m-1)==str2.charAt(n-1))
            return getEditDistanceCount(str1,str2,m-1,n-1);
        return 1+Math.min(Math.min(getEditDistanceCount(str1,str2,m,n-1)
                , getEditDistanceCount(str1,str2,m-1,n))
                ,getEditDistanceCount(str1,str2,m-1,n-1));


    }
}
