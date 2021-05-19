package com.algos.ll;

public class KthElement {
    public static void main(String[] args){
        System.out.println("Kth element program");
        NodeSLL head = NodeSLL.getDefaultSLL();
        NodeSLL.displaySLL();
      //  printKthElement(head,0);
        printKthIterative(head,3);
    }

    private static int printKthElement(NodeSLL head, int k) {
        if(head == null)return 0;
        int index = printKthElement(head.next,k)+1;
        if(index == k) System.out.println("k:"+k+" data:"+head.data);
        return index;
    }
    public static void printKthIterative(NodeSLL head,int k){
        NodeSLL p1 = head;
        NodeSLL p2 = head;
        for(int i=1;i<k;i++)p1=p1.next;
        /*while(p1.next!=null){
            p1=p1.next;
            p2=p2.next;
        }*/
        System.out.println("p1 data:"+p1.data);
    }
}
