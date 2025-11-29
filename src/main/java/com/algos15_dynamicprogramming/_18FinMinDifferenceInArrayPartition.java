package com.algos15_dynamicprogramming;

import java.util.IntSummaryStatistics;

import static com.algos15_dynamicprogramming._16IsSubsetPresentOfGivenSum.getSubsetMatrix;

public class _18FinMinDifferenceInArrayPartition {

    public static void main(String[] args) {
        int [] a = {5,12,0,1};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        int maxDiff= sum/2;
        boolean [][] t = getSubsetMatrix(a,sum);
        for (int k = maxDiff; k >= 0; k--)
        {
            if (t[a.length][k] == true)
            {
                System.out.println(sum - k - k);
                break;
            }
        }

    }
 /*   1 2 3 4 5 6 7 8 9     14
   4
   2
   8       t f t t


            s1-s2 =dif;
            s1+s2 = total;
            s1 = diff-total/2 =

14 - 8 - 6 = 2
    total - 2 * 3 = diff
    14 -2 *6 = 2*/

}
