package com.algos8_strings;

import java.util.*;

public class _10WordBreak {
    private static Set<String> dictionary = new HashSet<>();
    public static void main(String[] args) {
        String temp_dictionary[] = {"mobile","samsung","sam","sung",
                "man","mango","icecream","and",
                "go","i","like","ice","cream"};
        for (String temp :temp_dictionary){
            dictionary.add(temp);
        }
        Map<String, Boolean> map = new HashMap<>(); // memoization
        System.out.println(wordBreak("samsungandmango",dictionary,map));
    }
    private static boolean wordBreak(String word,Set<String> dictionary, Map<String, Boolean> map) {
        if(map.containsKey(word)) return map.get(word);
        if (word.length() == 0)
            return true;
        for (int i = 1; i <= word.length(); i++){
            if (dictionary.contains(word.substring(0,i)) &&
                    wordBreak(word.substring(i,word.length()),dictionary,map)) {
                map.put(word.substring(0, i), true);
                return true;
            }
        }
        map.put(word, false);
        return false;
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        return memDFS(s, wordDict, new HashMap<String, List<String>>());
    }

    private List<String> memDFS(String s, List<String> wordDict, Map<String, List<String>> map) {
        if (map.containsKey(s)) return map.get(s);
        List<String> res = new ArrayList<>();

        for (String word : wordDict) {
            if (s.startsWith(word)) {
                if (word.length() == s.length()) {
                    res.add(word);
                    continue;
                }
                List<String> subList = memDFS(s.substring(word.length()), wordDict, map);
                for (String sub : subList) {
                    res.add(word + " " + sub);
                }
            }
        }
        map.put(s, res);
        return res;
    }
}
