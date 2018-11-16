package com.company;


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

        BankingAccount one = new BankingAccount("RO75829357", 440, typeOfCurrency.RON);
        BankingAccount two = new BankingAccount("RO72935780", 2300, typeOfCurrency.EUR);

        System.out.println( one.compare(one,two) );

        user alex = new user("alex", "exampleOfEmail@gmail.com");
             alex.accounts.add(one);
             alex.accounts.add(two);

        //System.out.println( one.convertUSDtoEUR(20) );
        //alex.accounts.sort(Co.comparing(e -> e.getFirstName()));

    }
}
