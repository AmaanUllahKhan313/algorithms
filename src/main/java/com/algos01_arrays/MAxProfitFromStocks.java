package com.algos01_arrays;

class MaxProfitFromStocks {

    public static void main(String[] args) {
        int prices [] = {7,1,5,3,6,4,6};

        System.out.println(calculate(prices, 0));
    }

    public static int calculate(int prices[], int s) {
        if (s >= prices.length)
            return 0;
        int max = 0;
        for (int start = s; start < prices.length; start++) {
            int maxprofit = 0;
            for (int i = start + 1; i < prices.length; i++) {
                if (prices[start] < prices[i]) {
                    int profit = calculate(prices, i + 1) + prices[i] - prices[start];
                    if (profit > maxprofit)
                        maxprofit = profit;
                }
            }
            if (maxprofit > max)
                max = maxprofit;
        }
        return max;
    }
}


 class MaxProfit {
     public static void main(String[] args) {
        // int prices [] = {7,1,5,3,6,4,6};
         int prices [] = {23171,21011,21123,21366,21013,21367};
      //   int prices [] =  {11,10,5,9,12,15,8,21,18};
         System.out.println("final"+solution(prices));
     }
    public static int solution(int[] A) {
        if(A.length < 2) return 0; //for empty array or 1 element array, no profit can be realized

        //convert profit table to delta table so can use max slice technique
        int [] deltaA = new int[A.length];
        deltaA[0] = 0;
        System.out.println(deltaA[0]);
        for(int i=1; i<A.length; i++) {
            deltaA[i] = A[i] - A[i-1];
            System.out.println(deltaA[i]);
        }

        int maxEndingHere = deltaA[0];
        int maxSoFar = deltaA[0];
        for(int i = 1; i < A.length; i++){
            maxEndingHere = Math.max(deltaA[i], maxEndingHere + deltaA[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
