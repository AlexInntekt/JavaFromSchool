package com.company;

import java.util.Map;
import java.util.HashMap;



public class Main {

    public static void main(String[] args)
    {
        run();
    }

    public static void run() //ID method: #f8h29fh2819f
    {
        System.out.print("#f8h29fh2819f \n");
        System.out.print("System functional. \n");

        tester();

    }

    public static void tester() //ID method: #82g391fg9234gf9
    {
        System.out.print("#82g391fg9234gf9 Running testBankingAccountClass()\n");

        BankingAccount one = new BankingAccount("RO75829357", 400, typeOfCurrency.RON);
        BankingAccount two = new BankingAccount("EUR72935780", 2300, typeOfCurrency.EUR);
        BankingAccount three = new BankingAccount("USD7209357", 300, typeOfCurrency.USD);

        //System.out.println( one.compare(one,two) );

        user alex = new user("alex", "exampleOfEmail@gmail.com");
             alex.accounts.add(one);
             alex.accounts.add(two);
             alex.accounts.add(three);

        System.out.println("\n");

        System.out.println("\n Let's sort the accounts by IBANs (alphabetically);");
        alex.sortByIBAN();
        alex.display();

        System.out.println("\n Now let's sort the accounts by their sums: ");
        alex.sortBySum();
        alex.display();

        System.out.println("\n Let's sort the accounts by currency (alphabetically);");
        alex.sortByCurrency();
        alex.display();


        System.out.println("\nNow return a map with the amount for each currency: ");
        System.out.println( alex.returnMap() );


//        Map<typeOfCurrency,Double> hm =
//                new HashMap< typeOfCurrency,Double>();
//
//        hm.put(typeOfCurrency.EUR,Double.valueOf(20));
//
//        System.out.println("map: " + hm.get(typeOfCurrency.EUR));

    }
}
