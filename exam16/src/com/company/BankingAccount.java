package com.company;

import java.util.Comparator;

enum typeOfCurrency
{
    EUR, RON, USD
}

public class BankingAccount implements Comparator<BankingAccount>
{
    String IBAN;
    double sum;
    typeOfCurrency currency;

    //empty constructor, without initializers
    public BankingAccount(){}

    //constructor with default values
    public BankingAccount(String setIBAN, double setSum, typeOfCurrency setCurrency)
    {
        this.IBAN = setIBAN;
        this.sum = setSum;
        this.currency = setCurrency;
    }

    public double convertRONtoEUR(double ronSum)
    {
        double res = ronSum/4.67;
        return res;
    }

    public double convertUSDtoEUR(double usdSum)
    {
        double res = usdSum/1.13;
        return res;
    }



    public int compareIBANs(final BankingAccount o, final BankingAccount u)
    {
        int res=0;

        return o.IBAN.compareTo(u.IBAN);
    }

    @Override
    public int compare(final BankingAccount o, final BankingAccount u)
    {
        int res = 0;

        double sumOne=0;
        double sumTwo=0;

        //here we convert all sums into euros and then compare the sums:
        if(o.currency==typeOfCurrency.RON)
        {
            sumOne = o.convertRONtoEUR(o.sum);
        }
        if(o.currency==typeOfCurrency.USD)
        {
            sumOne = o.convertUSDtoEUR(o.sum);
        }
        if(o.currency==typeOfCurrency.EUR)
        {
            sumOne = o.sum;
        }

        if(u.currency==typeOfCurrency.RON)
        {
            sumTwo = this.convertRONtoEUR(u.sum);
        }
        if(u.currency==typeOfCurrency.USD)
        {
            sumTwo = this.convertUSDtoEUR(u.sum);
        }
        if(u.currency==typeOfCurrency.EUR)
        {
            sumTwo = u.sum;
        }

        //System.out.println("SumOne:" + sumOne);
        //System.out.println("sumTwo:" + sumTwo);

        if(sumOne<sumTwo)
        {
            res=-1;
        }
        if(sumOne==sumTwo)
        {
            res=0;
        }
        if(sumOne>sumTwo)
        {
            res=1;
        }

        return res;

    }


}
