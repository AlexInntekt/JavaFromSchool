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
import com.company.SensorEvent.Type;

/**
 *
 * @author Valentin
 */
public class Sensor extends Thread{
    EventQueue eventQueue;
    static int id =0;

    public Sensor(EventQueue eventQueue){
        this.eventQueue = eventQueue;
    }

    public SensorEvent newSensorEvent(){
        id++;
        Random r = new Random();
        int typeNumber = r.nextInt(3);
        Type[] type = SensorEvent.Type.values();
        SensorEvent event = new SensorEvent(type[typeNumber], Calendar.getInstance(), id);
        return event;
    }

    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sensor.class.getName()).log(Level.SEVERE, null, ex);
            }
            SensorEvent event = newSensorEvent();
            try {
                eventQueue.add(event);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sensor.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Sensor " + event.toString() + " added");
        }
    }
}
