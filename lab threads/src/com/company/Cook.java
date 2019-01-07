package com.company;

import java.awt.*;
import java.util.*;

public class Cook extends Thread
{
    LinkedList zonaDeLucru =  new LinkedList();

    public Cook(LinkedList zona)
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

            Pizza noua = new Pizza(2);
            this.zonaDeLucru.push(noua);

            System.out.println("Cook: Allora! Una pizza e pronta! ");
        }

    }

}
