package com.company;

public class uithread implements Runnable
{
    Company c = new Company();

    public uithread(Company setc)
    {
        this.c = setc;
    }

    public void run()
    {
        Window wind = new Window(this.c);
        wind.setVisible(true);
    }

}
