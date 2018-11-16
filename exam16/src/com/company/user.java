package com.company;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class user
{
    String username;
    String email;
    List<BankingAccount> accounts = new ArrayList<BankingAccount>();

    public user(String setUsername, String setEmail)
    {
        this.username = setUsername;
        this.email = setEmail;
    }

    public void  addAccount(BankingAccount newAccount)
    {
        this.accounts.add(newAccount);
    }

    public void sortByIBAN()
    {
        Collections.sort(this.accounts, (BankingAccount p1, BankingAccount p2) -> p1.IBAN.compareTo(p2.IBAN));
    }

    public void sortByCurrency()
    {
        Collections.sort(this.accounts, (BankingAccount p1, BankingAccount p2) -> p1.currency.compareTo(p2.currency));
    }


    public void sortBySum()
    {
        Collections.sort(this.accounts, (BankingAccount p1, BankingAccount p2) -> p1.compare(p1,p2));
    }

    public void display()
    {
        for(int i=0; i<this.accounts.size(); i++)
        {
            BankingAccount x = this.accounts.get(i);

            System.out.println(x.IBAN + "  "+ x.sum + " " + x.currency + " (or " + x.sumInEuros() + " euros)") ;
        }
    }

    public Map<typeOfCurrency, Double> returnMap()
    {
        Map<typeOfCurrency,Double> hm =
                new HashMap< typeOfCurrency,Double>();

        for(int i=0; i<this.accounts.size(); i++)
        {
            BankingAccount current = this.accounts.get(i);

            if(current.currency==typeOfCurrency.EUR)
            {
                double oldSum=0;

                if(hm.get(typeOfCurrency.EUR)!=null)
                {
                    oldSum=hm.get(typeOfCurrency.EUR);
                }

                hm.put(typeOfCurrency.EUR,current.sum+ oldSum);
            }


            if(current.currency==typeOfCurrency.USD)
            {

                double oldSum=0;

                if(hm.get(typeOfCurrency.USD)!=null)
                {
                    oldSum=hm.get(typeOfCurrency.USD);
                }

                hm.put(typeOfCurrency.USD,current.sum+ oldSum);
            }


            if(current.currency==typeOfCurrency.RON)
            {

                double oldSum=0;

                if(hm.get(typeOfCurrency.RON)!=null)
                {
                    oldSum=hm.get(typeOfCurrency.RON);
                }

                hm.put(typeOfCurrency.RON,current.sum+ oldSum);
            }
        }

        return hm;
    }


}
