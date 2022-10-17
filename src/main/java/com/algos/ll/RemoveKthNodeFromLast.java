package com.algos.ll;

public class RemoveKthNodeFromLast {
    public static void main(String[] args) {
        NodeSLL head = NodeSLL.get11NodeSLL();
        NodeSLL.displaySLL();
        removeNthFromEnd(head,2);
        NodeSLL.displaySLL();
    }
    public static NodeSLL removeNthFromEnd(NodeSLL head, int n) {

        NodeSLL start = new NodeSLL(0);
        NodeSLL slow = start, fast = start;
        slow.next = head;
        for(int i=1; i<=n+1; i++)   {
            fast = fast.next;
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}
