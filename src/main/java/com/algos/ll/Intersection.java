package com.algos.ll;

public class Intersection {
    static NodeSLL head1, head2;
    public static void main(String[] args) {
        

        // creating first linked list
        head1 = new NodeSLL(3);
        head1.next = new NodeSLL(6);
        head1.next.next = new NodeSLL(9);
        head1.next.next.next = new NodeSLL(15);
        head1.next.next.next.next = new NodeSLL(30);
        head1.display(head1);

        // creating second linked list
        head2 = new NodeSLL(10);
        head2.next = new NodeSLL(15);
        head2.next.next = new NodeSLL(30);
        head2.display(head2);
        int intersectValue = getExtraNodesLength(head1,head2);
        System.out.println("intersecting value: "+intersectValue);
    }

    private static int getExtraNodesLength(NodeSLL head1, NodeSLL head2) {
        int head1Length = 0,head2Length =0;
        NodeSLL ptr1 = head1,ptr2=head2;
        while (ptr1 != null) {
            head1Length++;
            ptr1 = ptr1.next;
        }
        while (ptr2 != null) {
            head2Length++;
            ptr2 = ptr2.next;
        }
        int difference = Math.abs(head1Length-head2Length);
        ptr1 = head1;
        ptr2 = head2;
        if (head1Length > head2Length) {
            for (int i = 0; i < difference; i++) ptr1 = ptr1.next;
        } else {
            for (int i = 0; i < difference; i++) ptr2 = ptr2.next;
        }
        while (ptr1 != null && ptr2 != null) {
            if(ptr1.data == ptr2.data)
                return ptr1.data;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
            return -1;
    }
}
