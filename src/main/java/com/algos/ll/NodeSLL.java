package com.algos.ll;

public class NodeSLL {
    public int data;
    public NodeSLL next;
    static NodeSLL head = new NodeSLL(1);
    NodeSLL(int data){
        this.data = data;
    }
    public static NodeSLL getDefaultSLL(){
        NodeSLL n1 = new NodeSLL(2);
        NodeSLL n2 = new NodeSLL(3);
        NodeSLL n3 = new NodeSLL(4);
        NodeSLL n4 = new NodeSLL(5);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return  head;

    }
    public static NodeSLL get11NodeSLL(){
        NodeSLL n1 = new NodeSLL(2);
        NodeSLL n2 = new NodeSLL(3);
        NodeSLL n3 = new NodeSLL(4);
        NodeSLL n4 = new NodeSLL(5);
        NodeSLL n5 = new NodeSLL(6);
        NodeSLL n6 = new NodeSLL(7);
        NodeSLL n7 = new NodeSLL(8);
        NodeSLL n8 = new NodeSLL(9);
        NodeSLL n9 = new NodeSLL(10);
        NodeSLL n10 = new NodeSLL(11);
        NodeSLL n11 = new NodeSLL(12);
        NodeSLL n12 = new NodeSLL(13);
        NodeSLL n13= new NodeSLL(14);
        NodeSLL n14 = new NodeSLL(15);
        NodeSLL n15 = new NodeSLL(16);
        NodeSLL n16 = new NodeSLL(17);
        NodeSLL n17 = new NodeSLL(18);
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
    public static NodeSLL getPalidromeSLL(){
        NodeSLL n1 = new NodeSLL(2);
        NodeSLL n2 = new NodeSLL(3);
        NodeSLL n3 = new NodeSLL(4);
        NodeSLL n4 = new NodeSLL(5);
        NodeSLL n5 = new NodeSLL(6);
        NodeSLL n6 = new NodeSLL(5);
        NodeSLL n7 = new NodeSLL(4);
        NodeSLL n8 = new NodeSLL(3);
        NodeSLL n9 = new NodeSLL(2);
        NodeSLL n10 = new NodeSLL(1);
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
    public static NodeSLL getSLLWithLoop(){
        NodeSLL n1 = new NodeSLL(2);
        NodeSLL n2 = new NodeSLL(3);
        NodeSLL n3 = new NodeSLL(4);
        NodeSLL n4 = new NodeSLL(5);
        NodeSLL n5 = new NodeSLL(6);
        NodeSLL n6 = new NodeSLL(7);
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
        System.out.print(head.data);
        NodeSLL node = head.next;
        while(node!=null){
            System.out.print("-> "+node.data);
            node = node.next;
        }
        System.out.println();
    }
    public void display(NodeSLL head) {
        NodeSLL ptr = head;
        while (ptr != null) {
            System.out.print("->"+ptr.data);
            ptr = ptr.next;
        }
        System.out.println();
    }
    public static NodeSLL getMiddleElement(){
        NodeSLL p1 = head.next;
        NodeSLL p2 = head;
        if(p1.next==null || p1.next.next == null) return null;
        while(p1!=null && p1.next!=null ){//&& p1.next.next != null){
            p1 = p1.next.next;
            if(p2 == null)p2 = head;
            else p2 = p2.next;
        }
        System.out.println("Middle element:"+p2.data);
        return p2;
    }
}
