package com.algos02_linkedlist;

public class ListNode {
    public int val;
    public ListNode next;
    static ListNode head = new ListNode(1);
    public ListNode(int data){
        this.val = data;
    }
    public ListNode(){
    }
    public static ListNode getDefaultSLL(){
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return  head;

    }
    public static ListNode get11NodeSLL(){
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(6);
        ListNode n6 = new ListNode(7);
        ListNode n7 = new ListNode(8);
        ListNode n8 = new ListNode(9);
        ListNode n9 = new ListNode(10);
        ListNode n10 = new ListNode(11);
        ListNode n11 = new ListNode(12);
        ListNode n12 = new ListNode(13);
        ListNode n13= new ListNode(14);
        ListNode n14 = new ListNode(15);
        ListNode n15 = new ListNode(16);
        ListNode n16 = new ListNode(17);
        ListNode n17 = new ListNode(18);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;
        n10.next = n11;
        n11.next = n12;
        n12.next = n13;
        n13.next = n14;
        n14.next = n15;
        n15.next = n16;
        n16.next = n17;
        return  head;

    }
    public static ListNode getPalidromeSLL(){
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(6);
        ListNode n6 = new ListNode(5);
        ListNode n7 = new ListNode(4);
        ListNode n8 = new ListNode(3);
        ListNode n9 = new ListNode(2);
        ListNode n10 = new ListNode(1);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        n9.next = n10;
        return  head;


    }
    public static ListNode getSLLWithLoop(){
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(6);
        ListNode n6 = new ListNode(7);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n2;
        return  head;
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
        //           ^-------------------^

    }
    public static void  displaySLL(){
        System.out.print(head.val);
        ListNode node = head.next;
        while(node!=null){
            System.out.print("-> "+node.val);
            node = node.next;
        }
        System.out.println();
    }
    public void display(ListNode head) {
        ListNode ptr = head;
        while (ptr != null) {
            System.out.print("->"+ptr.val);
            ptr = ptr.next;
        }
        System.out.println();
    }
    public static ListNode getMiddleElement(){
        ListNode p1 = head.next;
        ListNode p2 = head;
        if(p1.next==null || p1.next.next == null) return null;
        while(p1!=null && p1.next!=null ){//&& p1.next.next != null){
            p1 = p1.next.next;
            if(p2 == null)p2 = head ;
            else p2 = p2.next;
        }
        System.out.println("Middle element:"+p2.val);
        return p2;
    }
}
