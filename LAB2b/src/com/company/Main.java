package com.company;
import java.util.GregorianCalendar;


public class Main {

    public static void main(String[] args)
    {
	    // write your code here

        GregorianCalendar cal1 = new GregorianCalendar(1996, 2, 4);
        GregorianCalendar cal2 = new GregorianCalendar(1983, 4, 28);

        Employee one = new Employee(124,"Robert", cal1);
        Employee two = new Employee(523, "Robert", cal2);

        System.out.print( one.compareTo(two) );


    }
}
