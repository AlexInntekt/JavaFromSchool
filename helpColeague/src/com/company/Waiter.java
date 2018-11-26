package com.company;




import java.util.Random;


public class Waiter extends Thread {

    public static int incrementer=0;
    public Kitchen k;
    public String name;


    Waiter(Kitchen k, String waiter1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }




    @Override
    public void start() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public synchronized void run(){
        run();
    }
    public synchronized void submitOrder(){
        Random r=new Random();
        int nextInt = r.nextInt(10);
    }
}
