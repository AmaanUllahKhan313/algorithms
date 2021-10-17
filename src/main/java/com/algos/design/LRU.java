package com.algos.design;

import java.util.HashMap;
import java.util.Map;

public class LRU {
    Map<Integer,Node> lookup = new HashMap<>();
    int capacity;
    Node head;
    Node tail;
    public LRU(int capacity) {
        this.lookup = new HashMap<>(capacity);
        this.capacity = capacity;
        this.head = new Node(-1,-1,null,null);
        this.tail = new Node(-1,-1,null,null);
        head.next=tail;
        tail.prev=head;
    }
    static class Node{
        int value;
        int key;
        Node next;
        Node prev;
        public Node(int value, int key, Node next, Node prev) {
            this.value = value;
            this.key = key;
            this.next = next;
            this.prev = prev;
        }
    }
    public int getFromCache(int key){
        if (lookup.containsKey(key)){
            Node node = lookup.get(key);
            removeFromCache(node);
            addToCache(node);
            return node.value;
        }
        return -1;
    }
    public void putToCache(int key, int value){
        if (lookup.containsKey(key)){
            removeFromCache(lookup.get(key));
        } else if (capacity==lookup.size()){
            removeFromCache(lookup.remove(tail.prev.key));
        }
        Node node = new Node(key,value,null,null);
        addToCache(node);
        lookup.put(key,node);
    }
    private void removeFromCache(Node node){
        Node prev_node=node.prev;
        Node next_node=node.next;

        prev_node.next=next_node;
        next_node.prev=prev_node;
    }
    private void addToCache(Node node){
        Node head_next=head.next;
        head.next=node;
        node.prev=head;
        node.next=head_next;
        head_next.prev=node;
    }
    public static void main(String[] args) {
        LRU lruCache = new LRU(2);
        lruCache.putToCache(1,1);
        lruCache.putToCache(2,2);
        System.out.println(lruCache.getFromCache(1));
        lruCache.putToCache(3,3);
        System.out.println(lruCache.getFromCache(2));
        lruCache.putToCache(4,4);
        System.out.println(lruCache.getFromCache(1));
        System.out.println(lruCache.getFromCache(3));
        System.out.println(lruCache.getFromCache(4));
    }
}
