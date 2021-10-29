package com.algos.dp;

public class FinMinDifferenceInArrayPartition {

    public static void main(String[] args) {
        int [] a = {5,12,0,1};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        int maxDiff= sum/2;
        boolean [][] t = new boolean[a.length+1][maxDiff+1];
        for (int i = 0; i <= a.length; i++)
            t[i][0] = true;
        for (int i = 1; i <= maxDiff; i++)
            t[0][i] = false;

        for(int i =1 ;i<=a.length;i++){
            for(int j = 1;j<=maxDiff;j++){
                if(a[i-1]<=j){
                    t[i][j]=t[i-1][j] || t[i-1][j-a[i-1]];
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        for(int i =0;i<=a.length;i++){
            for(int j=0;j<=sum;j++){
                System.out.print(t[i][j]+"\t");
            }
            System.out.println();
        }
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
