package com.algos.ll;

public class ReverseSLL {
    public static void main(String[] args) {
        System.out.println("Reversal program");
        NodeSLL head = NodeSLL.getDefaultSLL();
        NodeSLL.displaySLL();
        head = reverseSLL(head);
        head.display(head);
    }

    public static NodeSLL reverseSLL(NodeSLL head) {
        if(head == null) return head;
        if(head.next == null) return head;
        NodeSLL ptr1 = null,ptr2 = head,ptr3=head.next;
        while (ptr2 != null) {
            ptr2.next = ptr1;
            ptr1 = ptr2;
            ptr2 = ptr3;
            if(ptr3 !=null) ptr3 = ptr3.next;
        }
        head = ptr1;
        return head;
    }
}
