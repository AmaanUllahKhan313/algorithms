package com.algos01_arrays;

public class MergeMPlusN {
    public static void main(String[] args) {
        int[] mPlusN = {1,-1,3,-1,5,-1,7,-1,9,-1};
        int[] n = {2,4,6,8,10};
        System.out.println("M + N:");
        for(int element:mPlusN) System.out.print(element+"\t");
        System.out.println("\nN:");
        for(int element:n) System.out.print(element+"\t");
        System.out.println("\nAfter merging the arrays: M+N :\n");
        if (mergeMPlusN(mPlusN, n)) {
            System.out.println("\nM + N:");
            for(int element:mPlusN) System.out.print(element+"\t");
        }else {
            System.out.println("Data insufficient");
        }
    }

    private static boolean mergeMPlusN(int[] mPlusN, int[] n) {
        bifurcateArray(mPlusN);
        int mIndex=n.length;
//        if(mIndex==mPlusN.length) return false ;
        int nIndex = 0;
        for (int i = 0; i < mPlusN.length; i++) {
            if (mIndex!=mPlusN.length && mPlusN[mIndex] < n[nIndex] ) {
                mPlusN[i] = mPlusN[mIndex];
                mIndex++;
            }else{
                mPlusN[i]=n[nIndex];
                nIndex++;
            }
        }
        return true;
    }

    private static void bifurcateArray(int[] mPlusN) {
            int size = mPlusN.length;
            int j = size - 1;
            for (int i = size - 1; i >= 0; i--)
                if (mPlusN[i] != -1)
                {
                    mPlusN[j] = mPlusN[i];
                    j--;
                }

//        int index = 0;
   /*     for (int i = 0; i < mPlusN.length; i++) {
            if(mPlusN[i]==-1){
                int temp = mPlusN[index];
                mPlusN[index] = mPlusN[i];
                mPlusN[i] = temp;
                index++;
            }
        }*/
//        Arrays.sort(mPlusN);
//        for (int element:mPlusN) System.out.print(element+"\t");
    }
}
