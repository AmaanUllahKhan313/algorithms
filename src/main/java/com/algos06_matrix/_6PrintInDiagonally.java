package com.algos06_matrix;

import java.util.ArrayList;

public class _6PrintInDiagonally {
    public static void main(String[] args) {
        int [][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
                { 17, 18, 19, 20 },
        };
        printOneWayDiagonal(arr);
    }

    private static void printOneWayDiagonal(int[][] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>(arr.length+arr[0].length-1);
        for(int i = 0; i < arr.length+arr[0].length-1; i++){
            ans.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                (ans.get(i+j)).add(arr[i][j]);
            }
        }
        boolean reverse = true;
        for (int i = 0; i < ans.size(); i++){
            //only if wants to print in spiral mode
         /*   if(reverse) {
                Collections.reverse(ans.get(i));
            }*/
            for (int j = ans.get(i).size() - 1; j >= 0; j--){
                System.out.print(ans.get(i).get(j)+ " ");
            }
            System.out.println();
            reverse = !reverse;
        }
    }
}
