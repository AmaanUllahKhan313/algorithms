package com.algos.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateValidParenthisis {
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>();
        generateValidParenthisis(0,0,3,"",list);
        System.out.println(list);
    }

    public static void generateValidParenthisis(int open,int close,int  n, String result, List<String> list){
        if (open==n && close==n){
            list.add(result);
            return;
        }
        if(open<n){
            generateValidParenthisis(open+1,close,n,result+"(",list);
        }
        if(close<open){
            generateValidParenthisis(open,close+1,n,result+")",list);
        }
    }
}
