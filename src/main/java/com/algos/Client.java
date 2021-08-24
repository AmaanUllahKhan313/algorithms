package com.algos;


import java.util.*;
import java.util.concurrent.Callable;

public class Client {
    public static void main2(String[] args) {
    String [] str ={"Disapprove","Disconnect","Disagree"}; // Dis
        String [] str2 ={"approve","Disconnect","Disagree"}; // ""
        String [] str3 ={"Dis","Dis","Dis"}; // Dis
        String [] str4 ={"","Dis","Dis"}; // ""
        String [] str5 ={null,"Dis","Dis"}; // ""
        System.out.println(getCommonPrefix(str5));
    }

    private static String getCommonPrefix(String[] str) {
        String result = "";
        char [] firstString = null;
        if(null!=str[0])
        firstString = str[0].toCharArray();
        else
            return result;

            for (int i = 0; i < firstString.length; i++) {
                for (int j = 1; j < str.length; j++) {
                    if(null==str[j])
                        return "";
                    if (firstString[i] != str[j].toCharArray()[i])
                        return result;
                }
                result = result + firstString[i];
            }
            return result;
        }


    static Urls urls = null;

    public static void main(String[] args) {
        String input = "Google.com";
        System.out.println(addingAndNewUrl(input).getValue());
       // System.out.println(onClickBackword().getValue());
        System.out.println(addingAndNewUrl("yahoo").getValue());
        System.out.println(addingAndNewUrl("amazon").getValue());
        System.out.println(addingAndNewUrl("flipkart").getValue());
        System.out.println(onClickBackword().getValue());
        System.out.println(addingAndNewUrl("microsoft").getValue());
        System.out.println(onClickBackword().getValue());
        System.out.println(onClickforward().getValue());
    }
// A--> B--> C--> D
    public static Urls addingAndNewUrl(String string){
        if(null==urls) {
            urls = new Urls();
            urls.setValue(string);
            urls.setPrevious(null);
            urls.setNext(null);
        }
        if(urls.getNext()!=null){
            urls.setNext(null);
            urls.setValue(string);
        }

    return urls;
    }
    public static Urls onClickBackword(){
        if(null==urls.getPrevious())
                return null;
        else{
            urls.setValue(urls.getPrevious().getValue());
            urls.setNext(urls.getPrevious().getNext());
            urls.setPrevious(urls.getPrevious().getPrevious());
        }
        return urls;
    }
    public static Urls  onClickforward() {
        if(null==urls.getNext())
            return null;
        else{
            urls.setValue(urls.getNext().getValue());
            urls.setNext(urls.getNext().getNext());
            urls.setPrevious(urls.getNext().getPrevious());
        }
        return urls;
    }

}




class Urls {
    private String value;
    private Urls next;
    private Urls previous;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Urls getNext() {
        return next;
    }

    public void setNext(Urls next) {
        this.next = next;
    }

    public Urls getPrevious() {
        return previous;
    }

    public void setPrevious(Urls previous) {
        this.previous = previous;
    }

    static class Person {
        private String name;
        private int address;

        public long getAddress() {
            return address;
        }

        public void setAddress(int address) {
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
                   if(this.address == 0 ) {
                       this.address = Objects.hash(name);
                   }
            //return Objects.hash(name);
            return this.address;
        }
    }

    public static void main2(String[] args) {
        Person person
                = new Person();
        person.setName("Amaan");
        System.out.println(person.hashCode());
        HashMap hashMap = new HashMap();
        hashMap.put(person,500);
        person.setName("Amaan1");
        System.out.println(person.hashCode());
        System.out.println(hashMap.get(person));
        Person person1
                = new Person();
        person1.setName("Amaan2");
        hashMap.put(person1,600);
        System.out.println(hashMap.get(person1));

    }

    public static void main4(String[] args) {


        //A=[2,3,8], B=[1,2,3,5,7] Output: [1,2,3,5,7,8]

        int [] A ={2,3,8};
        int [] B ={1,2,3,5,7};
        int [] C = new int [A.length+B.length];
        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < C.length; i++) {
                if(A[indexA]==B[indexB]) {
                    C[i] = A[indexA];
                    indexA++;
                    indexB++;
                } else
                if(A[indexA]>B[indexB]) {
                    C[i] = B[indexB];
                    indexB++;
                } else
            if(A[indexA]<B[indexB]) {
                C[i] = A[indexA];
                indexA++;
            }
            if(indexB >= B.length || indexA >= A.length){
                break;
            }
        }
        for (int i = 0; i < C.length; i++) {
            System.out.println(C[i]);
        }







        //input 10 million record
        //output sum of all





    }
    public static Integer sum = 0;
    public static void main(String[] args) throws Exception {
        int arr [] = {1,2,3,4,5,6,7,8,9};
        int n = arr.length/10;

        Arrays.copyOfRange(arr,0,4);
            Process process
                    = new Process(Arrays.copyOfRange(arr,0,4));

        Process process2
                = new Process(Arrays.copyOfRange(arr,5,9));
        process.start();
        process2.join();
        process2.start();


        System.out.println(sum);
    }
    static class Process extends Thread {
        int arr [] ;
        public Process() {
        }
        public Process(int [] arr) {
            this.arr=arr;
        }

        public void run() {
            for (int i = 0; i <arr.length; i++) {
                System.out.println("i"+arr[i]);
                sum+=sum+arr[i];
            }
            System.out.println("Running Thread" + Thread.currentThread());
            System.out.println("Sum"+sum);
        }
    }


}