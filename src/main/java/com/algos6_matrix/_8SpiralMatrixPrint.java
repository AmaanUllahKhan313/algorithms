package com.algos6_matrix;

import java.util.ArrayList;
import java.util.List;

public class _8SpiralMatrixPrint {
    public static void main(String[] args) {
        int [][] arr = {
                { 1, 2, 3, 4 },
                { 11,12,13,4 },
                { 10,15,14,5 },
                { 9, 8, 7, 6 },
        };
        printSpiralMatrix(arr).stream().forEach(System.out::println);
    }
    private static List<Integer> printSpiralMatrix(int[][] arr) {
        List<Integer> result = new ArrayList<>();
        int rowStart = 0;
        int colStart=0;
        int rowEnd=arr.length-1;
        int colEnd=arr[0].length-1;
        int matrixSize = arr.length*arr[0].length;
        while (rowStart<=rowEnd&&rowStart<=colEnd){
            for (int i = colStart; i <= colEnd && result.size()<matrixSize; i++) {
                result.add(arr[rowStart][i]);
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd && result.size()<matrixSize; i++) {
                result.add(arr[i][colEnd]);
            }
            colEnd--;
            for (int i = colEnd; i >= colStart && result.size()<matrixSize; i--) {
                result.add(arr[rowEnd][i]);
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowStart && result.size()<matrixSize; i--) {
                result.add(arr[i][colStart]);
            }
            colStart++;
        }
        return  result;
    }
}
