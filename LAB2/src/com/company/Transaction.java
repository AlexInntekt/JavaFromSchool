package com.company;
import java.util.Calendar;
import java.util.Date;

public final class Transaction
{
    private final long sum;
    private final String IBAN;

    Transaction(long csetSum, String csetiban)
    {
        this.sum = csetSum;
        this.IBAN = csetiban;
    }

    public long getSum()
    {
        return this.sum;
    }

    public String getIBAN()
    {
        return this.IBAN;
    }

    //private final Calendar date;
}
