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
}
