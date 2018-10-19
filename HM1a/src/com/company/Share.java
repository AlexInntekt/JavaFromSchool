package com.company;

public class Share
{
    private Company itsCompany;
    private double itsValue;

    public Share(double csetvalue, Company csetcompany)
    {
        this.itsCompany = csetcompany;
        this.itsValue = csetvalue;
    }


    public void setValue(double setv)
    {
        this.itsValue = setv;
    }
    public double getValue()
    {
        return this.itsValue;
    }


    public void setCompany(Company setv)
    {
        this.itsCompany = setv;
    }
    public Company getCompany()
    {
        return this.itsCompany;
    }

}
