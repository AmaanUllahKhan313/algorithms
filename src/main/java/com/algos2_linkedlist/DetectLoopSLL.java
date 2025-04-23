package com.algos2_linkedlist;

public class DetectLoopSLL {
    public static void main(String[] args) {
        ListNode head = ListNode.getSLLWithLoop();
        System.out.println("Loop present :"  + isLoopPresent(head));
    }


    private static boolean isLoopPresent(ListNode head) {
        if(head == null || head.next == null) return  false;
        ListNode slow = head,fast = head.next;
        while (slow != fast && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow == fast;
    }
}
