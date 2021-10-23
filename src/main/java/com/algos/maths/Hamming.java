package com.algos.maths;

public class Hamming {
    public static void main(String[] args) {
        System.out.println(getHamming(4,8));
    }
    public static int getHamming(int x, int y){
        String xBinary =  String.format("%8s", Integer.toBinaryString(x));
        String yBinary =  String.format("%8s", Integer.toBinaryString(y));
        int counter = 0;
        int i = 0;
        while (i<8){
            if (xBinary.charAt(i)!=yBinary.charAt(i))
                counter++;
            i++;
        }
        return counter;
    }
}
