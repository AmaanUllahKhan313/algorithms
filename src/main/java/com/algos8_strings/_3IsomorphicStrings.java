package com.algos8_strings;

public class _3IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("title","cycle"));
    }

    private static boolean isIsomorphic(String str1, String str2) {
        int n = str1.length();
        if (str1.length()!=str2.length()) return false;
        int[] countChars1 = new int[256];
        int[] countChars2 = new int[256];
        for (int i = 0; i < n; i++) {
            countChars1[str1.charAt(i) - 'a']++;
            countChars2[str2.charAt(i) - 'a']++;
        }
        for(int i= 0; i < n; i++) {
            if (countChars1[str1.charAt(i) - 'a']
                    != countChars2[str2.charAt(i) - 'a']) {
                return false;
            }
        }
        return true;
    }
}
