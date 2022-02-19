package com.algos.strings;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {
    private static Set<String> dictionary = new HashSet<>();
    public static void main(String[] args) {
        String temp_dictionary[] = {"mobile","samsung","sam","sung",
                "man","mango","icecream","and",
                "go","i","like","ice","cream"};
        for (String temp :temp_dictionary){
            dictionary.add(temp);
        }
        System.out.println(wordBreak("samsungandmango"));
    }
    private static boolean wordBreak(String word) {
        int size = word.length();
        if (size == 0)
            return true;
        for (int i = 1; i <= size; i++){
            if (dictionary.contains(word.substring(0,i)) &&
                    wordBreak(word.substring(i,size)))
                return true;
        }
        return false;
    }
}
