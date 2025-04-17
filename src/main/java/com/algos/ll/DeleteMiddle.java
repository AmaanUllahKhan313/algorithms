package com.algos.ll;

public class DeleteMiddle {
    public static void main(String[] args){
        System.out.println("Kth element program");
        NodeSLL head = NodeSLL.getDefaultSLL();
        NodeSLL.displaySLL();
        deleteMiddleElement(head);
        NodeSLL.displaySLL();
    }

    private static void deleteMiddleElement(NodeSLL head) {
        NodeSLL fast = head;
        NodeSLL slow = head;
        NodeSLL prev = null;
        while(fast!=null&&fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(slow!=null&&prev!=null)
            prev.next=slow.next;
        if(prev==null){
            head=null;
        }
    }
}
