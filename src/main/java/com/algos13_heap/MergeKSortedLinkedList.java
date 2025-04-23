package com.algos13_heap;

import com.algos2_linkedlist.ListNode;

import java.util.PriorityQueue;
import java.util.Queue;

public class MergeKSortedLinkedList {
    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];
        for (int i = 0; i < 3; i++) {
            lists[i] = ListNode.getDefaultSLL();
        }
        System.out.println("merge linked list :");
        ListNode head = getMergeList(lists);
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
    private static ListNode getMergeList(ListNode[] lists) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < lists.length; i++) {
            while (lists[i]!=null){
                queue.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        ListNode temp = new ListNode(queue.poll());
        ListNode head = temp;
        while (!queue.isEmpty()){
            ListNode newNode  = new ListNode(queue.poll());
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }
}
