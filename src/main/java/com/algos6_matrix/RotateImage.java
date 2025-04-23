package com.algos6_matrix;

import java.util.Arrays;
import java.util.stream.Stream;

public class RotateImage {
    public static void main(String[] args) {
        int arr [] [] ={{1, 2, 3, 4},
                        {6, 0, 0, 0},
                        {7, 0, 0, 0},
                        {8, 0, 0, 0}};
        Stream.of(arr).map(Arrays::toString).forEach(System.out::println);
        System.out.println("After Rotate:");
        rotateLeft(arr);
        Stream.of(arr).map(Arrays::toString).forEach(System.out::println);

    }

    private static void rotateLeft(int[][] arr) {
        //left rotate change sequence if you want to right rotate
        reverse(arr);
        transpose(arr);
    }
    private static void reverse(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            int k = 0;
            int l = arr[i].length-1;
            while (k<l){
                int temp = arr[i][k];
                arr[i][k]=arr[i][l];
                arr[i][l]=temp;
                k++;
                l--;
            }
        }
    }
    private static void transpose(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
}
