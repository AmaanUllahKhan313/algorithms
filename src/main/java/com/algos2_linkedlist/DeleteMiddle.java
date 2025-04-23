package com.algos2_linkedlist;

public class DeleteMiddle {
    public static void main(String[] args){
        System.out.println("Kth element program");
        ListNode head = ListNode.getDefaultSLL();
        ListNode.displaySLL();
        deleteMiddleElement(head);
        ListNode.displaySLL();
    }

    private static void deleteMiddleElement(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast!=null&&fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow!=null&&prev!=null)
            prev.next=slow.next;
        if(prev==null){
            head=null;
        }
    }
}
