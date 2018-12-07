package com.company;
import java.util.UUID;
import java.util.Queue;
import java.util.LinkedList;

public class Main
{

    public static void main(String[] args)
    {
//	// write your code here
//        Runnable task = () -> {
//            String threadName = Thread.currentThread().getName();
//            System.out.println("Hello " + threadName);
//        };
//
//        task.run();
//
//        Thread thread = new Thread(task);
//        thread.start();
//
//        System.out.println("Done!");


          runner();

    }

    Queue<Event> q = new LinkedList<>();
    

    public static void runner()
    {



        Sensor visual = new Sensor("visual");
        Sensor motric = new Sensor("motric");
        visual.start();
        motric.start();
    }

}

class Sensor extends Thread {

    String type;

    public Sensor(String setType)
    {
        this.type=setType;
    }



    public void run()
    {
        try
        {
            while(true)
            {
                Event currentEvent = new Event(this.type);
                
                System.out.println("Sensor "+Thread.currentThread().getName()+" triggered event with the id: "+currentEvent.id);
                Thread.sleep((long)(Math.random() * 8000));
            }
        } catch (InterruptedException e)
        {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println("Exit from thread: " + getName());
    }

}