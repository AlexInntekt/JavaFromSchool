package com.company;

public class Main
{

    public static void main(String[] args)
    {
        MyList<Integer> list = new MyList<>();

        //Add elements
        list.add(1);
        list.add(2);
        list.add(3);
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
