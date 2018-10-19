package com.company;

public class Main
{

    public static void main(String[] args)
    {
	  MyList<Integer> ml = new MyList();


	  //System.out.print( ml.first.Data + "\n");

	  ml.add(30);
	  ml.add(4);
	  ml.add(5);

	  ml.parcurge();

    }
}
