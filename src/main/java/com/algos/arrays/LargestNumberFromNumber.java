package com.algos.arrays;

import java.util.Arrays;
import java.util.Collections;

public class LargestNumberFromNumber {
    public static void main(String[] args) {
        System.out.println(getLargestNumberCanBeFormed(-642798));
    }

    private static String getLargestNumberCanBeFormed(Integer n) {
        Integer [] ints = new Integer[n>0?n.toString().length():n.toString().length()-1];
            int i=0;
            int abs = Math.abs(n);
        while (abs>0){
            ints[i]=abs%10;
            abs=abs/10;
            i++;
        }
        if (n > 0) {
            Arrays.sort(ints, Collections.reverseOrder());
        } else {
            Arrays.sort(ints);
        }
        String s = "";
        for (int j = 0; j < ints.length; j++) {
            s+=ints[j];
        }

        return s;
    }
}
