package com.company;

import java.util.*;

public class Main
{
    public enum Procesor{I1, I2, I3};

    public static void main(String[] args)
    {
        Procesor mypro = Procesor.I1;
//        System.out.print(mypro);
        division mydiv = new division();

//        try
//        {
//            System.out.println(mydiv.result(3,0));
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
//


//        myrunner aRunner = new myrunner();
//
//        Thread t = new Thread(aRunner);
//        t.start();


        Map<Integer,String> sm = new TreeMap<Integer, String>();
        sm.put(10,"a");
        sm.put(2,"z");

        sm.put(5,"c");

        Iterator it = sm.entrySet().iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }




	// write your code here
    }
}
