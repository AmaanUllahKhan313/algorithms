package com.algos03_stack;

public class FindCelebrity_Recursion {
    public static void main(String[] args) {
        int n = 4;
        int id = Celebrity(n);
        if(id == -1 ) System.out.println("No celebrity");
        else System.out.println("Celebrity ID " +id);
    }
    static int[][] MATRIX =
      { { 0, 0, 0, 0 },
        { 1, 0, 0, 0 },
        { 1, 0, 0, 0 },
        { 1, 0, 0, 0 } };
    static boolean knows(int a, int b) {
        if(MATRIX[a][b] ==1) return true;
    return false;
    }
    static int findPotentialCelebrity(int n) {
        if (n == 0) return -1;
        int id = findPotentialCelebrity(n - 1);
        if (id == -1) return n - 1;
        else if (knows(id, n - 1)) return n - 1;
        else if (knows(n - 1, id)) return id;
        return -1;
    }
   static int Celebrity(int n) {
        int id = findPotentialCelebrity(n);
        if (id == -1) return id;
        else {
            int c1 = 0, c2 = 0;
            for (int i = 0; i < n; i++)
                if (i != id) {
                    c1 += MATRIX[id][i];
                    c2 += MATRIX[i][id];
                }
            if (c1 == 0 && c2 == n - 1) return id;
            return -1;
        }
    }
}
