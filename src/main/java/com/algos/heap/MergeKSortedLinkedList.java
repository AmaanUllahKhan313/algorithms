package com.algos.heap;

import com.algos.ll.NodeSLL;

import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKSortedLinkedList {
    public static void main(String[] args) {
        NodeSLL[] lists = new NodeSLL[3];
        for (int i = 0; i < 3; i++) {
            lists[i] = NodeSLL.getDefaultSLL();
        }
        System.out.println("merge linked list :");
        NodeSLL head = getMergeList(lists);
        while (head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    private static NodeSLL getMergeList(NodeSLL [] lists) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < lists.length; i++) {
            while (lists[i]!=null){
                queue.add(lists[i].data);
                lists[i] = lists[i].next;
            }
        }
        NodeSLL temp = new NodeSLL(queue.poll());
        NodeSLL head = temp;
        while (!queue.isEmpty()){
            NodeSLL newNode  = new NodeSLL(queue.poll());
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }
}
