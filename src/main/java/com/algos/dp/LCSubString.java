package com.algos.dp;

public class LCSubString {
    public static void main(String[] args) {
        String s1 = "abcdghm";

        String s2 = "abedfghmr";

        int count3 = getLCSubStringCountTopDown(s1,s2,s1.length(),s2.length());
        System.out.println("LCSubstring count top down is "+count3);
    }

    public static int getLCSubStringCountTopDown(String s1, String s2,
                                                 int n, int m) {
        int[][] t = new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                if((s1.charAt(i-1)+"").equals(s2.charAt(j-1)+"")){
                    t[i][j] = 1+t[i-1][j-1];
                }else{
                    t[i][j] =0;
                }
            }
        }
        int max =0;
         for(int i =0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(t[i][j]>max)max=t[i][j];
            }
        }
       /* for(int i =0;i<=n;i++){
            for(int j=0;j<=m;j++){
                System.out.print(t[i][j]+"_"+i+"_"+j+"\t");
            }
            System.out.println();
        }*/
        return max;
    }
}
