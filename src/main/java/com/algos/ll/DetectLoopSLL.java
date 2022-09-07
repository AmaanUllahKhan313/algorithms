package com.algos.ll;

public class DetectLoopSLL {
    public static void main(String[] args) {
        NodeSLL head = NodeSLL.getSLLWithLoop();
        System.out.println("Loop present :"  + isLoopPresent(head));
    }

    private static boolean isLoopPresent(NodeSLL head) {
        if(head == null || head.next == null) return  false;
        NodeSLL ptr1 = head,ptr2 = head.next;
        while (ptr1 != ptr2 && ptr2.next.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }
        return ptr1 == ptr2;
    }
}
