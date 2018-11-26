package com.company;




public class Restaurant {
    public static void main(String[]args){
        Kitchen k=new Kitchen();
        Waiter w1=new Waiter(k, "waiter1");
        Waiter w2=new Waiter(k, "waiter2");
        Waiter w3=new Waiter(k, "waiter3");
        Waiter w4=new Waiter(k, "waiter4");
        Waiter w5=new Waiter(k, "waiter5");

        Cook c1=new Cook(k, "cook1");
        Cook c2=new Cook(k, "cook2");
        Cook c3=new Cook(k, "cook3");

        w1.start();
        w2.start();
        w3.start();
        w4.start();
        w5.start();

        c1.start();
        c2.start();
        c3.start();
    }

}