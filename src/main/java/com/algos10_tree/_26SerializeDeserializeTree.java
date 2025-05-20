package com.algos10_tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _26SerializeDeserializeTree {

    public static void main(String[] args) {
        System.out.println(serialize(deserialize(serialize(_1BTree.initializeTree()))));
    }
    private static String serialize(_1BTree root) {
        if (root == null) return "#";
        return root.data + "," + serialize(root.left) + "," + serialize(root.right);
    }
    private static _1BTree deserialize(String data) {
        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return helper(queue);
    }
    private static _1BTree helper(Queue<String> queue) {
        String s = queue.poll();
        if (s.equals("#")) return null;
        _1BTree root = new _1BTree(Integer.valueOf(s));
        root.left = helper(queue);
        root.right = helper(queue);
        return root;
    }
}
