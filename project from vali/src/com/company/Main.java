/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import static com.company.Sensor.id;

/**
 *
 * @author Valentin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        EventQueue eventQueue = new EventQueue();
//        Sensor sensor1 = new Sensor(eventQueue);
//        sensor1.start();
//        Dispatcher dispacher1 = new Dispatcher(eventQueue);
//        dispacher1.start();

        BlockingQueue<SensorEvent> bg = new ArrayBlockingQueue<>(10);
        ExecutorService executor=Executors.newFixedThreadPool(20);

        for(int i=0; i<4; i++){
            executor.execute(new Runnable(){
                @Override
                public void run(){
                    while(true){
                        id++;
                        Random r = new Random();
                        int typeNumber = r.nextInt(3);
                        SensorEvent.Type[] type = SensorEvent.Type.values();
                        SensorEvent event = new SensorEvent(type[typeNumber], Calendar.getInstance(), id);
                        try {
                            bg.put(event);
                            System.out.println(event.toString() + " added");
                        } catch (InterruptedException ex) {
                            Logger.getLogger(this.getClass().getCanonicalName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            });
        }

        for(int i=0; i<4; i++){
            executor.execute(new Runnable(){
                @Override
                public void run(){
                    while(true){
                        try {
                            System.out.println(bg.take() + " removed");
                        } catch (InterruptedException ex) {
                            Logger.getLogger(this.getClass().getCanonicalName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            });
        }


    }


}
