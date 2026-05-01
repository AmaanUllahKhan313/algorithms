package com.algos02_linkedlist;

public class LoopStartNode {
    public static void main(String[] args) {
        System.out.println("Detect Loop program");
        ListNode head = ListNode.getSLLWithLoop();
        //return element else returns 0
        int element = getStartNodeOfLoop(head);
        System.out.println("Loop starts from :"+element);
    }

    private static int getStartNodeOfLoop(ListNode head) {
        if(head == null || head.next == null) return  -1;
        ListNode slow = head,fast = head.next;
        while (slow != fast && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow == fast) {
            slow = head;
            fast = fast.next;
        }else return -1;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;
    }
}
