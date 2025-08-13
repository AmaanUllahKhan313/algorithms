package com.algos08_strings;
// number of characters and it's occurences should be same with/without following sequence
public class _5ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("nitin","niitn"));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int counts[]=new int[26];

        for(int i=0;i<s.length();i++){
            counts[s.charAt(i)-'a']++;
            counts[t.charAt(i)-'a']--;
        }

        for(int i: counts){
            if(i!=0)
                return false;
        }
        return true;

    }
}
