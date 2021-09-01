package com.algos.maths;

public class Hamming {
    public static void main(String[] args) {

    }
    public static int getHamming(int x, int y){
        int count = Integer.toBinaryString(x).toCharArray().length-1;
        int counter = 0;
        while (count>=0){
            if (x + "".getBytes()[count] != x + "".getBytes()[count]) counter++;
            count--;
        }
        return counter;
    }
}
