package com.algos.queue;
class QueueUsingArray {
    int front, rear, size;
    int capacity;
    int array[];
    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }
    public static void main(String[] args){
        QueueUsingArray queue = new QueueUsingArray(1000);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.dequeue()
                + " dequeued from queue\n");
        System.out.println(queue.dequeue()
                + " dequeued from queue\n");
        System.out.println(queue.dequeue()
                + " dequeued from queue\n");
    }
    void enqueue(int item){
        this.rear = (this.rear + 1)
                % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
    }
    int dequeue(){
        int item = this.array[this.front];
        this.front = (this.front + 1)
                % this.capacity;
        this.size = this.size - 1;
        return item;
    }
}
