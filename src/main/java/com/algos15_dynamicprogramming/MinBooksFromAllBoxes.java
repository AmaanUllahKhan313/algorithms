package com.algos15_dynamicprogramming;

public class MinBooksFromAllBoxes {
    public static void main(String[] args) {
        int boxes [] = {1,5,3,1,2};
        System.out.println(getMinBooksFromBoxes(boxes));
    }

    private static int getMinBooksFromBoxes(int[] boxes) {
        if (boxes.length==1)
            return boxes[0];
        int sum1 = boxes[0];
        int sum2 = 0;
        for (int i = 2; i < boxes.length; i+=2) {
            sum1+=boxes[i];
            sum2+=boxes[i-1];
        }
        return Math.min(sum1,sum2);
    }
}
