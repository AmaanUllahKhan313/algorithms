package com.algos1_arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class UniqueChar {

    public static void main(String[] args) {
        String str1 = "Amaan";
        String str2 = "Khan";
        //using set
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str1.length(); i++) {
            set.add(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            if(!set.add(str2.charAt(i))){
                System.out.println(str2.charAt(i));
            };
        }
        //without using set
        int [] lastIndex = new int[256];
        Arrays.fill(lastIndex,-1);
        for (int i = 0; i < str1.length(); i++) {
            lastIndex[str1.toLowerCase().charAt(i)] +=  1;
        }
        System.out.println(IntStream.of(lastIndex).filter(x->x==0).count());
    }
}
