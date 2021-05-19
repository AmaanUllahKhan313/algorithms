package com.algos;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello");


               /* Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                for(int t = 0; t < n; t++) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println(a+b);
                }
*/      String input = "Welcome";
        System.out.println(input);
        StringBuilder input1 = new StringBuilder();

        // append a string into StringBuilder input1
        input1.append(input);

        // reverse StringBuilder input1
//        input1.reverse();

        input = input1.toString();
        System.out.println(input);

        // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
    }

}
