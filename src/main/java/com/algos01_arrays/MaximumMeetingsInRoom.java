package com.algos01_arrays;
import java.util.*;

public class MaximumMeetingsInRoom{
    static class meeting{
        int start;
        int end;
        int pos;
        meeting(int start, int end, int pos){
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }

    public static void main (String[] args){
        int s[] = { 1, 3, 0, 5, 8, 5 };
        int f[] = { 2, 4, 6, 7, 9, 9 };
        ArrayList<meeting> meet = new ArrayList<>();
        for(int i = 0; i < s.length; i++)
            meet.add(new meeting(s[i], f[i], i));
        maxMeeting(meet, meet.size());
    }
    public static void maxMeeting(ArrayList<meeting> al, int s){
        ArrayList<Integer> m = new ArrayList<>();
        int time_limit = 0;
        Collections.sort(al, (o1, o2) -> {
            if (o1.end < o2.end)
            {
                return -1;
            }
            else if (o1.end > o2.end)
                return 1;
            return 0;
        });
        m.add(al.get(0).pos);
        time_limit = al.get(0).end;
        for(int i = 1; i < al.size(); i++)
        {
            if (al.get(i).start > time_limit)
            {
                m.add(al.get(i).pos);
                time_limit = al.get(i).end;
            }
        }
        for(int i = 0; i < m.size(); i++)
            System.out.print(m.get(i) + 1 + " ");
    }

}
