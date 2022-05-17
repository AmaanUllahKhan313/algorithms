package com.algos.tree;

public class DeleteNodeinBST {
    public static void main(String[] args) {
        BTree root = new BTree(3);
        root.left = new BTree(2);
        root.right = new BTree(5);
        root.left.left = new BTree(1);
        root.left.right = new BTree(4);
        System.out.println(deleteNode(root,2));
    }

    private static BTree deleteNode(BTree root, int key) {
        if(root == null){
            return null;
        }
        if(key < root.data){
            root.left = deleteNode(root.left, key);
        }else if(key > root.data){
            root.right = deleteNode(root.right, key);
        }else{
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            BTree minNode = findMin(root.right);
            root.data = minNode.data;
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }
    private static BTree findMin(BTree node){
        while(node.left != null){
            node = node.left;
        }
        return node;
    }
}
