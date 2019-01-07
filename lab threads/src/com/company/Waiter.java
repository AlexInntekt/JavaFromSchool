package com.company;

import java.util.*;
import java.awt.*;

public class Waiter extends Thread
{
    LinkedList zonaDeLucru =  new LinkedList();

    public Waiter(LinkedList zona)
    {
        this.zonaDeLucru=zona;
    }

    @Override public void run()
    {
        while(true)
        {
            try
            {
                Thread.sleep(2000);                 //1000 milliseconds is one second.
            } catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }

            if(!this.zonaDeLucru.isEmpty())
            {
                System.out.print("Waiter: " +  this.zonaDeLucru.pop() );
            }




        }

    }

}
