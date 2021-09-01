package com.algos.strings;

public class IsAnagram {
    public static void main(String[] args) {
        String s="ana";
        String t = "ana";
        isAnagram("anan","nana");
    }
    public static boolean isAnagram(String s, String t) {
        int j=t.length();
        for(int i=0;i<=s.length();i++){
            if(s.charAt(i) != t.charAt(j-1))
                return false;
            j--;
        }
        return true;

    }
}
