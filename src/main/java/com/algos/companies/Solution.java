package com.algos.companies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String input = new BufferedReader(new InputStreamReader(System
                .in)).readLine();
        Solution solution = new Solution();
        System.out.println(solution.getEmailRangesHistory(input));

    }
    private String getEmailRangesHistory(String input) {


        //read format
        if(input==null||input.length()<=0) return "";
        String [] inputs = input.split(",");
        List<long[]> list = new ArrayList<>();
        for (String str:inputs) {
            long first = Long.parseLong(str.trim().split(":")[0].trim());
            long second = Long.parseLong(str.trim().split(":")[1].trim());
            list.add(new long[]{first,1L});
            list.add(new long[]{second,-1L});
        }


        //core logic
        Collections.sort(list,(ob1,ob2)->(ob1[0]!=ob2[0]
                ?Long.compare(ob1[0],ob2[0]):Long.compare(ob1[1],ob2[1])));
        Deque<long[]> intervals = new LinkedList<>();
        Long temp = null;
        for (long [] range :list) {
            if(range[1]==1){
                if(temp==null) temp=range[0];
            } else {
                if (intervals.isEmpty() || (temp != null && intervals.peekFirst()[1]+1<temp)){
                    intervals.offerFirst(new long[]{temp,range[0]});
                } else {
                    long[] prev = intervals.pollFirst();
                    prev[1] = range[0];
                    intervals.offerFirst(prev);
                }
                temp=null;
            }
        }


        //write format
        StringBuilder stringBuilder = new StringBuilder();
        while (!intervals.isEmpty()){
            long [] interval = intervals.pollLast();
            stringBuilder.append(interval[0]).append(":").append(interval[1]).append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return new String(stringBuilder);
    }
}
