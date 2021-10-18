package com.algos.arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {
        //A=[2,3,8], B=[1,2,3,5,7] Output: [1,2,3,5,7,8]
        int [] A ={2,3,8};
        int [] B ={1,2,3,5,7};
        int [] C = new int [A.length+B.length];
        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < C.length; i++) {
            if(A[indexA]==B[indexB]) {
                C[i] = A[indexA];
                indexA++;
                indexB++;
            } else
            if(A[indexA]>B[indexB]) {
                C[i] = B[indexB];
                indexB++;
            } else
            if(A[indexA]<B[indexB]) {
                C[i] = A[indexA];
                indexA++;
            }
            if(indexB >= B.length || indexA >= A.length){
                break;
            }
        }
        for (int i = 0; i < C.length; i++) {
            System.out.println(C[i]);
        }
    }
}
