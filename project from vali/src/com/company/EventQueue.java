package com.company;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Valentin
 */
public class EventQueue {

    LinkedList<SensorEvent> l= new LinkedList();
    static int MAX_CAPACITY=100;
    final Lock lock = new ReentrantLock();
    final Condition notFull = lock.newCondition();
    final Condition notEmpty = lock.newCondition();

    public void add(SensorEvent e) throws InterruptedException {
        lock.lock();
        try{
            while(l.size()>=MAX_CAPACITY)
                notFull.await();

            l.add(e);
        } finally {
            lock.unlock();
        }
    }

    public Object remove() throws InterruptedException {
        lock.lock();
        SensorEvent p;
        try {
            while(l.size()==0)
                notEmpty.await();
            wait(50);
            p = l.pop();
            notFull.signal();
            return p;
        } finally {
            lock.unlock();
        }

    }

}
