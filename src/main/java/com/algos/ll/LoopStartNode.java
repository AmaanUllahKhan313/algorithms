package com.algos.ll;

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
        ListNode ptr1 = head,ptr2 = head.next;
        while (ptr1 != ptr2 && ptr2.next.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }
        if (ptr1 == ptr2) {
            ptr1 = head;
            ptr2 = ptr2.next;
        }else return -1;
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1.val;
    }
}
