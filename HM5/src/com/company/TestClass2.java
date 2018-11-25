package com.company;

import java.util.Arrays;

public class TestClass2
{
    MySortedList<Double> list = new MySortedList<>();

    public void run()
    {
        //Add elements
        list.add(Double.valueOf(1));
        list.add(Double.valueOf(100));
        list.add(Double.valueOf(2));
        list.add(Double.valueOf(4));
        list.add(Double.valueOf(0));
        list.add(Double.valueOf(8));
        list.add(Double.valueOf(33));
        list.add(Double.valueOf(44));
        list.add(Double.valueOf(5));
        list.add(Double.valueOf(7));
        System.out.println(list);

        //Remove elements from index
        list.remove(2);
        System.out.println(list);

        //Get element with index
        System.out.println( list.getElementAt(0) );
        System.out.println( list.getElementAt(1) );

        //List Size
        System.out.println(list.size());


    }
}
