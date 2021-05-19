package com.algos.stack;

public class NGE_GFG {
    public static void main(String[] args) {
        int[] a = {11,10,8,9,12,15,5,21,18};
//        int[] a = {10,11};
        for(int element:a)
        System.out.print(element+"\t");
        System.out.println();
        printNGE(a);

        StackArrayImpl stack = new StackArrayImpl(10);
        stack.push(10);
        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(9);
        stack.display();
        System.out.println("Minimum:"+stack.getMin());
    }

    private static void printNGE(int[] a) {
        StackArrayImpl s = new StackArrayImpl(a.length);
        s.push(a[0]);
        int element, next ;
        for (int i = 1; i < a.length; i++) {
            next = a[i];
            if(!s.isEmpty()){
                element=s.pop();
                while(element<next){
                    System.out.println(element+"--->"+next);
                    if(s.isEmpty())break;
                    element = s.pop();
                }
                if(element>next){
                    s.push(element);
                }
            }
            s.push(next);
        }
        while(!s.isEmpty()){
            System.out.println(s.pop()+"---> -1");
        }
    }
}
