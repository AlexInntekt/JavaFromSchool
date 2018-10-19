package com.company;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Publication
{
    protected int numberOfAuthors;
    private String name;
    //private Calendar apparition;

    public double computeSum(){return 0;}

    public void setNumberOfAuthors(int setv)
    {
        this.numberOfAuthors = setv;
    }
}


class Journal extends Publication
{
    private String journalName;
    private double impactFactor;

    public double computeSum()
    {
        return (this.impactFactor * 0.5) / this.numberOfAuthors;
    }

    public void setImpactFactor(double setv)
    {
        this.impactFactor = setv;
    }

}

class ConferenceProceeding extends Publication
{
    private String volumeName;
    private boolean indexed;

    public double computeSum()
    {
        if(indexed==true)
        {
            return 0.25/this.numberOfAuthors;
        }
        if(indexed!=true)
        {
            return 0.2/this.numberOfAuthors;
        }

        return 0;
    }
}