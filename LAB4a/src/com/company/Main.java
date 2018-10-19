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
	  ml.add(27);

	  ml.remove(4);

	  ml.parcurge();

	  int index=1;
	  System.out.print("At index we have:" + ml.getElementAt(index) );

        if(ml.isEmpty())
        {
            System.out.print("\nIt is empty!\n");
        }
        else
        {
            System.out.print("\nIt is not empty!\n");
        }

        System.out.print("The size of the list is: " + ml.size());


    }
}


