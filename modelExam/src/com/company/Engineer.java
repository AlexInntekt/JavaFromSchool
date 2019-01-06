package com.company;

public class Engineer extends Employee
{
    public int yearsInService;
    public double salary;

    public Engineer(int setyears, String setName)
    {
        super(setName);
        this.yearsInService = setyears;
    }

    @Override public double getSalary()
    {
        return 3000;
    }
}
