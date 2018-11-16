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

    @Override
    public int compare(final BankingAccount o)
    {
        int res = 0;

        double sumOne=0;
        double sumTwo=0;

        //here we convert all sums into euros and then compare the sums:
        if(this.currency==typeOfCurrency.RON)
        {
            sumOne = this.convertRONtoEUR(this.sum);
        }
        if(this.currency==typeOfCurrency.USD)
        {
            sumOne = this.convertUSDtoEUR(this.sum);
        }
        if(this.currency==typeOfCurrency.EUR)
        {
            sumOne = this.sum;
        }

        if(o.currency==typeOfCurrency.RON)
        {
            sumTwo = this.convertRONtoEUR(o.sum);
        }
        if(o.currency==typeOfCurrency.USD)
        {
            sumTwo = this.convertUSDtoEUR(o.sum);
        }
        if(o.currency==typeOfCurrency.EUR)
        {
            sumTwo = o.sum;
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
