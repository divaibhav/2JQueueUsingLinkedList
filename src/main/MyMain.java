package main;

import implementation.MyQueue;

import java.util.Random;

public class MyMain {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(15);
        queue.enqueue(53);
        queue.enqueue(45);
        for (int  i = 0;  i < 5;  i++) {//O(n)
            queue.enqueue(new Random().nextInt(500));
            queue.traverse();//O(n)
        }

    }
}
