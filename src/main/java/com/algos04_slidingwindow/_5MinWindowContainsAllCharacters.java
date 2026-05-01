package com.algos04_slidingwindow;

public class _5MinWindowContainsAllCharacters {
    public static void main(String[] args){
        String text = "this is a test string";
        String find = "tist";
        System.out.print("-->Smallest window that contain all character : ");
        System.out.print(Minimum_Window(text.toCharArray(), find.toCharArray()));
    }
    static String Minimum_Window(char []text, char []find){
        int map[] = new int[256];
        int ans = Integer.MAX_VALUE; // length of ans
        int start = 0; // starting index of ans
        int count = 0;
        for (int i = 0; i < find.length; i++) {
            if (map[find[i]] == 0)
                count++;
            map[find[i]]++;
        }
        int i = 0;
        int j = 0;
        while (j < text.length){
            map[text[j]]--;
            if (map[text[j]] == 0)
                count--;
            while (count == 0){
                if (ans > j - i + 1){
                    ans = Math.min(ans, j - i + 1);
                    start = i;
                }
                map[text[i]]++;
                if (map[text[i]] > 0)
                    count++;
                i++;
            }
            j++;
        }
        if (ans != Integer.MAX_VALUE)
            return String.valueOf(text).substring(start, ans+start);
        else
            return "-1";
    }


}
