package com.algos04_slidingwindow;

import java.util.Arrays;

public class _2CountAllAnagrams {
    public static void main(String[] args) {
        System.out.println(countAllAnagramOfWordFromText("for","forxxorfxdofr"));
    }

    private static int countAllAnagramOfWordFromText(String word, String text) {
        int count = 0;
        for (int i = 0; i <= text.length()-word.length(); i++) {
            count+=isAnagram(word,text.substring(i,i+word.length()))?1:0;
        }
        return count;
    }
    static boolean isAnagram(String s1, String s2){
        char [] ch1 = s1.toCharArray();
        char [] ch2= s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return new String(ch1).equals(new String(ch2));
    }
}
