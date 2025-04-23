package com.algos3_stack;

public class FindCelebrity {
    static int[][] CELEBRITY_MATRIX =
                    {{0,1,0,0},
                    {0,0,0,0},
                    {0,1,0,0},
                    {0,1,0,0}};

    public static void main(String[] args) {
        int numberOfPeople = 4;
        int id = findCelebrity(4);
        if(id != -1){
            System.out.println("Celebrity found: "+id);
        }else{
            System.out.println("Celebrity not found..");
        }
    }
    private static boolean knows(int a,int b){
        if(CELEBRITY_MATRIX[a][b] == 1) return true;
        else return false;
    }

    private static int findCelebrity(int n) {
        //getCelebrity id
        int id = getCelebrityId(n);

        int count1 =0,count2=0;
        //verify celebrity
        for(int i = 0;i<n;i++){
            if(i!=id){
                count1=count1 +CELEBRITY_MATRIX[id][i];
                count2=count2 +CELEBRITY_MATRIX[i][id];
            }
        }
        if(count1 ==0 && count2 == n-1) return id;
        else return -1;
    }

    private static int getCelebrityId(int n) {
        if(n == 0)return -1;
        int id = getCelebrityId(n-1);
        if(id == -1)return n-1;
        if(knows(id,n-1))return n-1;
        else if(knows(n-1,id))return id;
        return -1;
    }
}
