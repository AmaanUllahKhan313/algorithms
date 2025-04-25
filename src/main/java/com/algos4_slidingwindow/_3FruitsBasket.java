package com.algos4_slidingwindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _3FruitsBasket {
    public static void main(String[] args) {
        Arrays.stream(getMaxFruits(new String[]{"Mango_Tree","Apple_Tree","Banana_Tree","Apple_Tree","Apple_Tree"})).forEach(System.out::println);

    }

    private static String [] getMaxFruits(String[] trees) {
        int max = Integer.MIN_VALUE;
        int i=0;
        int j=0;
        int fruitsIndexStart=0;
        int fruitsIndexEnds=0;
        Map<String,Integer> basket = new HashMap<String, Integer>();
        while (j<trees.length){
            basket.put(trees[j],basket.getOrDefault(trees[j],0)+1);
            if (basket.size()<=2) {
                // if wants to print array
                if(j-i+1>max){
                    fruitsIndexStart = i;
                    fruitsIndexEnds = j+1;
                    max=j-i+1;
                }
               //get max count only
                //max=Math.max(max,j-i+1);
            }
            while (i<trees.length&&basket.size()>2){
                if(basket.containsKey(trees[i])) {
                    basket.put(trees[i], basket.get(trees[i]) - 1);
                    if (basket.get(trees[i])==0)
                        basket.remove(trees[i]);
                } i++;
            } j++;
        }
        // to get array
        return Arrays.copyOfRange(trees,fruitsIndexStart,fruitsIndexEnds);
        //only for count
        //return max;
    }

}
