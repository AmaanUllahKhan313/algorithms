package com.algos.ll;

public class DetectLoopSLL {
    public static void main(String[] args) {
        NodeSLL head = NodeSLL.getSLLWithLoop();
        System.out.println("Loop present :"  + isLoopPresent(head));
    }


    private static boolean isLoopPresent(NodeSLL head) {
        if(head == null || head.next == null) return  false;
        NodeSLL slow = head,fast = head.next;
        while (slow != fast && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow == fast;
    }
}
