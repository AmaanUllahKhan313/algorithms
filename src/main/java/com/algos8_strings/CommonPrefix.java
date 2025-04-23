package com.algos8_strings;

public class CommonPrefix {
    public static void main(String[] args) {
        String [] str ={"Disapprove","Disconnect","Disagree"}; // Dis
        String [] str2 ={"approve","Disconnect","Disagree"}; // ""
        String [] str3 ={"Dis","Dis","Dis"}; // Dis
        String [] str4 ={"","Dis","Dis"}; // ""
        String [] str5 ={null,"Dis","Dis"}; // ""
        System.out.println(getCommonPrefix(str5));
    }
    private static String getCommonPrefix(String[] str) {
        String result = "";
        char [] firstString = null;
        if(null!=str[0])
            firstString = str[0].toCharArray();
        else
            return result;

        for (int i = 0; i < firstString.length; i++) {
            for (int j = 1; j < str.length; j++) {
                if(null==str[j])
                    return "";
                if (new String(String.valueOf(firstString[i])).equals (new String(String.valueOf(str[j].toCharArray()[i]))))
                    return result;
            }
            result = result + firstString[i];
        }
        return result;
    }
}
