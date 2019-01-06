package com.company;

public class uithread implements Runnable
{
    public void run()
    {
        Window wind = new Window();
        wind.setVisible(true);
    }

}
