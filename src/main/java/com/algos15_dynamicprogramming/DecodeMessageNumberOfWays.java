package com.algos15_dynamicprogramming;

public class DecodeMessageNumberOfWays {

    public static void main(String[] args) {
       /*
       A->1
       B->2
       ...
       Z->26
       */
        String message = "1234";
        System.out.println(numberOfWayToDecodeMessage(message.toCharArray()));
    }

    private static int numberOfWayToDecodeMessage(char[] message) {
        int count[] = new int[message.length + 1];
        count[0] = 1;
        count[1] = 1;
        if(message[0]=='0')
            return 0;
        for (int i = 2; i <= message.length; i++){
            count[i] = 0;
            if (message[i - 1] > '0')
                count[i] = count[i - 1];
            if (message[i - 2] == '1' ||
                    (message[i - 2] == '2' &&
                            message[i - 1] < '7'))
                count[i] += count[i - 2];
        }
        return count[message.length];
    }
}
