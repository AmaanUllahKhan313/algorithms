package com.algos1_arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LargestNumberFromNumber {
    public static void main(String[] args) {
        System.out.println(getLargestNumberCanBeFormed(642798));
    }

    private static String getLargestNumberCanBeFormed(Integer n) {
        List<String> list = Arrays.asList(n.toString().split(""));
        String result = n.toString();
        if(n<0) {
            Collections.sort(list);
        } else {
            Collections.sort(list, Collections.reverseOrder());
        }
        return String.join("",list);
    }
}
