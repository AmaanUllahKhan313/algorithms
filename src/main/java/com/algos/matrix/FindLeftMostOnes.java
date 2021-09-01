package com.algos.matrix;

public class FindLeftMostOnes {

    public static void main(String[] args) {

        int arr [] [] ={{0, 0, 0, 1, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0}};

        int leftRowIndex=0;
        int leftColumnIndex=0;
        for (int i = 0; i <arr.length; i++) {
            int leftindex=0;
            int midIndex = arr.length/2;
            int rightindex=arr.length;
            while (arr[i][midIndex]!=1 && leftindex==rightindex) {
                if(arr[i][midIndex]>1){
                    midIndex=rightindex;
                    leftindex=midIndex+1;
                    rightindex=arr.length;
                } else {
                    midIndex=midIndex/2;
                    leftindex=0;
                    rightindex=midIndex;
                }
            }
            leftColumnIndex=leftindex;
            leftRowIndex=i;

        }
        System.out.println("leftmost one is at : "+ leftRowIndex +", "+ leftColumnIndex);

    }
}
