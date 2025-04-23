package com.algos2_linkedlist;

public class RemoveLoopFromLL {
    public static void main(String[] args) {
        ListNode head = ListNode.getSLLWithLoop();
        // 1----2----3----4
        //           |    |
        //           7-6-5

        removeLoop(head);
    }
    private static void removeLoop(ListNode head) {
        //find loop
        ListNode slow = head,fast = head;
        while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast ){
                loopFound(head,slow,fast);
                break;
            }
        }
    }
    private static void loopFound(ListNode head, ListNode slow, ListNode fast) {
        //find length of loop
        int loopSize = getLength(fast);
        //initialize with head+loopsize to pointer 2
        slow=head;
        fast=head;
        while (loopSize!=0){
            fast=fast.next;
            loopSize--;
        }
        //start moving both the pointer with same speed till they meet
        ListNode lastNode = fast;
        while (slow!=fast){
            lastNode = fast;
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println("connected node : "+slow.val);
        //make last node.next to null to remove cycle
        lastNode.next = null;
    }
    private static int getLength(ListNode ptr2) {
        int count= 1 ;
        ListNode temp = ptr2;
        while(ptr2!=temp.next){
            count++;
            temp =  temp.next;
        }
        return count;
    }
}
