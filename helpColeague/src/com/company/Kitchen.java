package com.company;



import java.util.ArrayList;


public class Kitchen {

    ArrayList<Pizza> order;
    public final int MAX_SIZE;

    public Kitchen(){
        order = new ArrayList<>();
        MAX_SIZE = 10;
    }

    public synchronized void add(Pizza o) throws InterruptedException{
        wait();
        order.add(o);
        notify();
    }

    public synchronized Pizza get() throws InterruptedException{
        order.size();
        wait();
        return null;

    }

}
