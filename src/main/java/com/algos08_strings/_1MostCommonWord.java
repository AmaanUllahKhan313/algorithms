package com.algos08_strings;

import java.util.*;

public class _1MostCommonWord {
    public static void main(String[] args) {
        System.out.println(mostCommonWord("hello all hello all hello I am back I am back back".split(" "),
                new String[]{"hello"}));
    }
    public static String mostCommonWord(String words [], String[] banned) {
        Set<String> bannedWords = new HashSet<>();
        for (String word : banned)
            bannedWords.add(word);

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!bannedWords.contains(word))
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return Collections.max(wordCount.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
