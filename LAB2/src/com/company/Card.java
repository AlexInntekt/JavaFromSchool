package com.company;

public class Card
{
    private long amount;
    private Transaction[] transactions = new Transaction[20];
                int noTrans=0;
    private String IBAN;

    public void addTransaction(Transaction setv)
    {
        this.transactions[noTrans] = setv;
                          noTrans++;
    }

    public long getCurrentAmount()
    {
        long sum=0;

        for(int i=0; i<noTrans; i++)
        {
            sum += this.transactions[i].getSum();
        }

        return sum;
    }

    public String getIBAN()
    {
        return this.IBAN;
    }

    public long getAmount()
    {
        return this.amount;
    }
}
