package com.algos9_recursion;

public class _4TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
//        A --> C (transfer all plates from A to B rod)
        towerOfHanoi(n,'A','C','B');
    }

    private static void towerOfHanoi(int n, char from, char to, char helper) {
            if(n==1){
                System.out.println("Moving disk 1 from rod "+from+" to rod "+to);
                return;
            }
            towerOfHanoi(n-1,from,helper,to);
        System.out.println("Moving disk "+n+" from rod "+from+" to rod "+to);
        towerOfHanoi(n-1,helper,to,from);

    }
}
