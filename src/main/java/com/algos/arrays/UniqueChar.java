package com.algos.arrays;

import java.util.HashSet;
import java.util.Set;

public class UniqueChar {

    public static void main(String[] args) {
        String str1 = "Amaan";
        String str2 = "Khan";

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str1.length(); i++) {
            set.add(str1.charAt(i));
        }

        for (int i = 0; i < str2.length(); i++) {
            if(!set.add(str2.charAt(i))){
                System.out.println(str2.charAt(i));
            };
        }
    }
}
