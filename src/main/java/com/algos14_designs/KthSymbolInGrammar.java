package com.algos14_designs;

public class KthSymbolInGrammar {
    public static void main(String[] args) {
                                /*
                                0
                                01
                                0110
                                01101001
                                0110100110010110
                                */
                                /*
                                a
                                ab
                                abba
                                abbabaab
                                */
        System.out.println(getKthSymbolInGrammar(4,6));
    }
    private static int getKthSymbolInGrammar(int n, int k) {
        return getKthGrammar(n,k-1);
    }
    private static int getKthGrammar(int n, int k) {
        if(n==1) return 0;
        int digit = getKthGrammar(n-1,k/2);
        if (digit == 0)
            return k%2 ==0?0:1;
        else
            return k%2 ==0?1:0;
    }
}
