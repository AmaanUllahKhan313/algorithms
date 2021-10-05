package com.algos.maths;

public class OverlappingAreaOfRectangle {
    static class Point {
        int x, y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    };
    public static void main(String[] args){
        Point l1 = new Point(2, 2), r1 = new Point(5, 7);
        Point l2 = new Point(3, 4), r2 = new Point(6, 9);
        System.out.println(overlappingArea(l1, r1, l2, r2));
    }
    static int overlappingArea(Point l1, Point r1,Point l2, Point r2){
        int area1 = Math.abs(l1.x - r1.x) * Math.abs(l1.y - r1.y);
        int area2 = Math.abs(l2.x - r2.x) * Math.abs(l2.y - r2.y);
        int x_dist = (Math.min(r1.x, r2.x) - Math.max(l1.x, l2.x));
        int y_dist = (Math.min(r1.y, r2.y) - Math.max(l1.y, l2.y));
        int areaI = 0;
        if( x_dist > 0 && y_dist > 0 ){
            areaI = x_dist * y_dist;
        }
        return (area1 + area2 - areaI);
    }
}
