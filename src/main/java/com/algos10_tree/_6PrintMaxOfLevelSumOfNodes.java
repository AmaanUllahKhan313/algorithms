package com.algos10_tree;

import java.util.LinkedList;
import java.util.Queue;

public class _6PrintMaxOfLevelSumOfNodes {

    public static void main(String[] args) {
        System.out.println(levelOfMaxSumOfNodes(_1BTree.initializeTree()));
    }

    private static int levelOfMaxSumOfNodes(_1BTree root) {
        int max = 0 ;
        if (root == null)
            return max;
        max = root.data;
        Queue<_1BTree> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int sum = 0;
            int size = queue.size();
            for (int i = 0; i <size; i++) {
                _1BTree node = queue.poll();
                sum += node.data;
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            max=Math.max(max,sum);
        }
        return max;
    }

}
