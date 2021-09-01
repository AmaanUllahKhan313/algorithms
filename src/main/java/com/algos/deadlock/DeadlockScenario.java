package com.algos.deadlock;

public class DeadlockScenario {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("started");
        Thread.currentThread().join();

        Thread t1 = new Thread();

        System.out.println("Deadlock released");


    }


}
