package com.algos7_maths;

public class StringToInteger {
    public static void main(String[] args) {
        String str = "123";
        int res = 0;
        for (int i = 0; i < str.length(); ++i)
            res = res * 10 + str.charAt(i) - '0';
        System.out.println(res);
    }
}
