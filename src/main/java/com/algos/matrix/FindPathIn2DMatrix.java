package com.algos.matrix;

import java.util.LinkedHashMap;
import java.util.Stack;
class IndexManager{
    private int i;
    private int j;
    boolean left,right,up,down;
    public IndexManager(int value, int index) {
        this.i = value;
        this.j = index;
        left = right = up = down = true;
    }

    public int getI() {
        return i;
    }

    public void setI(int value) {
        this.i = value;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    @Override
    public String toString() {
        return   "i=" + i +
                ", j=" + j;
    }
}
public class FindPathIn2DMatrix {
/*
         0 1 2 3 4 5 6
        0{". # . # # # #"
        1,". . # . . # #"
        2,"# . . . # . #"
        3,". # # . . . ."};

    x = 0 , y = 0;
    orderedList ->
    left = true;
    up =  false;
    right = true;
    down = true;
 [(0,0),(0,1),(1,1),(2,1),(2,2),(2,3)}

    boolean getPath(int[][] a){

    }*/
    public static void main(String[] args) {
        /*int[][] a={
            {0,1,0,1,1,1,1},
            {0,0,1,0,0,0,1},
            {1,0,0,0,1,0,1},
            {0,1,1,0,0,0,0}};*/
        int[][] a={
                {0,0,0,0,0,0,0},
                {1,1,1,1,1,0,1},
                {1,0,0,0,1,0,0},
                {0,1,1,0,0,0,0}};
            boolean pathExists = getPathForArray(a);
        System.out.println("Path exists: "+(pathExists?"Yes":"No"));
    }

    private static boolean getPathForArray(int[][] a) {
        LinkedHashMap<String,Boolean> map = new LinkedHashMap();
        map.put("left",true);
        map.put("right",true);
        map.put("up",true);
        map.put("down",true);

        Stack<IndexManager> stack = new Stack<>();
        int x = 0, y = 0;


        stack.push(new IndexManager(x,y));
        for(int i = 0 ;i< a.length; i++){
            for(int j=0; j<a[0].length; j++){
                IndexManager current = null;
                if(!stack.isEmpty())
                    current = stack.peek();
                if(current == null){
                    return false;
                }
                int currentX = x , currentY = y;
                boolean flag=false;
                    if(current.right && (!(currentY+1 >= a[0].length) && a[currentX][currentY+1] == 0)){
                        current.right = false;
                        stack.push(new IndexManager(x,++y));
                        stack.peek().left = false;
                        flag = true;
                    }else if( current.down &&(!(currentX+1 >= a.length) && a[currentX+1][currentY] == 0)){
                        current.down = false;
                        stack.push(new IndexManager(++x,y));
                        stack.peek().up = false;
                        flag = true;
                    }else if(current.left && (!(currentY-1 < 0) && a[currentX][currentY-1] == 0)) {
                        current.left = false;
                        stack.push(new IndexManager(x,--y));
                        stack.peek().right =false;
                        flag = true;
                    }else if( current.up && (!(currentX-1 < 0) && a[currentX-1][currentY] == 0)){
                         current.up = false;
                        stack.push(new IndexManager(--x,y));
                        stack.peek().down = false;
                        flag = true;
                    }
                    if(x==a.length-1 && y ==a[0].length-1)return true;
                    if(!flag){

                        stack.pop();
                        if(!stack.isEmpty())  {

                            x=stack.peek().getI();
                            y=stack.peek().getJ();
                        }
                    }
            }
        }
        return false;
    }
}
