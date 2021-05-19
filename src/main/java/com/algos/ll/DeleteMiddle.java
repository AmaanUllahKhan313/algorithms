package com.algos.ll;

public class DeleteMiddle {
    public static void main(String[] args){
        System.out.println("Kth element program");
        NodeSLL head = NodeSLL.getDefaultSLL();
        NodeSLL.displaySLL();
        NodeSLL middle = NodeSLL.getMiddleElement();
        deleteMiddleElement(middle);
        NodeSLL.displaySLL();
    }

    private static void deleteMiddleElement(NodeSLL middle) {
        if(middle==null)return;
        NodeSLL next = middle.next;
        middle.data = next.data;
        middle.next = next.next;
    }
}
