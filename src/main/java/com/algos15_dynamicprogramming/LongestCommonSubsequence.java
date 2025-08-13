package com.algos15_dynamicprogramming;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "forabfffcgx";
        System.out.println(getLongestCommonSubsequenceString(str1,str1.length(),str2,str2.length()));
    }

    private static int getLongestCommonSequenceByRecursion(String str1, int m,String str2,int n) {
        if(m==0 || n==0)
            return 0;
        if((str1.charAt(m-1)+"").equals(str2.charAt(n-1)+"")){
            return 1+getLongestCommonSequenceByRecursion(str1,m-1,str2,n-1);
        } else {
            return Math.max(getLongestCommonSequenceByRecursion(str1,m-1,str2,n)
                    ,getLongestCommonSequenceByRecursion(str1,m,str2,n-1));
        }
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

    static int [] [] getLongestCommonSubsequenceMatrix(String str1, int m,String str2,int n) {
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
        return t ;
    }
    public static String getLongestCommonSubsequenceString(String s1, int m, String s2, int n) {
        int[][] t = LongestCommonSubsequence.getLongestCommonSubsequenceMatrix(s1,  m,  s2,  n);
        String ret_str = "";
        int i=m,j=n;
        int element = t[m][n];
        while(i>0 && j>0){
            if(t[i-1][j]==t[i][j-1] && element > t[i-1][j-1]){
                ret_str = ret_str + s1.charAt(i-1);
                element = t[i-1][j];
                i--;
                j--;
            }else {
                if(t[i-1][j]>t[i][j-1])i--;
                else j--;
            }
        }
        return new StringBuilder(ret_str).reverse().toString();
    }
}
