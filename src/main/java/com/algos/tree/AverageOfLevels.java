package com.algos.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels {
    public static void main(String[] args) {
        System.out.println(getAvgOfLevels(BTree.initializeTree()));
    }
    public static List getAvgOfLevels(BTree root){
        Queue<BTree> q = new LinkedList<>();
        q.add(root);
        List<Double> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int size = q.size();
            double sum = 0.0;
            for(int i=0; i<size; i++){
                BTree node = q.remove();
                sum += node.data;
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            ans.add(sum/size);
        }
        return ans;
    }
}
