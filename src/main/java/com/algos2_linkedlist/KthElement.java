package com.algos2_linkedlist;

public class KthElement {
    public static void main(String[] args){
        ListNode head = ListNode.getDefaultSLL();
        ListNode.displaySLL();
        ListNode pointer = head;
        int k=3;
        for(int i=1;i<k;i++)pointer=pointer.next;
        System.out.println("p1 data:"+pointer.val);
    }
}
