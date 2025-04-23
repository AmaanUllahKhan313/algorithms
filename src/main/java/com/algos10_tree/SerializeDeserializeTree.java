package com.algos10_tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserializeTree {

    public static void main(String[] args) {
        System.out.println(serialize(deserialize(serialize(BTree.initializeTree()))));
    }
    private static String serialize(BTree root) {
        if (root == null) return "#";
        return root.data + "," + serialize(root.left) + "," + serialize(root.right);
    }
    private static BTree deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return helper(queue);
    }
    private static BTree helper(Queue<String> queue) {
        String s = queue.poll();
        if (s.equals("#")) return null;
        BTree root = new BTree(Integer.valueOf(s));
        root.left = helper(queue);
        root.right = helper(queue);
        return root;
    }
}
