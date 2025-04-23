package com.algos8_strings;

public class InterleavingStrings {

    public static void main(String[] args) {
        System.out.println(isInterleaved("XXY",0,"XXZ",0,"","XXZXXXY"));
    }

    private static boolean isInterleaved(String s1, int i, String s2, int j, String res, String s3) {
        if (res.equals(s3)&&i==s1.length()&&j==s2.length())
            return true;
        boolean ans = false;
        if (i<s1.length())
            ans |= isInterleaved(s1,i+1,s2,j,res+s1.charAt(i),s3);
        if (j<s2.length())
            ans |= isInterleaved(s1,i,s2,j+1,res+s2.charAt(j),s3);
        return ans;
    }
}
