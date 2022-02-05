package com.algos.ll;

public class PairwiseSwapping {
    public static void main(String[] args) {
        System.out.println("Alternate Reverse program...");
        NodeSLL head = NodeSLL.get11NodeSLL();
        NodeSLL.displaySLL();
        pairwiseSwap(head);
        head.display(head);
    }

    private static void pairwiseSwap(NodeSLL head) {
        NodeSLL p1 = head;
        while (p1 != null && p1.next != null) {
            int k = p1.data;
            p1.data = p1.next.data;
            p1.next.data = k;
            p1 = p1.next.next;
        }
    }
}

