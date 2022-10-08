package com.algos.maths;

public class Hamming {
    public static void main(String[] args) {
        System.out.println(getHamming(680142203,
                1111953568));
    }
    public static int getHamming(int x, int y){
        int xor = x ^ y, count = 0;
        for (int i=0;i<32;i++) count += (xor >> i) & 1;
        return count;
    }
}
