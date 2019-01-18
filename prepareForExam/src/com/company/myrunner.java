package com.company;

 class myrunner implements Runnable
{
    public void run()
    {
        try
        {
            System.out.println( Thread.currentThread().getName() );
            System.out.println("Helliaa");
            Thread.sleep(250);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
