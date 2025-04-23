package com.algos3_stack;

public class MaxRectInBinaryMatrix {
    public static void main(String[] args) {
        int[][] a = {{0,1,1,0},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,0,0}};
        int maxArea = getMaxSizeRectangle(a);
        System.out.println("Maximum rectangle area: "+maxArea);
    }

    public static int getMaxSizeRectangle(int[][] a) {
        int[] building = new int[a[0].length];
        int maxArea = 0;
        for(int j = 0;j<a.length;j++){
            for(int i=0;i<a[0].length;i++){
                System.out.print(a[j][i]+"\t");
                if(a[j][i] == 0) building[i] = 0;
                else building[i] += a[j][i];
            }
//            for(int element: building) System.out.print(element+"\t");
            int area = MaximumAreaInHistogram.getLargestRectagleArea(building);
            System.out.println("----------Maximum area:"+area);
            if(maxArea<area)maxArea = area;
            System.out.println();
        }
    return maxArea;
    }
}
