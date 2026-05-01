package com.algos10_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class _5PrintTreeLevelOrder {
    public static void main(String[] args) {
        System.out.println(levelOrder(_1BTree.initializeTree()));
    }
    public static List<List<Integer>> levelOrder(_1BTree root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
            return result;

        Queue<_1BTree> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();

            List<Integer> list=new ArrayList<Integer>();
            for(int i=0;i<size;i++){
                _1BTree node=queue.poll();
                list.add(node.data);

                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
            result.add(list);
        }
        return result;
    }
}
