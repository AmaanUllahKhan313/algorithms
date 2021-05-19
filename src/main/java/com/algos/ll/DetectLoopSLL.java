package com.algos.ll;

public class DetectLoopSLL {
    public static void main(String[] args) {
        System.out.println("Detect Loop program");
        NodeSLL head = NodeSLL.getSLLWithLoop();
        boolean isPresent = isLoopPresent(head);
        if(isPresent) System.out.println("Loop is present!");
        else System.out.println("Loop is absent");
    }

    private static boolean isLoopPresent(NodeSLL head) {
        if(head == null || head.next == null) return  false;
        NodeSLL ptr1 = head,ptr2 = head.next;
        while (ptr1 != ptr2 && ptr2.next.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }
        if(ptr1 == ptr2)return true;
        else return false;
    }
}
