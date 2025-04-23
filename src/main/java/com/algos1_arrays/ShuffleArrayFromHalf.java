package com.algos1_arrays;

public class ShuffleArrayFromHalf {
//This is same as A1B1A2B2..
    //TimeCOmplexity
//Space Complexity
    public static void main(String[] args) {
//int [] arr = {'A1','A2','A3','A4, B1, B2,B4};

//out = {A1,B1,A2,B2,....An,Bn};

// A1 - A2 -> B1 ; A1B1
// A,A2,

        //  char []  arr = {'A','B','C','D','E','F','G','H'};
        int [] arr ={1,2,3,4,5,6,7,8};
        shufleArray(arr,0,arr.length-1);
        for (int c: arr
        ) {
            System.out.println(c);
        }
        // A1,B1,A2,A2,A3 B4,B2,..         B3


//A1,B1,A2,A3,A4,B4,B2,B3
//A1,B1,A2,A2,A2,A3,A4,B4,B3,
//
    }

    public static char [] transformArray(char [] arr){

        for (int i = 1; i < arr.length; i++) {
            int shift =i;
            char temp ='N';
        /*    char replacedItem=arr[midIndex];
            arr[i]=arr[midIndex];


          arr[midIndex]=arr[shift];*/
            i++;
        }
        return arr ;
    }
    //A1 A2 A3 B1 B2 B3
//             ^
    //A1 A1 A2 A3 B1 B2 --> B3
    //            ^
    //A1 B1 A2 A3 B3 B2
    //               ^
    //A1 B1 A2 A2 A3 B3 -->B2
    //A1 B1 A2 B2 A3 B3
    public static char [] swap(char [] arr,int i,int j){
        int midIndex = arr.length/2;
        char replace = arr[midIndex];
        char temp = arr[arr.length-1];
        for (int k = 1; k < arr.length; k++) {
            arr[k] = arr[midIndex];
            char last = move(arr);
            midIndex++;

            arr[midIndex] = last;

        }
        //arr[i] =
        return arr;
    }

    public static char move(char [] a){
        char temp = a[a.length-1];
        for(int j=a.length-1;j>0;j--){
            temp = a[j];
            a[j] = a[j-1];
            a[j-1]=temp;

        }
        return temp;
    }


    static void shufleArray(int a[], int f, int l)
    {
        if (f > l)
            return;

        // If only 2 element, return
        if (l - f == 1)
            return;

        // finding mid to divide the array
        int mid = (f + l) / 2;

        // using temp for swapping first half of second array
        int temp = mid + 1;

        // mmid is use for swapping second half for first array
        int mmid = (f + mid) / 2;

        // Swapping the element
        for (int i = mmid + 1; i <= mid; i++) {
            // swap a[i], a[temp++]
            int temp1 = a[i];
            a[i] = a[temp];
            a[temp++] = temp1;
        }

        // Recursively doing for first half and second half
        shufleArray(a, f, mid);
        shufleArray(a, mid + 1, l);
    }

}
