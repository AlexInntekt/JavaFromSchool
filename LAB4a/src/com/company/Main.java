package com.company;

public class Main
{

    public static void main(String[] args)
    {
	  MyList ml = new MyList('a');


	  //System.out.print( ml.first.Data + "\n");

	  ml.add('b');
	  ml.add(30);
	  ml.add(4);

	  ml.parcurge();

    }
}
