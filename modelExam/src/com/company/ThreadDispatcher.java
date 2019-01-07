package com.company;

import java.util.ArrayList;
import java.io.*;

public class ThreadDispatcher extends Thread
{
    ArrayList<Employee> employees = new ArrayList();
    int storedCapacity=0;


    public ThreadDispatcher(Company companie)
    {
        this.employees = companie.employees;
    }

    @Override public void run()
    {
        int k = 0;
        while(true)
        {
            if(this.storedCapacity != this.employees.size())
            {
                Employee current = this.employees.get(storedCapacity);
                System.out.println("New detected: "+current.name);
                this.storedCapacity++;

                k=0;

                try(FileWriter fw = new FileWriter("/Users/alex/desktop/myfile.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter out = new PrintWriter(bw))
                {
                    out.println(current.name + " " + current.getClass().getSimpleName());
                    //more code
                } catch (IOException e) {
                    //exception handling left as an exercise for the reader
                }
            }
            else
            {
                k+=5;
                System.out.println("ThreadDispatcher. " + k + " seconds elapsed since last detection.");
            }

            try {
                Thread.sleep(5000);                 //1000 milliseconds is one second.
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }


        }


    }
}
