package com.company;

public class Manager extends Employee
{
    public double bonus;

    public Manager(double setBonus, String setName)
    {
        super(setName);
        this.bonus = setBonus;
    }

    @Override public double getSalary()
    {
        return 7000;
    }
}
