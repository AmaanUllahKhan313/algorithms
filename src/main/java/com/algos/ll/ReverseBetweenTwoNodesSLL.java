package com.algos.ll;

public class ReverseBetweenTwoNodesSLL {
    public static void main(String[] args) {
        System.out.println("Reversal program");
        ListNode head = ListNode.getDefaultSLL();
        ListNode.displaySLL();
        head = reverseBetween(head,2,4);
        head.display(head);
    }
    public static ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode cur = head, prev = null;
        while (left > 1) {
            prev = cur;
            cur = cur.next;
            left--;
            right--;
        }
        ListNode con = prev, tail = cur;

        ListNode third = null;
        while (right > 0) {
            third = cur.next;
            cur.next = prev;
            prev = cur;
            cur = third;
            right--;
        }

        if (con != null) {
            con.next = prev;
        } else {
            head = prev;
        }

        tail.next = cur;
        return head;
    }
}
