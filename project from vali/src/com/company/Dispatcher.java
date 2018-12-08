package com.company;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Calendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Valentin
 */
public class Dispatcher extends Thread{
    EventQueue eventQueue;
    static int id =0;

    public Dispatcher(EventQueue eventQueue){
        this.eventQueue = eventQueue;
    }

    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sensor.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                System.out.println("Sensor " + eventQueue.remove().toString() + "removed");
            } catch (InterruptedException ex) {
                Logger.getLogger(Dispatcher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
