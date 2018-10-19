package com.company;

import java.io.IOException;

public class Main
{

    //the storable interface's signatures and the implementation of the file manager are not done!

    public static void main(String[] args)
    {
        Course ZE = new Course("Zealot Energy", Type.valueOf("Specialization"), Stream.valueOf("English"), 2);
        Course ME = new Course("Math for Engineering", Type.valueOf("Foundamental"), Stream.valueOf("English"), 4 );
        Course OOP = new Course("Object Oriented Programming", Type.valueOf("Discipline"), Stream.valueOf("English"),5);


        Contract contract = new Contract();
                 contract.addCourse(ZE);
                 contract.addCourse(ME);
                 contract.addCourse(OOP);

        contract.sort();
        contract.display();


//        try {
//            int a = 30, b = 0;
//            int c = a/b;  // cannot divide by zero
//            System.out.println ("Result = " + c);
//        }
//        catch(ArithmeticException e) {
//            System.out.println ("\n\n Can't divide a number by 0");
//        }




    }
}
