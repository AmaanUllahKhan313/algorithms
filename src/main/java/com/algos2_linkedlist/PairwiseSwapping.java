package com.algos2_linkedlist;

public class PairwiseSwapping {
    public static void main(String[] args) {
        System.out.println("Alternate Reverse program...");
        ListNode head = ListNode.get11NodeSLL();
        ListNode.displaySLL();
        pairwiseSwap(head);
        head.display(head);
    }

    private static void pairwiseSwap(ListNode head) {
        ListNode p1 = head;
        while (p1 != null && p1.next != null) {
            int k = p1.val;
            p1.val = p1.next.val;
            p1.next.val = k;
            p1 = p1.next.next;
        }
    }
}

