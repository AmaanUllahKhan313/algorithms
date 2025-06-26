package com.algos07_maths;

public class _11AddNumberWithoutUsingPlusOperator {
    public static void main(String[] args) {
        int  a = 1, b = 2;
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        System.out.println(a);
    }
}
