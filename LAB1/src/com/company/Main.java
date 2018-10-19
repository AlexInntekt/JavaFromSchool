package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.print("Running main() \n");


        CreditCard instance = new CreditCard();

        instance.DisplayInfo();
        instance.withdraw(200);



    }
}

