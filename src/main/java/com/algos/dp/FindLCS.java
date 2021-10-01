package com.algos.dp;

public class FindLCS {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "forabfffcgx";
        System.out.println(getLCSOfTwoString(str1,str1.length(),str2,str2.length()));
        System.out.println(getLongestPalindrome(str1,str1.length(),new StringBuilder(str1).reverse()+"",str1.length()));
    }

    private static int getLCSOfTwoString(String str1, int m,String str2,int n) {
        if(m==0 || n==0)
            return 0;
        if((str1.charAt(m-1)+"").equals(str2.charAt(n-1)+"")){
            return 1+getLCSOfTwoString(str1,m-1,str2,n-1);

        } else {
            return Math.max(getLCSOfTwoString(str1,m-1,str2,n)
                    ,getLCSOfTwoString(str1,m,str2,n-1));
        }
    }
    private static int getLongestPalindrome(String str1, int m,String str2,int n) {
        int t[][]= new int [m+1][n+1];

        for(int i=1;i<=n;i++){
            for(int j = 1;j<=m;j++) {
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
