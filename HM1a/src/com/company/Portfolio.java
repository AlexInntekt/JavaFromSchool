package com.company;

public class Portfolio
{
    private Share[]  shares = new Share[10];
    private int noShares;

    public Portfolio()
    {
        noShares = 0;
    }

    public void addShare(Share setv)
    {
        this.shares[this.noShares] = setv;
        this.noShares += 1;
    }

    public double computeSum()
    {
        double sum=0;

        for(int i=0; i<this.noShares; i++)
        {
            sum += this.shares[i].getValue();
        }

        return sum;
    }

}
