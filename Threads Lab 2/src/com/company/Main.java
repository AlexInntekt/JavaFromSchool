package com.company;
import java.util.UUID;

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


          Sensor visual = new Sensor("visual");
          visual.start();

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