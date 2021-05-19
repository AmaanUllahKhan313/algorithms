package com.algos.ll;

public class AlternateReverse {
    public static void main(String[] args) {
        System.out.println("Alternate Reverse program...");
        NodeSLL head = NodeSLL.get11NodeSLL();
        NodeSLL.displaySLL();
        NodeSLL newHead = alternateReverse(head,3);
        newHead.display(newHead);
    }

    private static NodeSLL alternateReverse(NodeSLL head, int k) {
        NodeSLL prev =null,ptr1=head,ptr2=head.next,first_node=head,last_node=head;
        int counter=0;
        boolean isUp = true;
        while (ptr1 != null ) {
            if (counter < k && isUp) {
                ptr1.next = prev;
                prev = ptr1;
                ptr1 = ptr2;
                if (ptr2 != null) ptr2 = ptr2.next;
                counter++;
                if (counter == k) {
                    first_node.next = ptr1;
                    if(head==first_node)head=prev;
                    else last_node.next = prev;
                    first_node = ptr1;
                    isUp=false;
//                    counter--;
                }
            } else {
                prev = ptr1;
                ptr1 = ptr2;
                if (ptr2 != null) ptr2 = ptr2.next;
                counter--;
                if (counter == 0) {
                    isUp=true;
                    first_node = ptr1;
                    last_node = prev;
//                    counter++;
                }
            }
        }


//        head=prev;
        return head;
    }
}
