package com.algos.design;

public class KthSymbolInGrammar {
    public static void main(String[] args) {
        System.out.println(getKthSymbolInGrammar(3,1));
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
