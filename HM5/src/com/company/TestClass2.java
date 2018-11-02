package com.company;

import java.util.Arrays;

public class TestClass2
{
    MySortedList<Integer> list = new MySortedList<>();

    public void run()
    {
        //Add elements
        list.add(1);
        list.add(100);
        list.add(2);
        list.add(4);
        list.add(0);
        list.add(8);
        list.add(33);
        list.add(44);
        list.add(5);
        list.add(7);
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
