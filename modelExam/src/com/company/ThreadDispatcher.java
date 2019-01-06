package com.company;

import java.util.ArrayList;

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
        while(true)
        {
            if(this.storedCapacity != this.employees.size())
            {
                System.out.println("New detected: "+this.employees.get(storedCapacity).name);
                this.storedCapacity++;
            }
        }


    }
}
