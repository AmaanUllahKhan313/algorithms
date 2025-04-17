package com.algos.ll;

public class   ReverseSLL {
    public static void main(String[] args) {
        System.out.println("Reversal program");
        NodeSLL head = NodeSLL.getDefaultSLL();
        NodeSLL.displaySLL();
        head = reverseSLL(head);
        head.display(head);
    }

    public static NodeSLL reverseSLL(NodeSLL originalHead) {
        if(originalHead == null) return originalHead;
        if(originalHead.next == null) return originalHead;
        NodeSLL previous = null,
                head = originalHead,
                headNext = originalHead.next;
        while (head != null) {
            head.next = previous;
            previous = head;
            head = headNext;
            if(headNext !=null) headNext = headNext.next;
        }
        originalHead = previous;
        return originalHead;
    }
}
