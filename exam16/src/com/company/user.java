package com.company;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;


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

    public void sortBySum()
    {
        Collections.sort(this.accounts, (BankingAccount p1, BankingAccount p2) -> p1.compare(p1,p2));
    }

    public void display()
    {
        for(int i=0; i<this.accounts.size(); i++)
        {
            BankingAccount x = this.accounts.get(i);

            System.out.println(x.IBAN + "  "+ this.accounts.get(i).sum + " " + this.accounts.get(i).currency + " (or " + this.accounts) ;
        }
    }


}
