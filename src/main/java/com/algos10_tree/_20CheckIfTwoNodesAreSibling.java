package com.algos10_tree;


import java.util.LinkedList;
import java.util.Queue;

public class _20CheckIfTwoNodesAreSibling {
    public static void main(String[] args) {
        _1BTree root = _1BTree.initializeTree();
        System.out.print(isCousins(root,2,3));
    }
    public static boolean isCousins(_1BTree root, int x, int y) {
        if (root == null) return false;
        Queue<_1BTree> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean foundX = false, foundY = false;
            for (int i = 0; i < size; i++) {
                _1BTree current = queue.poll();
                if (current.left != null && current.right != null) {
                    if ((current.left.data == x && current.right.data == y) ||
                            (current.left.data == y && current.right.data == x)) {
                        return false;
                    }
                }
                if (current.left != null) {
                    queue.add(current.left);
                    if (current.left.data == x) foundX = true;
                    if (current.left.data == y) foundY = true;
                }
                if (current.right != null) {
                    queue.add(current.right);
                    if (current.right.data == x) foundX = true;
                    if (current.right.data == y) foundY = true;
                }
            }
            if (foundX && foundY) return true;
            if (foundX || foundY) return false;
        }
        return false;
    }

}

