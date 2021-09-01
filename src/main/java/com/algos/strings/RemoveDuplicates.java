package com.algos.strings;

import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(new RemoveDuplicates().removeDups("zvvogfg"));
    }

    String removeDups(String S)
    {
        HashMap<Character,Integer> characterIntegerHashMap = new HashMap<Character,Integer>();
        char arr [] = S.toCharArray();
        String out = "";
        for (int i = 0; i <arr.length; i++) {
            if(characterIntegerHashMap.get(arr[i])==null){
                out+=arr[i];
                characterIntegerHashMap.put(arr[i],1);
            }
        }
        // Your code goes here
        return out;
    }
}
