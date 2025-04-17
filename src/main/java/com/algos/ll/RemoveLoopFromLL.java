package com.algos.ll;

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
        ListNode ptr1 = head,ptr2 = head;
        while (ptr2.next.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
            if(ptr1 == ptr2 ){
                loopFound(head,ptr1,ptr2);
                break;
            }
        }
    }
    private static void loopFound(ListNode head, ListNode ptr1, ListNode ptr2) {
        //find length of loop
        int loopSize = getLength(ptr2);
        //initialize with head+loopsize to pointer 2
        ptr1=head;
        ptr2=head;
        while (loopSize!=0){
            ptr2=ptr2.next;
            loopSize--;
        }
        //start moving both the pointer with same speed till they meet
        ListNode lastNode = ptr2;
        while (ptr1!=ptr2){
            lastNode = ptr2;
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        System.out.println("connected node : "+ptr1.val);
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
