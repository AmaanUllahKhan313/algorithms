package com.algos.ll;

public class KthElement {
    public static void main(String[] args){
        NodeSLL head = NodeSLL.getDefaultSLL();
        NodeSLL.displaySLL();
        NodeSLL pointer = head;
        int k=3;
        for(int i=1;i<k;i++)pointer=pointer.next;
        System.out.println("p1 data:"+pointer.data);
    }
}
