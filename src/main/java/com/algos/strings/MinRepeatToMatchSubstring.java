package com.algos.strings;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MinRepeatToMatchSubstring {

    public static void main(String[] args) {
        String repeatThisString = "abcd";
        String matchThisString = "cdabcdab";
        getMinCountOfRepeat(repeatThisString,matchThisString);
    }

    private static void getMinCountOfRepeat(String repeatThisString, String matchThisString) {
        boolean matchFound = false;
        int repeatation = 1;
        Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();
        Collections.addAll(set1, repeatThisString.chars().mapToObj(c -> (char) c).toArray(Character[]::new));
        Collections.addAll(set2, matchThisString.chars().mapToObj(c -> (char) c).toArray(Character[]::new));
        if (set1.size() != set2.size())
            System.out.println(-1);
        else {
            while (!matchFound) {
                if (repeatThisString.contains(matchThisString)) {
                    matchFound = true;
                    break;
                }
                repeatation++;
                repeatThisString += repeatThisString;
            }
            System.out.println(repeatation);
        }
    }
}
