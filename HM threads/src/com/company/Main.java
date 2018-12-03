package com.company;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Method main() runs in thread " +
                Thread.currentThread().getName()); // (5) Current thread
        Counter one = new Counter("1", 10); // (6) Create a thread.
        Counter two = new Counter("2", 20); // (7) Create a thread.
        Counter three = new Counter("3", 34); // (7) Create a thread.
        Counter four= new Counter("4", 17); // (7) Create a thread.
        Counter five= new Counter("5", 5); // (7) Create a thread.
        System.out.println("Exit from main() method.");
    }
}


class Counter extends Thread {
    private int currentValue;
    private int totalSteps;

    public Counter(String threadName, int setTotalSteps)
    {
        super(threadName);
        currentValue = 0;
        totalSteps=setTotalSteps;
        System.out.println(this);

        start();
    }
    public int getValue() { return currentValue; }

    public void run() {
        try {
            while (currentValue < this.totalSteps) {
                System.out.println("Thread id "+getName()+" is at step "+(currentValue++)+" / "+this.totalSteps);
                Thread.sleep(50); // (4) Current thread sleeps.
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println("Exit from thread: " + getName());
    }
}
