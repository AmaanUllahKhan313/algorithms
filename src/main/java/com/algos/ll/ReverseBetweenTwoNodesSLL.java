package com.algos.ll;

public class ReverseBetweenTwoNodesSLL {
    public static void main(String[] args) {
        System.out.println("Reversal program");
        NodeSLL head = NodeSLL.getDefaultSLL();
        NodeSLL.displaySLL();
        head = reverseBetween(head,2,4);
        head.display(head);
    }
    public static NodeSLL reverseBetween(NodeSLL head, int left, int right) {

        NodeSLL cur = head, prev = null;
        while (left > 1) {
            prev = cur;
            cur = cur.next;
            left--;
            right--;
        }
        NodeSLL con = prev, tail = cur;

        NodeSLL third = null;
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
