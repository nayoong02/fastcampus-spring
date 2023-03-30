package org.example.counter;

public class Counter implements Runnable {
    private int count = 0;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getValue() {
        return count;
    }

    public void run() {
        this.increment();
        System.out.println("Value for Thread After increment " + Thread.currentThread().getName() + " " + this.getValue()); // 1

        this.decrement();
        System.out.println("Value for Thread At last " + Thread.currentThread().getName() + " " + this.getValue()); // 0
    }
}
